package com.smartbox.jobster.service.cvparser.batch;

import com.smartbox.jobster.service.cvparser.batch.dto.ZipExtractionResult;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipExtractionResult.AcceptedEntry;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipRejectedEntry;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/**
 * Streaming ZIP / single-file validator and extractor for the V2 batch pipeline.
 * <p>
 * Stateless, thread-safe. Every guard lives here (no validation leaks into the orchestrator):
 * <ul>
 *   <li>Magic-byte check — refuses files claiming to be ZIP but starting with anything other than
 *       {@code PK} local-file-header markers (0x50 0x4B 0x03/0x05/0x07).</li>
 *   <li>Compressed size cap — declared by caller, enforced before entering the decompression loop.</li>
 *   <li>Per-entry size cap — <em>silently skips</em> individual CVs beyond
 *       {@code maxEntryBytes} (not surfaced to UI; emits a DEBUG log only). Product
 *       decision: recruiters uploading large-mixed archives shouldn't be bothered with
 *       "file too large" noise — oversized CVs are typically images/scans the parser
 *       can't extract useful text from anyway.</li>
 *   <li>Cumulative uncompressed cap — running total across accepted entries. Stops early.</li>
 *   <li>Compression ratio — per-entry uncompressed:compressed. Normal office docs are &lt;10:1;
 *       anything exceeding {@code maxCompressionRatio} is a probable ZIP bomb.</li>
 *   <li>Path traversal — entries containing {@code ..}, leading {@code /} or {@code \}, or
 *       UNC-like prefixes are rejected.</li>
 *   <li>Allowed extensions — only pdf/doc/docx/rtf reach the parser.</li>
 *   <li>Duplicate SHA-256 — within a single batch, the second occurrence is skipped
 *       (parser workers charge once).</li>
 *   <li>Empty entries — zero-byte payloads are rejected.</li>
 *   <li>Read errors — per-entry {@link IOException}s are logged and the entry rejected, not
 *       propagated; the remaining entries still get a chance to process.</li>
 * </ul>
 */
@Component
public class ZipExtractor {

    private static final Logger log = LoggerFactory.getLogger(ZipExtractor.class);

    /** Pre-allocated buffer size for per-entry decompression; avoids reallocations for small CVs. */
    private static final int BUFFER_SIZE = 16 * 1024;

    private final ZipSecurityLimits limits;

    public ZipExtractor(ZipSecurityLimits limits) {
        this.limits = limits;
    }

    // ------------------------------------------------------------------------
    // Public API
    // ------------------------------------------------------------------------

    /**
     * @return {@code true} when the first bytes match the ZIP local-file-header magic.
     * @see ZipMagic#isZipSignature(byte[]) — the shared implementation this delegates to.
     */
    public boolean isZipMagic(byte[] bytes) {
        return ZipMagic.isZipSignature(bytes);
    }

    /**
     * Extract & validate every entry in {@code zipBytes}. Never throws for bad entries —
     * they become {@link ZipRejectedEntry} records. Only throws when the archive itself is
     * unreadable or exceeds the global compressed cap.
     *
     * @throws ZipExtractionException archive too large, corrupt, or non-ZIP
     */
    public ZipExtractionResult extract(byte[] zipBytes) throws ZipExtractionException {
        if (zipBytes == null || zipBytes.length == 0) {
            throw new ZipExtractionException("Archive is empty");
        }
        if (zipBytes.length > limits.maxCompressedBytes()) {
            throw new ZipExtractionException(
                    "Archive exceeds max compressed size (" + limits.maxCompressedBytes() + " bytes)");
        }
        if (!isZipMagic(zipBytes)) {
            throw new ZipExtractionException("Not a ZIP archive (magic bytes mismatch)");
        }

        List<AcceptedEntry> accepted = new ArrayList<>();
        List<ZipRejectedEntry> rejected = new ArrayList<>();
        Set<String> seenHashes = new HashSet<>();
        long cumulativeUncompressed = 0L;

        try (ByteArrayInputStream bais = new ByteArrayInputStream(zipBytes);
             ZipInputStream zis = new ZipInputStream(bais)) {

            ZipEntry entry;
            while ((entry = nextEntryQuiet(zis, rejected)) != null) {
                if (entry.isDirectory()) {
                    zis.closeEntry();
                    continue;
                }

                if (accepted.size() + rejected.size() >= limits.maxEntries()) {
                    log.warn("ZIP has more than {} entries; stopping extraction early",
                            limits.maxEntries());
                    break;
                }

                EntryProcessResult result = processEntry(zis, entry, seenHashes, cumulativeUncompressed);
                if (result.accepted != null) {
                    accepted.add(result.accepted);
                    cumulativeUncompressed += result.accepted.content().length;
                } else if (result.rejected != null) {
                    rejected.add(result.rejected);
                }
                zis.closeEntry();

                if (cumulativeUncompressed > limits.maxUncompressedBytes()) {
                    log.warn("Cumulative uncompressed size {} exceeded cap {}; stopping",
                            cumulativeUncompressed, limits.maxUncompressedBytes());
                    break;
                }
            }
        } catch (ZipException e) {
            throw new ZipExtractionException("Corrupt ZIP archive: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new ZipExtractionException("Unable to read ZIP archive: " + e.getMessage(), e);
        }

        return new ZipExtractionResult(accepted, rejected, cumulativeUncompressed);
    }

    /**
     * Lightweight pre-scan that counts every non-directory entry in {@code zipBytes}. Only
     * local file headers are read — entry payloads are skipped — so this is O(number of
     * entries) and allocates no buffers for content. Safe to call from the UI thread before
     * submitting the batch (used by the overflow-confirmation flow in {@code CvBatchDialog}).
     * <p>
     * Note: this returns the <em>total</em> entry count, not a type-filtered one. The goal is
     * a "is this ZIP too big to process silently?" signal — any files whose extension is not
     * in the allow-list will be rejected during the real extraction and surfaced to the user
     * in the rejections list.
     *
     * @throws ZipExtractionException when the archive is not a ZIP, empty, or corrupt
     */
    public int countEntries(byte[] zipBytes) throws ZipExtractionException {
        if (zipBytes == null || zipBytes.length == 0) {
            throw new ZipExtractionException("Archive is empty");
        }
        if (!isZipMagic(zipBytes)) {
            throw new ZipExtractionException("Not a ZIP archive (magic bytes mismatch)");
        }
        int count = 0;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(zipBytes);
             ZipInputStream zis = new ZipInputStream(bais)) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (!entry.isDirectory()) count++;
                zis.closeEntry();
            }
        } catch (ZipException e) {
            throw new ZipExtractionException("Corrupt ZIP archive: " + e.getMessage(), e);
        } catch (IOException e) {
            throw new ZipExtractionException("Unable to scan ZIP archive: " + e.getMessage(), e);
        }
        return count;
    }

    /**
     * Validate a single (non-ZIP) CV upload as though it were a one-entry batch.
     * Runs the same extension + size + empty-content guards.
     *
     * @throws ZipExtractionException when the file fails any hard check (throwing here is deliberate
     *                                — a single upload cannot partially succeed like a ZIP can)
     */
    public ZipExtractionResult extractSingle(byte[] content, String filename) throws ZipExtractionException {
        if (content == null || content.length == 0) {
            throw new ZipExtractionException("File is empty");
        }
        if (content.length > limits.maxEntryBytes()) {
            throw new ZipExtractionException(
                    "File exceeds per-entry size cap (" + limits.maxEntryBytes() + " bytes)");
        }
        String safeName = sanitizeEntryName(filename);
        String ext = FilenameUtils.getExtension(safeName).toLowerCase();
        if (!limits.isAllowedExtension(ext)) {
            throw new ZipExtractionException("Unsupported file type: " + ext);
        }

        String hash = sha256Hex(content);
        AcceptedEntry accepted = new AcceptedEntry(safeName, ext, content, hash);
        return new ZipExtractionResult(List.of(accepted), List.of(), content.length);
    }

    // ------------------------------------------------------------------------
    // Internal
    // ------------------------------------------------------------------------

    /**
     * One entry's processing outcome — {@link #ok(AcceptedEntry)} feeds {@code accepted},
     * {@link #reject(ZipRejectedEntry)} surfaces to the UI rejections list, and
     * {@link #skip()} drops the entry silently (no UI row, no metric — only a DEBUG log).
     * {@code accepted} and {@code rejected} are never both non-null.
     */
    private record EntryProcessResult(AcceptedEntry accepted, ZipRejectedEntry rejected) {
        static EntryProcessResult ok(AcceptedEntry entry) {
            return new EntryProcessResult(entry, null);
        }

        static EntryProcessResult reject(ZipRejectedEntry entry) {
            return new EntryProcessResult(null, entry);
        }

        /** Entry dropped silently — caller's {@code if/else if} over accepted/rejected is a no-op. */
        static EntryProcessResult skip() {
            return new EntryProcessResult(null, null);
        }
    }

    private EntryProcessResult processEntry(ZipInputStream zis,
                                            ZipEntry entry,
                                            Set<String> seenHashes,
                                            long cumulativeSoFar) {
        String rawName = entry.getName();

        if (containsPathTraversal(rawName)) {
            return EntryProcessResult.reject(ZipRejectedEntry.of(rawName, ZipRejectedEntry.Reason.PATH_TRAVERSAL));
        }

        String safeName = sanitizeEntryName(rawName);
        String ext = FilenameUtils.getExtension(safeName).toLowerCase();
        if (!limits.isAllowedExtension(ext)) {
            return EntryProcessResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.UNSUPPORTED_TYPE));
        }

        // Enforce the per-entry cap both on the declared size (fast-fail) and at read time
        // (catches bombs that lie in the header). Either trip emits an ENTRY_TOO_LARGE rejection
        // so the recruiter sees exactly which files were dropped — silent skipping would let a
        // bomb hide behind "no rejection entry shown".
        long declaredSize = entry.getSize();
        if (declaredSize > 0 && declaredSize > limits.maxEntryBytes()) {
            log.debug("Rejecting oversized ZIP entry '{}' (declared={} > cap={})",
                    safeName, declaredSize, limits.maxEntryBytes());
            return EntryProcessResult.reject(
                    ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.ENTRY_TOO_LARGE,
                            "declared=" + declaredSize));
        }

        byte[] content;
        try {
            content = readBounded(zis, limits.maxEntryBytes(),
                    limits.maxUncompressedBytes() - cumulativeSoFar, declaredSize);
        } catch (IOException e) {
            log.warn("I/O error reading entry '{}': {}", safeName, e.getMessage());
            return EntryProcessResult.reject(
                    ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.READ_ERROR, e.getMessage()));
        } catch (EntryTooLargeException e) {
            log.debug("Rejecting oversized ZIP entry '{}' during read: {}", safeName, e.getMessage());
            return EntryProcessResult.reject(
                    ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.ENTRY_TOO_LARGE, e.getMessage()));
        }

        if (content.length == 0) {
            return EntryProcessResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.EMPTY_CONTENT));
        }

        // Compression ratio — only meaningful when we know compressed size.
        long compressedSize = entry.getCompressedSize();
        if (compressedSize > 0) {
            double ratio = (double) content.length / (double) compressedSize;
            if (ratio > limits.maxCompressionRatio()) {
                return EntryProcessResult.reject(
                        ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.COMPRESSION_RATIO,
                                String.format("ratio=%.1f", ratio)));
            }
        }

        String hash = sha256Hex(content);
        if (!seenHashes.add(hash)) {
            return EntryProcessResult.reject(
                    ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.DUPLICATE_HASH));
        }

        return EntryProcessResult.ok(new AcceptedEntry(safeName, ext, content, hash));
    }

    /**
     * Read {@code zis} into a byte buffer, enforcing both the per-entry cap and the remaining
     * cumulative budget. Throws as soon as either cap is crossed to avoid runaway decompression.
     */
    private byte[] readBounded(ZipInputStream zis, long perEntryCap, long cumulativeRemaining, long declaredSize)
            throws IOException, EntryTooLargeException {
        long effectiveCap = Math.min(perEntryCap, Math.max(0, cumulativeRemaining));
        if (effectiveCap <= 0) throw new EntryTooLargeException("cumulative budget exhausted");

        // Right-size the buffer when the ZIP entry declares its size — avoids repeated internal
        // reallocations inside ByteArrayOutputStream for multi-MB entries (L2).
        long initial = declaredSize > 0 ? Math.min(declaredSize, effectiveCap) : BUFFER_SIZE;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream((int) Math.max(initial, BUFFER_SIZE));
        byte[] chunk = new byte[BUFFER_SIZE];
        long total = 0;
        int read;
        while ((read = zis.read(chunk)) > 0) {
            total += read;
            if (total > effectiveCap) {
                throw new EntryTooLargeException("cap=" + effectiveCap);
            }
            buffer.write(chunk, 0, read);
        }
        return buffer.toByteArray();
    }

    /** Forward over a corrupt entry header without failing the whole archive. */
    private ZipEntry nextEntryQuiet(ZipInputStream zis, List<ZipRejectedEntry> rejected) throws IOException {
        try {
            return zis.getNextEntry();
        } catch (ZipException e) {
            log.warn("Skipping corrupt ZIP entry header: {}", e.getMessage());
            rejected.add(ZipRejectedEntry.of("<unknown>", ZipRejectedEntry.Reason.READ_ERROR, e.getMessage()));
            return null;
        }
    }

    // ------------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------------

    /**
     * Reject entry names that could escape the extraction directory. Defence-in-depth: the
     * extractor never writes to disk (each entry is returned as bytes), but paths still flow
     * into logs, filenames, and downstream parsers, so malicious values must be caught here.
     * <p>
     * Rejects: null/empty, NUL or control characters, POSIX absolute paths, Windows drive
     * letters, Windows UNC paths ({@code \\server\share}), any {@code ..} segment, and any
     * name whose {@link Path#normalize()} escapes the synthetic root.
     */
    private static boolean containsPathTraversal(String entryName) {
        if (entryName == null || entryName.isEmpty()) return true;
        for (int i = 0; i < entryName.length(); i++) {
            char c = entryName.charAt(i);
            if (c == 0 || (c < 0x20 && c != '\t')) return true;
        }
        String normalised = entryName.replace('\\', '/');
        if (normalised.startsWith("/")) return true;                              // absolute POSIX
        if (normalised.startsWith("//")) return true;                             // UNC variant
        if (normalised.length() >= 2 && normalised.charAt(1) == ':') return true; // Windows drive (C:)
        for (String part : normalised.split("/")) {
            if ("..".equals(part)) return true;
        }
        try {
            Path normalisedPath = Path.of("/__zip_root__").resolve(normalised).normalize();
            if (!normalisedPath.startsWith(Path.of("/__zip_root__"))) return true;
        } catch (InvalidPathException e) {
            return true;
        }
        return false;
    }

    private static String sanitizeEntryName(String rawName) {
        if (rawName == null || rawName.isEmpty()) return "cv";
        return FilenameUtils.getName(rawName.replace('\\', '/'));
    }

    private static String sha256Hex(byte[] bytes) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(bytes);
            return HexFormat.of().formatHex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            // SHA-256 is a mandatory JVM algorithm — this branch can never run in practice.
            throw new IllegalStateException("SHA-256 unavailable", e);
        }
    }

    // ------------------------------------------------------------------------
    // Exceptions
    // ------------------------------------------------------------------------

    /** Thrown when the archive itself is rejected (wrong magic, too big, corrupt). */
    public static class ZipExtractionException extends Exception {
        public ZipExtractionException(String message) {
            super(message);
        }

        public ZipExtractionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /** Internal marker used by {@link #readBounded(ZipInputStream, long, long)}. */
    private static final class EntryTooLargeException extends Exception {
        EntryTooLargeException(String message) {
            super(message);
        }
    }
}

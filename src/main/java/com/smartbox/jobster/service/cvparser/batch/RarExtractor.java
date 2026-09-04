package com.smartbox.jobster.service.cvparser.batch;

import com.github.junrar.Archive;
import com.github.junrar.exception.RarException;
import com.github.junrar.rarfile.FileHeader;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipExtractionResult;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipRejectedEntry;
import org.apache.commons.io.FilenameUtils;
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

/**
 * Bounded RAR 4 extractor for the CV batch pipeline. It mirrors ZIP's entry-level checks and
 * never writes archive contents to disk. Password-protected, multi-volume and RAR 5 archives
 * are rejected because the web upload contains only one byte stream and no password prompt.
 */
@Component
public class RarExtractor {

    private final ZipSecurityLimits limits;
    private final Rar5Extractor rar5Extractor;

    public RarExtractor(ZipSecurityLimits limits, Rar5Extractor rar5Extractor) {
        this.limits = limits;
        this.rar5Extractor = rar5Extractor;
    }

    public boolean isRarMagic(byte[] bytes) {
        return RarMagic.isRarSignature(bytes);
    }

    public ZipExtractionResult extract(byte[] rarBytes) throws ZipExtractor.ZipExtractionException {
        if (RarMagic.isRar5Signature(rarBytes)) return rar5Extractor.extract(rarBytes);
        validateArchive(rarBytes);

        List<ZipExtractionResult.AcceptedEntry> accepted = new ArrayList<>();
        List<ZipRejectedEntry> rejected = new ArrayList<>();
        Set<String> seenHashes = new HashSet<>();
        long cumulativeUncompressed = 0;

        try (Archive archive = new Archive(new ByteArrayInputStream(rarBytes))) {
            rejectUnsupportedArchive(archive);
            for (Object candidate : archive.getFileHeaders()) {
                FileHeader header = (FileHeader) candidate;
                if (header.isDirectory()) continue;
                if (accepted.size() + rejected.size() >= limits.maxEntries()) break;

                EntryResult result = extractEntry(archive, header, seenHashes, cumulativeUncompressed);
                if (result.accepted() != null) {
                    accepted.add(result.accepted());
                    cumulativeUncompressed += result.accepted().content().length;
                } else if (result.rejected() != null) {
                    rejected.add(result.rejected());
                }
                if (cumulativeUncompressed >= limits.maxUncompressedBytes()) break;
            }
        } catch (ZipExtractor.ZipExtractionException e) {
            throw e;
        } catch (IOException | RarException e) {
            throw new ZipExtractor.ZipExtractionException("Unable to read RAR archive: " + e.getMessage(), e);
        }

        return new ZipExtractionResult(accepted, rejected, cumulativeUncompressed);
    }

    private void validateArchive(byte[] rarBytes) throws ZipExtractor.ZipExtractionException {
        if (rarBytes == null || rarBytes.length == 0) {
            throw new ZipExtractor.ZipExtractionException("Archive is empty");
        }
        if (rarBytes.length > limits.maxCompressedBytes()) {
            throw new ZipExtractor.ZipExtractionException("Archive exceeds max compressed size ("
                    + limits.maxCompressedBytes() + " bytes)");
        }
        if (!isRarMagic(rarBytes)) {
            throw new ZipExtractor.ZipExtractionException("Not a RAR archive (magic bytes mismatch)");
        }
    }

    private void rejectUnsupportedArchive(Archive archive) throws RarException, ZipExtractor.ZipExtractionException {
        if (archive.isPasswordProtected()) {
            throw new ZipExtractor.ZipExtractionException("Password-protected RAR archives are not supported");
        }
        if (archive.getMainHeader().isMultiVolume()) {
            throw new ZipExtractor.ZipExtractionException("Multi-volume RAR archives are not supported");
        }
    }

    private EntryResult extractEntry(Archive archive, FileHeader header, Set<String> seenHashes,
                                     long cumulativeSoFar) {
        String rawName = header.getFileName();
        if (containsPathTraversal(rawName)) {
            return EntryResult.reject(ZipRejectedEntry.of(rawName, ZipRejectedEntry.Reason.PATH_TRAVERSAL));
        }

        String safeName = FilenameUtils.getName(rawName.replace('\\', '/'));
        String extension = FilenameUtils.getExtension(safeName).toLowerCase();
        if (!limits.isAllowedExtension(extension)) {
            return EntryResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.UNSUPPORTED_TYPE));
        }

        long declaredSize = header.getFullUnpackSize();
        long remaining = limits.maxUncompressedBytes() - cumulativeSoFar;
        if (declaredSize > limits.maxEntryBytes() || declaredSize > remaining || remaining <= 0) {
            return EntryResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.ENTRY_TOO_LARGE));
        }

        byte[] content;
        try {
            BoundedOutputStream output = new BoundedOutputStream(Math.min(limits.maxEntryBytes(), remaining));
            archive.extractFile(header, output);
            content = output.toByteArray();
        } catch (RarException e) {
            ZipRejectedEntry.Reason reason = e.getCause() instanceof EntryTooLargeException
                    ? ZipRejectedEntry.Reason.ENTRY_TOO_LARGE : ZipRejectedEntry.Reason.READ_ERROR;
            return EntryResult.reject(ZipRejectedEntry.of(safeName, reason, e.getMessage()));
        }

        if (content.length == 0) {
            return EntryResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.EMPTY_CONTENT));
        }
        if (header.getFullPackSize() > 0
                && (double) content.length / header.getFullPackSize() > limits.maxCompressionRatio()) {
            return EntryResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.COMPRESSION_RATIO));
        }

        String hash = sha256Hex(content);
        if (!seenHashes.add(hash)) {
            return EntryResult.reject(ZipRejectedEntry.of(safeName, ZipRejectedEntry.Reason.DUPLICATE_HASH));
        }
        return EntryResult.accept(new ZipExtractionResult.AcceptedEntry(safeName, extension, content, hash));
    }

    private static boolean containsPathTraversal(String entryName) {
        if (entryName == null || entryName.isEmpty()) return true;
        String normalized = entryName.replace('\\', '/');
        if (normalized.startsWith("/") || normalized.startsWith("//")
                || (normalized.length() >= 2 && normalized.charAt(1) == ':')) return true;
        for (String part : normalized.split("/")) {
            if ("..".equals(part)) return true;
        }
        try {
            return !Path.of("/__rar_root__").resolve(normalized).normalize().startsWith(Path.of("/__rar_root__"));
        } catch (InvalidPathException e) {
            return true;
        }
    }

    private static String sha256Hex(byte[] bytes) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 unavailable", e);
        }
    }

    private record EntryResult(ZipExtractionResult.AcceptedEntry accepted, ZipRejectedEntry rejected) {
        static EntryResult accept(ZipExtractionResult.AcceptedEntry entry) {
            return new EntryResult(entry, null);
        }

        static EntryResult reject(ZipRejectedEntry entry) {
            return new EntryResult(null, entry);
        }
    }

    private static final class BoundedOutputStream extends ByteArrayOutputStream {
        private final long maxBytes;

        private BoundedOutputStream(long maxBytes) {
            this.maxBytes = maxBytes;
        }

        @Override
        public synchronized void write(int value) {
            requireCapacity(1);
            super.write(value);
        }

        @Override
        public synchronized void write(byte[] bytes, int offset, int length) {
            requireCapacity(length);
            super.write(bytes, offset, length);
        }

        private void requireCapacity(int nextBytes) {
            if ((long) count + nextBytes > maxBytes) throw new EntryTooLargeException();
        }
    }

    private static final class EntryTooLargeException extends RuntimeException {
    }
}

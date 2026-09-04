package com.smartbox.jobster.service.cvparser.batch;

import be.stef.rar.ExtractionResult;
import be.stef.rar.Unrar5j;
import be.stef.rar5.Rar5Reader;
import be.stef.rar5.blocks.Rar5FileBlock;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipExtractionResult;
import com.smartbox.jobster.service.cvparser.batch.dto.ZipRejectedEntry;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.List;
import java.util.Set;

/**
 * Bounded RAR5 extractor. The upstream library is path-based, therefore each accepted entry is
 * extracted into a fresh temporary directory, checked, read and immediately deleted.
 */
@Component
public class Rar5Extractor {

    private final ZipSecurityLimits limits;

    public Rar5Extractor(ZipSecurityLimits limits) {
        this.limits = limits;
        be.stef.rar5.Rar5Extractor.showProgress = false;
    }

    public ZipExtractionResult extract(byte[] rarBytes) throws ZipExtractor.ZipExtractionException {
        Path temporaryDirectory = null;
        try {
            Rar5Reader reader = readArchive(rarBytes);
            temporaryDirectory = Files.createTempDirectory("jobster-cv-rar5-");
            Path archivePath = temporaryDirectory.resolve("upload.rar");
            Files.write(archivePath, rarBytes);
            return extractEntries(reader, archivePath, temporaryDirectory);
        } catch (IOException e) {
            throw new ZipExtractor.ZipExtractionException("Unable to read RAR5 archive: " + e.getMessage(), e);
        } finally {
            deleteTemporaryDirectory(temporaryDirectory);
        }
    }

    private Rar5Reader readArchive(byte[] rarBytes) throws ZipExtractor.ZipExtractionException {
        Rar5Reader reader = new Rar5Reader();
        if (!reader.read(rarBytes)) {
            throw new ZipExtractor.ZipExtractionException("Corrupt RAR5 archive");
        }
        if (reader.hasEncryptedHeaders()) {
            throw new ZipExtractor.ZipExtractionException("Password-protected RAR archives are not supported");
        }
        if (reader.getMainArchive() != null && reader.getMainArchive().isVolume()) {
            throw new ZipExtractor.ZipExtractionException("Multi-volume RAR archives are not supported");
        }
        return reader;
    }

    private ZipExtractionResult extractEntries(Rar5Reader reader, Path archivePath, Path temporaryDirectory) {
        List<ZipExtractionResult.AcceptedEntry> accepted = new ArrayList<>();
        List<ZipRejectedEntry> rejected = new ArrayList<>();
        Set<String> seenHashes = new HashSet<>();
        long cumulativeSize = 0;

        for (Rar5FileBlock entry : reader.getFileBlocks()) {
            if (entry.isDirectory() || accepted.size() + rejected.size() >= limits.maxEntries()) continue;
            EntryResult result = extractEntry(archivePath, temporaryDirectory, entry, seenHashes, cumulativeSize);
            if (result.accepted() != null) {
                accepted.add(result.accepted());
                cumulativeSize += result.accepted().content().length;
            } else if (result.rejected() != null) {
                rejected.add(result.rejected());
            }
            if (cumulativeSize >= limits.maxUncompressedBytes()) break;
        }
        return new ZipExtractionResult(accepted, rejected, cumulativeSize);
    }

    private EntryResult extractEntry(Path archivePath, Path temporaryDirectory, Rar5FileBlock entry,
                                     Set<String> seenHashes, long cumulativeSize) {
        String filename = entry.getFileName();
        if (!isSafeFilename(filename)) return EntryResult.reject(filename, ZipRejectedEntry.Reason.PATH_TRAVERSAL, null);
        String safeName = FilenameUtils.getName(filename.replace('\\', '/'));
        if (entry.isEncrypted()) return EntryResult.reject(safeName, ZipRejectedEntry.Reason.READ_ERROR, "encrypted");
        if (entry.isSplit()) return EntryResult.reject(safeName, ZipRejectedEntry.Reason.READ_ERROR, "multi-volume entry");
        if (!limits.isAllowedExtension(FilenameUtils.getExtension(safeName))) {
            return EntryResult.reject(safeName, ZipRejectedEntry.Reason.UNSUPPORTED_TYPE, null);
        }

        long remaining = limits.maxUncompressedBytes() - cumulativeSize;
        if (entry.isUnknownSize() || entry.getUnpackedSize() <= 0 || entry.getUnpackedSize() > limits.maxEntryBytes()
                || entry.getUnpackedSize() > remaining) {
            return EntryResult.reject(safeName, ZipRejectedEntry.Reason.ENTRY_TOO_LARGE, null);
        }
        if (entry.getDataSize() > 0 && (double) entry.getUnpackedSize() / entry.getDataSize() > limits.maxCompressionRatio()) {
            return EntryResult.reject(safeName, ZipRejectedEntry.Reason.COMPRESSION_RATIO, null);
        }

        Path entryDirectory = temporaryDirectory.resolve("entry-" + seenHashes.size());
        try {
            Files.createDirectories(entryDirectory);
            ExtractionResult extraction = Unrar5j.extract(archivePath.toString(), entryDirectory.toString(), null, filename);
            Path extractedFile = findExtractedFile(entryDirectory);
            if (!extraction.isSuccess() || extractedFile == null) {
                return EntryResult.reject(safeName, ZipRejectedEntry.Reason.READ_ERROR, "could not extract entry");
            }
            long size = Files.size(extractedFile);
            if (size == 0) return EntryResult.reject(safeName, ZipRejectedEntry.Reason.EMPTY_CONTENT, null);
            if (size > limits.maxEntryBytes() || size > remaining) {
                return EntryResult.reject(safeName, ZipRejectedEntry.Reason.ENTRY_TOO_LARGE, null);
            }
            byte[] content = Files.readAllBytes(extractedFile);
            String hash = sha256Hex(content);
            if (!seenHashes.add(hash)) return EntryResult.reject(safeName, ZipRejectedEntry.Reason.DUPLICATE_HASH, null);
            return EntryResult.accept(new ZipExtractionResult.AcceptedEntry(safeName,
                    FilenameUtils.getExtension(safeName).toLowerCase(), content, hash));
        } catch (Exception e) {
            return EntryResult.reject(safeName, ZipRejectedEntry.Reason.READ_ERROR, e.getMessage());
        } finally {
            deleteTemporaryDirectory(entryDirectory);
        }
    }

    private static Path findExtractedFile(Path directory) throws IOException {
        try (var files = Files.walk(directory)) {
            return files.filter(Files::isRegularFile).findFirst().orElse(null);
        }
    }

    private static boolean isSafeFilename(String filename) {
        if (filename == null || filename.isBlank()) return false;
        String normalized = filename.replace('\\', '/');
        return !normalized.startsWith("/") && !normalized.startsWith("//") && !normalized.contains("../")
                && !(normalized.length() >= 2 && normalized.charAt(1) == ':');
    }

    private static String sha256Hex(byte[] content) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(content));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 unavailable", e);
        }
    }

    private static void deleteTemporaryDirectory(Path directory) {
        if (directory == null) return;
        try (var paths = Files.walk(directory)) {
            paths.sorted(Comparator.reverseOrder()).forEach(path -> {
                try {
                    Files.deleteIfExists(path);
                } catch (IOException ignored) {
                    // The OS will clean up a failed temporary file; extraction data is never retained deliberately.
                }
            });
        } catch (IOException ignored) {
            // Same best-effort cleanup policy as above.
        }
    }

    private record EntryResult(ZipExtractionResult.AcceptedEntry accepted, ZipRejectedEntry rejected) {
        static EntryResult accept(ZipExtractionResult.AcceptedEntry entry) {
            return new EntryResult(entry, null);
        }

        static EntryResult reject(String filename, ZipRejectedEntry.Reason reason, String detail) {
            return new EntryResult(null, ZipRejectedEntry.of(filename, reason, detail));
        }
    }
}

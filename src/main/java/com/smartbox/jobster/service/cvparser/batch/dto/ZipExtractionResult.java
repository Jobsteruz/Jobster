package com.smartbox.jobster.service.cvparser.batch.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * Immutable report returned by the extractor: accepted CV payloads + per-entry rejection log.
 * The accepted list is guaranteed to satisfy every configured limit (size, extension, ratio, path).
 */
public record ZipExtractionResult(
        List<AcceptedEntry> accepted,
        List<ZipRejectedEntry> rejected,
        long totalUncompressedBytes
) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public ZipExtractionResult {
        accepted = accepted == null ? List.of() : List.copyOf(accepted);
        rejected = rejected == null ? List.of() : List.copyOf(rejected);
    }

    /**
     * A validated, ready-to-upload entry.
     * <p>
     * <b>Ownership:</b> entries are built by {@link com.smartbox.jobster.service.cvparser.batch.ZipExtractor}
     * and consumed by {@link com.smartbox.jobster.service.cvparser.batch.CvBatchOrchestrator}
     * on the same thread. No mutation expected — accessor returns the stored array directly to
     * avoid doubling peak heap on a 500 MB uncompressed batch.
     *
     * @param filename the sanitized entry name (basename only, no directory components)
     * @param extension lower-case dot-less file extension
     * @param content   raw bytes of the CV payload — do not mutate
     * @param sha256    hex SHA-256 digest of {@code content}; used for per-batch dedup
     */
    public record AcceptedEntry(
            String filename,
            String extension,
            byte[] content,
            String sha256
    ) implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        public AcceptedEntry {
            // Null coalesced to empty; caller is trusted not to mutate the array afterwards.
            content = content == null ? new byte[0] : content;
        }
    }

    public int acceptedCount() {
        return accepted.size();
    }

    public int rejectedCount() {
        return rejected.size();
    }
}

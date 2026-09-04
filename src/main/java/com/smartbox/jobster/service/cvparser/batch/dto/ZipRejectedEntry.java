package com.smartbox.jobster.service.cvparser.batch.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * A file that the {@code ZipExtractor} refused to forward to the parser.
 * Stored on the batch aggregate so the UI can surface rejection reasons per file.
 *
 * @param filename original entry name from the ZIP (sanitized for path traversal)
 * @param reason   machine-readable rejection cause — used to look up an i18n message
 * @param detail   optional human-readable extra context (never shown as-is; for logs / debug)
 */
public record ZipRejectedEntry(
        String filename,
        Reason reason,
        String detail
) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Mutually-exclusive rejection categories. UI maps each to an i18n key.
     */
    public enum Reason {
        /** Filename extension not in the configured allow-list (pdf/doc/docx/rtf). */
        UNSUPPORTED_TYPE,
        /** Entry uncompressed size exceeds {@code maxEntryBytes}. */
        ENTRY_TOO_LARGE,
        /** Entry content length is zero. */
        EMPTY_CONTENT,
        /** Entry path contains {@code ..}, absolute prefix, or other traversal markers. */
        PATH_TRAVERSAL,
        /** Uncompressed:compressed ratio exceeds the ZIP-bomb threshold. */
        COMPRESSION_RATIO,
        /** Duplicate SHA-256 hash within the same batch. */
        DUPLICATE_HASH,
        /** Catch-all for I/O errors while reading this entry (followed by next). */
        READ_ERROR
    }

    public static ZipRejectedEntry of(String filename, Reason reason) {
        return new ZipRejectedEntry(filename, reason, null);
    }

    public static ZipRejectedEntry of(String filename, Reason reason, String detail) {
        return new ZipRejectedEntry(filename, reason, detail);
    }
}

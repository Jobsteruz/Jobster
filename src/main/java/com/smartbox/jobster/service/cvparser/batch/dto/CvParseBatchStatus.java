package com.smartbox.jobster.service.cvparser.batch.dto;

/**
 * Lifecycle of a CV batch (ZIP or single-file) import.
 *
 * <pre>
 *   QUEUED ──► EXTRACTING ──► PARSING ──► COMPLETED  (all children ended in APPLIED)
 *       │          │             │
 *       │          │             └────► PARTIAL     (some children FAILED)
 *       │          │
 *       │          └───► FAILED         (invalid archive / extraction error)
 *       │
 *       └───► CANCELLED                 (user cancelled before completion; terminal)
 * </pre>
 */
public enum CvParseBatchStatus {
    /** Just created, orchestrator not yet picked up. */
    QUEUED,
    /** ZIP being decompressed and entries validated. */
    EXTRACTING,
    /** All accepted entries submitted to parser; awaiting webhooks. */
    PARSING,
    /** Every child terminal and at least one applied successfully — no failures. */
    COMPLETED,
    /** Every child terminal but some failed / did not apply. */
    PARTIAL,
    /** Fatal error before children could be created (invalid ZIP, I/O, etc.). */
    FAILED,
    /** User cancelled via the dialog. Pending children are left to finish on the parser side
     *  but their webhook results are ignored. */
    CANCELLED;

    /**
     * @return {@code true} when no further status transitions are expected.
     */
    public boolean isTerminal() {
        return this == COMPLETED
                || this == PARTIAL
                || this == FAILED
                || this == CANCELLED;
    }
}

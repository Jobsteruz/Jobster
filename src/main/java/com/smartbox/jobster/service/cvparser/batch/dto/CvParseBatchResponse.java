package com.smartbox.jobster.service.cvparser.batch.dto;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

/**
 * Projection of {@link CvParseBatch} used by the Vaadin dialog for polling. Kept minimal to keep
 * 2-second refreshes cheap; large internal collections are summarized (rejected entries include
 * reason for UI, but ids of child jobs are not shipped).
 */
public record CvParseBatchResponse(
        String batchId,
        CvParseBatchStatus status,
        UUID vacancyId,
        UUID responsibleUserId,
        String sourceFilename,
        boolean zipSource,
        int totalFiles,
        int completedCount,
        int failedCount,
        int appliedCount,
        int applyFailedCount,
        int duplicatesSkipped,
        /** Total rejection count (includes overflow). Use for counts; {@link #rejectedAtExtraction} for the displayable subset. */
        int rejectedCount,
        /** Number of rejections not stored inline due to the aggregate cap — renders as "... and N more". */
        int rejectedOverflowCount,
        List<ZipRejectedEntry> rejectedAtExtraction,
        String error,
        Instant createdAt,
        Instant startedAt,
        Instant finishedAt
) {

    public static CvParseBatchResponse from(CvParseBatch batch) {
        if (batch == null) return null;
        int storedRejections = batch.getRejectedAtExtraction() == null
                ? 0
                : batch.getRejectedAtExtraction().size();
        return new CvParseBatchResponse(
                batch.getBatchId(),
                batch.getStatus(),
                batch.getVacancyId(),
                batch.getResponsibleUserId(),
                batch.getSourceFilename(),
                batch.isZipSource(),
                batch.getTotalFiles(),
                batch.getCompletedCount(),
                batch.getFailedCount(),
                batch.getAppliedCount(),
                batch.getApplyFailedCount(),
                batch.getDuplicatesSkipped(),
                storedRejections + batch.getRejectedOverflowCount(),
                batch.getRejectedOverflowCount(),
                batch.getRejectedAtExtraction() == null ? List.of() : List.copyOf(batch.getRejectedAtExtraction()),
                batch.getError(),
                batch.getCreatedAt(),
                batch.getStartedAt(),
                batch.getFinishedAt()
        );
    }

    /** @return processed = completed+failed (excludes not-yet-terminated and duplicates). */
    public int processedCount() {
        return completedCount + failedCount;
    }

    /** @return aggregate progress 0..100 for a progress bar. */
    public double progressPercent() {
        if (totalFiles == 0) return status != null && status.isTerminal() ? 100d : 0d;
        return Math.min(100d, processedCount() * 100d / totalFiles);
    }
}

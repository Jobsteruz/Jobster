package com.smartbox.jobster.view.applicant.mapping;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Aggregated outcome of an Applicant bulk-import run — surfaced in the dashboard bell as
 * "total / success / fail" with an itemised list of failures.
 */
@Getter
@Setter
public class ApplicantImportResult {

    /** Number of rows attempted (Excel rows minus the header). */
    private int total;

    /** Number of rows that resulted in a persisted Applicant. */
    private int success;

    /** Failed rows — capped at a sensible size in the notification renderer, not here. */
    private final List<Failure> failures = new ArrayList<>();

    public void addFailure(UUID id, String name, String reason) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getFailCount() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record Failure(UUID id, String name, String reason) {}
}

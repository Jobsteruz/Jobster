package com.smartbox.jobster.service.restservices.partnerintegration;

import java.util.List;

/**
 * Outcome of the Department platformId back-fill import (the "Match" button on the Department list view).
 *
 * @param updated      departments whose platformId was set/updated and saved
 * @param notFound     rows whose ID was not found in the current tenant's departments
 * @param skipped      rows skipped because ID or platformId was empty, or ID was not a valid UUID
 * @param notFoundIds  sample of IDs that were not found (capped, for the result message)
 * @param errorMessage non-null only when the whole import failed (e.g. file could not be read)
 */
public record DepartmentMatchResult(
        int updated,
        int notFound,
        int skipped,
        List<String> notFoundIds,
        String errorMessage) {

    public static DepartmentMatchResult error(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isSuccess() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

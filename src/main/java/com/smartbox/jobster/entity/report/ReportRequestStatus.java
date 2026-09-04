package com.smartbox.jobster.entity.report;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.jetbrains.annotations.Nullable;

/**
 * Lifecycle of a {@code ReportRequest}.
 * <p>
 * QUEUED — accepted locally, POST to report-sender is pending or in flight.<br>
 * IN_PROGRESS — report-sender acknowledged the task.<br>
 * DONE — callback received, file attached.<br>
 * FAILED — callback reported failure, or local send failed after retries.
 */
public enum ReportRequestStatus implements EnumClass<String> {

    QUEUED("QUEUED"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE"),
    FAILED("FAILED");

    private final String id;

    ReportRequestStatus(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ReportRequestStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.reports.managerperformance;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/**
 * One row of the Manager Performance Report grid.
 * <p>
 * The service appends a TOTAL row LAST: {@code managerId == null && managerName == null}, counts summed
 * over every manager and {@code avgDays} = the weighted average (sum of seconds / answered rows), not
 * the mean of the per-row averages. Rows come out of the Hazelcast cache and are shared between
 * sessions — the view never mutates them.
 * <p>
 * No {@code @JmixId} on purpose (same as {@code RecruiterPeriodReportRowDTO}): the TOTAL row has no
 * manager id, and Jmix gives id-less DTOs a generated entry id that keeps the container and the Excel
 * exporter working.
 */
@JmixEntity(name = "jb_ManagerPerformanceRowDTO")
@Getter
@Setter
public class ManagerPerformanceRowDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID managerId;
    private String managerName;
    /** Candidates sent to the manager in the period — one per stage-history row, i.e. per send. */
    private Integer total;
    /** Sent, no verdict yet, and the candidate still sits on that stage. */
    private Integer awaiting;
    private Integer approved;
    private Integer rejected;
    /** Manager verdict RESERVED — neither approved nor rejected; not shown by default. */
    private Integer reserved;
    /** Rows behind {@link #avgDays}: answered, response not earlier than the send. */
    private Integer answered;
    /** Average days from send to verdict; null when nothing was answered. */
    private Double avgDays;

    public ManagerPerformanceRowDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManagerPerformanceRowDTO(UUID managerId, String managerName,
                                    int total, int awaiting, int approved, int rejected, int reserved,
                                    int answered, Double avgDays) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

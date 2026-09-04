package com.smartbox.jobster.entity.report;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * Tracks one order from a user for an async Excel export.
 * The actual work happens inside {@code report-sender-service} — this row is only a mirror
 * plus the final FileRef once the callback lands.
 */
@JmixEntity
@Table(name = "JB_REPORT_REQUEST", indexes = {
        @Index(name = "IDX_JB_REPORT_REQUEST_STATUS", columnList = "STATUS"),
        @Index(name = "IDX_JB_REPORT_REQUEST_EXTERNAL_ID", columnList = "EXTERNAL_TASK_ID")
})
@Entity(name = "jb_ReportRequest")
@Getter
@Setter
public class ReportRequest extends StandardTenantEntity {

    @InstanceName
    @Column(name = "REPORT_NAME", length = 500)
    private String reportName;

    @Column(name = "REPORT_CODE", nullable = false)
    private String reportCode;

    /** JSON map of filters sent to the worker (questionnaireId, date range, etc.). */
    @Lob
    @Column(name = "PARAMETERS")
    private String parameters;

    @Column(name = "STATUS", length = 20)
    private String status;

    /** UUID of the matching row in report-sender-service's {@code report_task} table. */
    @Column(name = "EXTERNAL_TASK_ID")
    private String externalTaskId;

    @Column(name = "ROW_COUNT")
    private Integer rowCount;

    @Column(name = "RESULT_FILE_NAME", length = 500)
    private String resultFileName;

    @Column(name = "RESULT_FILE", length = 1024)
    private FileRef resultFile;

    @Lob
    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

    @JoinColumn(name = "REQUESTED_BY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User requestedBy;

    @Column(name = "REQUESTED_AT")
    private OffsetDateTime requestedAt;

    @Column(name = "STARTED_AT")
    private OffsetDateTime startedAt;

    @Column(name = "FINISHED_AT")
    private OffsetDateTime finishedAt;

    @JmixProperty
    public ReportRequestStatus getRequestStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setRequestStatus(ReportRequestStatus s) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

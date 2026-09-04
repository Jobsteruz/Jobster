package com.smartbox.jobster.entity.integration;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Dedupe ledger: one row per Outlook message whose attachments we've already imported, so a
 * re-delivered Graph change-notification (or a message that fires several notifications) doesn't
 * create duplicate Applicants. Checked + written by {@code OutlookMailQueueListener}
 * (check-then-insert after the attachments are queued — a tiny concurrent-double-delivery race can
 * still create a duplicate review draft, which is low harm and can be tightened with a unique
 * constraint later).
 */
@JmixEntity
@Table(name = "JB_PROCESSED_MAIL_MESSAGE", indexes = {
        @Index(name = "IDX_PMM_MESSAGE", columnList = "MESSAGE_ID")
})
@Entity(name = "jb_ProcessedMailMessage")
@Getter
@Setter
public class ProcessedMailMessage extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 7031744660637820304L;

    @InstanceName
    @Column(name = "MESSAGE_ID", length = 512)
    private String messageId;

    @Column(name = "INTEGRATED_USER_ID")
    private UUID integratedUserId;

    @Column(name = "PROCESSED_DATE")
    private OffsetDateTime processedDate;
}

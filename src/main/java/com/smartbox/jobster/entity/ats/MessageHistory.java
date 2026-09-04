package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_MESSAGE_HISTORY", indexes = {
        @Index(name = "IDX_JB_MESSAGE_HISTORY_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_MESSAGE_HISTORY_APPLICANT", columnList = "APPLICANT_ID"),
        @Index(name = "IDX_JB_MESSAGE_HISTORY_STAGE_HISTORY", columnList = "KANBAN_STAGE_HISTORY_ID"),
        @Index(name = "IDX_JB_MESSAGE_HISTORY_MESSAGE", columnList = "MESSAGE_ID"),
        @Index(name = "IDX_JB_MESSAGE_HISTORY_TENANT_UNREAD", columnList = "TENANT_ID, UNREAD, APPLICANT_ID")
})
@Entity(name = "jb_MessageHistory")
@Getter
@Setter
public class MessageHistory extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 6952297161543169184L;

    @Column(name = "BODY_")
    @Lob
    private String body;

    @Column(name = "PLATFORM")
    private String platform;

    @JoinColumn(name = "APPLICANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicant;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    /**
     * The kanban transition that caused a notification to be sent to a manager.
     * Null for existing candidate conversations and mass messages.
     */
    @JoinColumn(name = "KANBAN_STAGE_HISTORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStageHistory stageHistory;

    @JoinColumn(name = "MESSAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Message message;

    @Column(name = "FILE_", length = 1024)
    private FileRef file;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Column(name = "MSG_ID")
    private String msgId;

    @Column(name = "UNREAD")
    private Boolean unread;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FileType getFileType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setFileType(FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

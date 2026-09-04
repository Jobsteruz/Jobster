package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_EVENT", indexes = {
        @Index(name = "IDX_JB_EVENT_APPLICANT", columnList = "APPLICANT_ID"),
        @Index(name = "IDX_JB_EVENT_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_EVENT_SLOT", columnList = "SLOT_ID"),
        @Index(name = "IDX_JB_EVENT_PLATFORM_ID", columnList = "PLATFORM_ID"),
        @Index(name = "IDX_JB_EVENT_TENANT", columnList = "TENANT_ID")
})
@Entity(name = "jb_Event")
@Getter
@Setter
public class Event extends ParentRef implements Serializable {
    private static final long serialVersionUID = -9058661905777474625L;

    @Column(name = "START_TIME")
    private OffsetDateTime startTime;

    @Column(name = "END_TIME")
    private OffsetDateTime endTime;

    @Column(name = "EVENT_ID", length = 1024)
    private String eventId;

    @JoinColumn(name = "APPLICANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicant;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "PRIORITY")
    private String priority;

    @JoinColumn(name = "SLOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TimeSlot slot;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID", length = 1024)
    private String platformId;

    @Column(name = "LAST_SYNC_SOURCE")
    private String lastSyncSource;

    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "GOOGLE_MEET")
    private Boolean googleMeet;

    @Column(name = "MEET_LINK", length = 512)
    private String meetLink;

    @JmixProperty
    public String getPriorityColor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Priority getPriority() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPriority(Priority priority) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SyncSource getLastSyncSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLastSyncSource(SyncSource lastSyncSource) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
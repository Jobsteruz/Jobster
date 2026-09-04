package com.smartbox.jobster.entity.ui;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.kanban.EventResponse;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.FileRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_NOTIFICATION", indexes = {
        @Index(name = "IDX_JB_NOTIFICATION_FROM", columnList = "FROM_ID"),
        @Index(name = "IDX_JB_NOTIFICATION_TO_USER", columnList = "TO_USER_ID"),
        @Index(name = "IDX_JB_NOTIFICATION_TO_COMPANY", columnList = "TO_COMPANY_ID"),
        @Index(name = "IDX_JB_NOTIFICATION_EVENT", columnList = "EVENT_ID")
})
@Entity(name = "jb_Notification")
@Getter
@Setter
public class Notification extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8919930765170486332L;

    @JoinColumn(name = "FROM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User from;

    @JoinColumn(name = "TO_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User toUser;

    @JoinColumn(name = "TO_COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company toCompany;

    @Column(name = "MESSAGE")
    @Lob
    private String message;

    @Column(name = "MEDIA", length = 1024)
    private FileRef media;

    @Column(name = "MEDIA_TYPE")
    private String mediaType;

    @Column(name = "SENT_TIME")
    private OffsetDateTime sentTime;

    @Column(name = "READ_TIME")
    private OffsetDateTime readTime;

    @Column(name = "UNREAD")
    private Boolean unread = Boolean.TRUE;

    /**
     * The meeting this notification asks the recipient to confirm. Set only when the manager was
     * invited with "request confirmation from manager" on — it is what tells the mobile app to
     * render the accept/decline buttons under the message instead of plain text.
     */
    @JoinColumn(name = "EVENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;

    /**
     * The answer already given, so a notification the manager has replied to shows the outcome
     * rather than the buttons again. Mirrors
     * {@code KanbanStageHistory.managerEventResponse}, which is the value the rest of the app reads.
     */
    @Column(name = "EVENT_RESPONSE")
    private String eventResponse;

    public FileType getMediaType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setMediaType(FileType mediaType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EventResponse getEventResponse() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setEventResponse(EventResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
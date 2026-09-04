package com.smartbox.jobster.entity.kanban;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.ExitReason;
import com.smartbox.jobster.entity.hrm.RequestCancelReason;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_KANBAN_STAGE_HISTORY", indexes = {
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_KANBAN", columnList = "KANBAN_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_FROM_STAGE", columnList = "FROM_STAGE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_TO_STAGE", columnList = "TO_STAGE_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_ENTITY_ID", columnList = "ENTITY_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_USER", columnList = "USER_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_MANAGER", columnList = "MANAGER_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_CANCEL_REASON", columnList = "CANCEL_REASON_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_EVENT", columnList = "EVENT_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_REQUEST_CANCEL_REASON", columnList = "REQUEST_CANCEL_REASON_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_EXIT_REASON", columnList = "EXIT_REASON_ID"),
        @Index(name = "IDX_JB_KANBAN_STAGE_HISTORY_EVENT_CANCEL_REASON", columnList = "EVENT_CANCEL_REASON_ID")
})
@Entity(name = "jb_KanbanStageHistory")
@Getter
@Setter
public class KanbanStageHistory extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 1385643006261577371L;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @JoinColumn(name = "FROM_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage fromStage;

    @JoinColumn(name = "TO_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage toStage;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    @Column(name = "QUIZ_RESULT")
    private String quizResult;

    @JoinColumn(name = "MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee manager;

    @Column(name = "MANAGER_RESPONSE_DATE")
    private OffsetDateTime managerResponseDate;

    @Column(name = "MANAGER_COMMENT")
    @Lob
    private String managerComment;

    @JoinColumn(name = "CANCEL_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CancelReason cancelReason;

    @JoinColumn(name = "REQUEST_CANCEL_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestCancelReason requestCancelReason;

    @JoinColumn(name = "EVENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Event event;

    @JoinColumn(name = "EXIT_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExitReason exitReason;

    @JoinColumn(name = "EVENT_CANCEL_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private EventCancelReason eventCancelReason;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "EVENT_RESPONSE")
    private String eventResponse;

    @Column(name = "MANAGER_EVENT_RESPONSE")
    private String managerEventResponse;

    @Column(name = "MANAGER_EVENT_RESPONSE_DATE")
    private OffsetDateTime managerEventResponseDate;

    public PersonStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(PersonStatus status) {
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

    public EventResponse getManagerEventResponse() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setManagerEventResponse(EventResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
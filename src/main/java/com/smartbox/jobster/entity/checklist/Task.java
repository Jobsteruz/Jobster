package com.smartbox.jobster.entity.checklist;

import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.checklist.template.TaskTemplate;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_TASK", indexes = {
        @Index(name = "IDX_JB_TASK_CHECKLIST", columnList = "CHECKLIST_ID"),
        @Index(name = "IDX_JB_TASK_ASSIGNED_NOTIFICATION", columnList = "ASSIGNED_NOTIFICATION_ID"),
        @Index(name = "IDX_JB_TASK_TEMPLATE", columnList = "TEMPLATE_ID"),
        @Index(name = "IDX_JB_TASK_CANCEL_REASON", columnList = "CANCEL_REASON_ID")
})
@Entity(name = "jb_Task")
@Getter
@Setter
public class Task extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 2663534882498979766L;

    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskTemplate template;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CHECKLIST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Checklist checklist;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "DUE_DATE")
    private OffsetDateTime dueDate;

    @Column(name = "COMPLETED")
    private Boolean completed;

    @JoinColumn(name = "CANCEL_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskCancelReason cancelReason;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "ASSIGNED_ENTITY")
    private String assignedEntity;

    @Column(name = "ASSIGNED_ID")
    private UUID assignedId;

    @Column(name = "ASSIGNED_DEFAULT")
    private String assignedDefault;

    @JoinColumn(name = "ASSIGNED_NOTIFICATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate assignedNotification;

    public Priority getPriority() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPriority(Priority priority) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Double getScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AssignedDefault getAssignedDefault() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAssignedDefault(AssignedDefault assignedDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.entity.checklist.template;

import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.checklist.AssignedDefault;
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
import java.util.UUID;

@JmixEntity
@Table(name = "JB_TASK_TEMPLATE", indexes = {
        @Index(name = "IDX_JB_TASK_TEMPLATE_CHECKLIST", columnList = "CHECKLIST_ID"),
        @Index(name = "IDX_JB_TASK_TEMPLATE_ASSIGNED_NOTIFICATION", columnList = "ASSIGNED_NOTIFICATION_ID")
})
@Entity(name = "jb_TaskTemplate")
@Getter
@Setter
public class TaskTemplate extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -5857490131929522685L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CHECKLIST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ChecklistTemplate checklist;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "DUE_DAY")
    private Integer dueDay;

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

    public AssignedDefault getAssignedDefault() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAssignedDefault(AssignedDefault assignedDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.entity.checklist;

import com.smartbox.jobster.entity.checklist.template.ChecklistTemplate;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_CHECKLIST", indexes = {
        @Index(name = "IDX_JB_CHECKLIST_STAGE", columnList = "STAGE_ID"),
        @Index(name = "IDX_JB_CHECKLIST_TEMPLATE", columnList = "TEMPLATE_ID"),
        @Index(name = "IDX_JB_CHECKLIST_ASSIGNED", columnList = "ASSIGNED_ID")
})
@Entity(name = "jb_Checklist")
@Getter
@Setter
public class Checklist extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -5604856630391690608L;

    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ChecklistTemplate template;

    @Column(name = "TOTAL_SCORE")
    private Double totalScore;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "ASSIGNED_ENTITY")
    private String assignedEntity;

    @Column(name = "ASSIGNED_ID")
    private UUID assignedId;

    @JoinColumn(name = "STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStage stage;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "checklist")
    private List<Task> tasks;

    public Double getTotalScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Double getScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
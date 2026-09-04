package com.smartbox.jobster.entity.robot;

import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_ROBOT", indexes = {
        @Index(name = "IDX_JB_ROBOT_KANBAN", columnList = "KANBAN_ID")
})
@Entity(name = "jb_Robot")
@Getter
@Setter
public class Robot extends ParentRef implements Serializable {

    private static final long serialVersionUID = 4641385173263456552L;

    @Column(name = "INTERVAL_")
    private Integer interval;

    @Column(name = "INTERVAL_TYPE")
    private String intervalType;

    @JoinColumn(name = "KANBAN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Kanban kanban;

    @Column(name = "ALL_STAGES")
    private Boolean allStages;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort")
    @OneToMany(mappedBy = "robot")
    private List<RobotAction> robotActions;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "robot")
    private List<RobotKanbanStage> kanbanStages;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("createdDate desc")
    @OneToMany(mappedBy = "robot")
    private List<RobotCondition> conditions;

    public IntervalType getIntervalType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setIntervalType(IntervalType intervalType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
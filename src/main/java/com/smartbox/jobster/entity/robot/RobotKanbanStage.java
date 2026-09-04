package com.smartbox.jobster.entity.robot;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_ROBOT_KANBAN_STAGE", indexes = {
        @Index(name = "IDX_JB_ROBOT_KANBAN_STAGE_ROBOT", columnList = "ROBOT_ID"),
        @Index(name = "IDX_JB_ROBOT_KANBAN_STAGE_KANBAN_STAGE", columnList = "KANBAN_STAGE_ID")
})
@Entity(name = "jb_RobotKanbanStage")
@Getter
@Setter
public class RobotKanbanStage extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -7870984544011988326L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "ROBOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Robot robot;

    @JoinColumn(name = "KANBAN_STAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @InstanceName
    private KanbanStage kanbanStage;
}
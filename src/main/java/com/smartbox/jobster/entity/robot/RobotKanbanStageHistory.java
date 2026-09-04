package com.smartbox.jobster.entity.robot;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@JmixEntity
@Table(name = "JB_ROBOT_KANBAN_STAGE_HISTORY", indexes = {
        @Index(name = "IDX_JB_ROBOT_KANBAN_STAGE_HISTORY_ROBOT", columnList = "ROBOT_ID"),
        @Index(name = "IDX_JB_ROBOT_KANBAN_STAGE_HISTORY_STAGE_HISTORY", columnList = "STAGE_HISTORY_ID")
})
@Entity(name = "jb_RobotKanbanStageHistory")
@Getter
@Setter
public class RobotKanbanStageHistory extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 7291297698061241520L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "STAGE_HISTORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private KanbanStageHistory stageHistory;

    @JoinColumn(name = "ROBOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Robot robot;

    @JoinTable(name = "JB_ROBOT_KANBAN_STAGE_HISTORY_ROBOT_CONDITION_LINK",
            joinColumns = @JoinColumn(name = "ROBOT_KANBAN_STAGE_HISTORY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROBOT_CONDITION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<RobotCondition> conditions;

    @JoinTable(name = "JB_ROBOT_KANBAN_STAGE_HISTORY_ROBOT_ACTION_LINK",
            joinColumns = @JoinColumn(name = "ROBOT_KANBAN_STAGE_HISTORY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ROBOT_ACTION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<RobotAction> actions;

    @Column(name = "DATE_")
    private OffsetDateTime date;

}
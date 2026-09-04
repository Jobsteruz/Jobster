package com.smartbox.jobster.service.robot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.action.JbKanbanAction;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotAction;
import com.smartbox.jobster.entity.robot.RobotKanbanStageHistory;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import io.jmix.core.DataManager;
import io.jmix.core.TimeSource;
import jakarta.persistence.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 24/06/24 16:36
 */
@Service
public class RobotActionService {
    private static final Logger log = LoggerFactory.getLogger(RobotActionService.class);

    @Autowired
    private DataManager dataManager;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private RobotService robotService;
    @Autowired
    private TimeSource timeSource;


    /**
     * @return the number of configured actions that FAILED to execute for this entity
     * (0 = every action ran; each failure is also logged with its stack trace below)
     */
    public int executeActions(JbEntity<UUID> targetEntity, Robot robot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Actions are executed strictly one after another in the order configured on the robot
     * ({@code sort} asc). The collection is already ordered when it comes from the DB
     * ({@code Robot.robotActions} is mapped with {@code @OrderBy("sort")}), this re-sort keeps
     * the guarantee for detached/manually built lists. Actions with no sort (configured before
     * sorting existed) keep their relative position and run last.
     */
    private List<RobotAction> sortedActions(List<RobotAction> robotActions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setRobot2StageHistory(KanbanStageHistory stageHistory, Robot robot, List<RobotAction> actions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.robot.condition_matchers.manager_response_matchers;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.condition_matchers.AbstractConditionMatcher;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;

import java.util.UUID;

public abstract class AbstractMatcher<T extends JbEntity<UUID>> extends AbstractConditionMatcher<T> {

    private KanbanStageHistoryService kanbanStageHistoryService;

    protected AbstractMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected PersonStatus getManagerStatus(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected boolean isManagerReviewed(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Object getConditionValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected KanbanStageHistoryService kanbanStageHistoryService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

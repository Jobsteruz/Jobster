package com.smartbox.jobster.robot.builders;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.RobotConditionMatcher;
import com.smartbox.jobster.robot.condition_matchers.manager_response_matchers.EqualsMatcher;
import com.smartbox.jobster.robot.condition_matchers.manager_response_matchers.ExistsMatcher;

import java.util.UUID;

public final class ManagerResponseConditionMatcherFactory {

    private ManagerResponseConditionMatcherFactory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static RobotConditionMatcher<? extends JbEntity<UUID>> getMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.robot.builders;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.RobotConditionMatcher;
import org.springframework.lang.Nullable;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 24/04/24 11:50
 */
public final class ConditionMatcherBuilder {

    public static final String MANAGER_RESPONSE_FIELD = "__MANAGER_RESPONSE__";

    private ConditionMatcherBuilder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ConditionMatcherBuilder getBuilder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public RobotConditionMatcher<? extends JbEntity<UUID>> getMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
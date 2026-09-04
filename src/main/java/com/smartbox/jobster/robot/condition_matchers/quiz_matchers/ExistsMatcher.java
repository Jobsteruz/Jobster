package com.smartbox.jobster.robot.condition_matchers.quiz_matchers;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.exceptions.RobotExecutionException;
import com.smartbox.jobster.exceptions.robot.QuizPersonNotFoundException;

import java.util.UUID;

public class ExistsMatcher extends AbstractMatcher<JbEntity<UUID>> {

    public ExistsMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean match(JbEntity<UUID> entity) throws RobotExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

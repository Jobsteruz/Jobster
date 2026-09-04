package com.smartbox.jobster.robot.builders;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.RobotConditionMatcher;
import com.smartbox.jobster.robot.condition_matchers.questionnaire_matchers.*;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 24/04/24 11:54
 */
public final class QuestionnaireConditionMatcherFactory {
    public static RobotConditionMatcher<? extends JbEntity<UUID>> getMatcher(RobotCondition condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
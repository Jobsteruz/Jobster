package com.smartbox.jobster.robot.builders;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.RobotConditionMatcher;
import com.smartbox.jobster.robot.condition_matchers.addition_questions_matchers.EqualsMatcher;
import com.smartbox.jobster.robot.condition_matchers.addition_questions_matchers.ExistsMatcher;
import com.smartbox.jobster.robot.condition_matchers.addition_questions_matchers.GreaterThanMatcher;
import com.smartbox.jobster.robot.condition_matchers.addition_questions_matchers.LessThanMatcher;

import java.util.UUID;

public class TempQuestionnaireConditionMatcherFactory {

    public static RobotConditionMatcher<? extends JbEntity<UUID>> getMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

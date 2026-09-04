package com.smartbox.jobster.robot.builders;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.RobotConditionMatcher;
import com.smartbox.jobster.robot.condition_matchers.quiz_matchers.EqualsMatcher;
import com.smartbox.jobster.robot.condition_matchers.quiz_matchers.ExistsMatcher;
import com.smartbox.jobster.robot.condition_matchers.quiz_matchers.GreaterThanMatcher;
import com.smartbox.jobster.robot.condition_matchers.quiz_matchers.LessThanMatcher;

import java.util.UUID;

public class QuizConditionMatcherFactory {


    public static RobotConditionMatcher<? extends JbEntity<UUID>> getMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

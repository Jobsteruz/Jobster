package com.smartbox.jobster.robot.condition_matchers.addition_questions_matchers;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.exceptions.robot.TempQuestionnairePersonNotFoundException;
import com.smartbox.jobster.robot.condition_matchers.AbstractConditionMatcher;
import com.smartbox.jobster.service.AdditionalQuestService;

import java.util.UUID;

public abstract class AbstractMatcher<T extends JbEntity<UUID>> extends AbstractConditionMatcher<T> {

    protected AbstractMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected Object getScore(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Object getConditionValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

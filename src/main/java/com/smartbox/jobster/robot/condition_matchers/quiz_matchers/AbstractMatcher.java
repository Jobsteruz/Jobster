package com.smartbox.jobster.robot.condition_matchers.quiz_matchers;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.exceptions.robot.QuizPersonNotFoundException;
import com.smartbox.jobster.robot.condition_matchers.AbstractConditionMatcher;
import com.smartbox.jobster.service.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public abstract class AbstractMatcher<T extends JbEntity<UUID>> extends AbstractConditionMatcher<T> {

    private static final Logger log = LoggerFactory.getLogger(AbstractMatcher.class);

    protected AbstractMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected Object getConditionValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Object getScore(JbEntity<UUID> entity) throws QuizPersonNotFoundException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.robot.condition_matchers.questionnaire_matchers;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.QuestionOption;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.condition_matchers.AbstractConditionMatcher;
import io.jmix.core.FileRef;
import jakarta.persistence.Entity;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 23/04/24 15:46
 */
public abstract class AbstractMatcher<T extends JbEntity<UUID>> extends AbstractConditionMatcher<T> {


    protected AbstractMatcher(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Object getConditionValueS() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

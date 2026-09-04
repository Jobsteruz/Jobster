package com.smartbox.jobster.robot.condition_matchers.entity_matchers;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.robot.condition_matchers.AbstractConditionMatcher;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;

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

    protected Object getConditionValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    /**
     * @param entity
     * @return the value of kanban stage entity robotCondition.field
     */
    protected Object getEntityFieldValue(JbEntity<UUID> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
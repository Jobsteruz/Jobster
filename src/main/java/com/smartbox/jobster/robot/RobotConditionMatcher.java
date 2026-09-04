package com.smartbox.jobster.robot;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.exceptions.RobotExecutionException;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 22/04/24 19:51
 */
public interface RobotConditionMatcher<T extends JbEntity<UUID>> {


    boolean match(JbEntity<UUID> entity/*Entity to be matched*/) throws RobotExecutionException;

    default RobotConditionMatcher<T> negate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
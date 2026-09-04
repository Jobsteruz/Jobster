package com.smartbox.jobster.listener.entity;

import com.hazelcast.core.HazelcastInstance;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.service.RobotCachingService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author Jobster team
 * date: 15/05/24 14:53
 */
@Component
@RequiredArgsConstructor
public class RobotConditionEntityListener {


    private final RobotCachingService robotCachingService;
    private final DataManager dataManager;
    private final HazelcastInstance hazelcastInstance;


    @TransactionalEventListener
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void onRobotConditionChangedAfterCommit(final EntityChangedEvent<RobotCondition> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * A robot edit (interval, activation, …) must take effect on the very next scheduler tick.
     * The scheduler's cross-instance enqueue mark carries a TTL computed from the OLD interval —
     * without this eviction a robot shortened from daily to per-minute would stay silent until
     * the old day-long mark expired.
     */
    @TransactionalEventListener
    public void onRobotChangedAfterCommit(final EntityChangedEvent<Robot> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
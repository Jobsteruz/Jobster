package com.smartbox.jobster.listener.mq;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.exceptions.RobotExecutionException;
import com.smartbox.jobster.pojo.RobotPojo;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.robot.RobotService;
import com.smartbox.jobster.service.robot.RobotTenantMQService;
import io.jmix.core.security.Authenticated;
import io.jmix.core.security.SystemAuthenticator;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Consumes the per-tenant robot queues ({@link RobotTenantMQService}) on dedicated robot nodes
 * only ({@code robot.rabbitmq.listen=true}) — the same flag also runs the producer
 * (CronRobotJob), so the whole robot subsystem lives on the robot nodes and the MQ node has no
 * robot role. One container per tenant queue with concurrency 1 and prefetch 1: a
 * tenant occupies at most one consumer per instance, so a heavy tenant cannot starve the rest.
 * Multiple robot instances subscribe to the same queues safely — the broker delivers each message
 * to exactly one consumer, and the Hazelcast robot lock skips a robot whose previous run is still
 * in flight on another instance.
 * <p>
 * The container set is reconciled on startup and hourly rather than via the reg-tenant message
 * the TG queues use: that registration message is competing-consumed, so with 2+ robot instances
 * only one of them would learn about a new tenant. The periodic reconcile keeps every instance's
 * container set converged on "tenants with a robot user" (a brand-new tenant's robots may
 * therefore wait up to an hour for their first run; the enqueued messages sit safely in the
 * durable queue until a consumer attaches).
 */
@Component
@ConditionalOnProperty("robot.rabbitmq.listen")
public class RobotTenantQueueConsumers {
    private static final Logger log = LoggerFactory.getLogger(RobotTenantQueueConsumers.class);

    @Autowired
    private EntityService entityService;
    @Autowired
    private RobotService robotService;
    @Autowired
    private RobotTenantMQService robotTenantMQService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private ConnectionFactory connectionFactory;

    @Value("${robot.semaphore.permits:6}")
    private int semaphorePermits;

    // Caps concurrent robot runs per instance (fair = FIFO). Per-tenant containers give every
    // tenant its own consumer thread, so without this cap N tenants could fire N full scans into
    // the DB at once. A consumer waiting here holds its single prefetched message unacked —
    // nothing is lost, and its tenant queue simply pauses until a permit frees up.
    private Semaphore runPermits;

    private final Map<String, SimpleMessageListenerContainer> containers = new ConcurrentHashMap<>();

    @PostConstruct
    private void init() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @EventListener
    public void onApplicationStarted(final ApplicationStartedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    @Scheduled(initialDelay = 60, fixedDelay = 60, timeUnit = TimeUnit.MINUTES, scheduler = "robotJobScheduled")
    public void scheduledReconcile() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void reconcile() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SimpleMessageListenerContainer startContainer(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Invoked by every tenant container (via MessageListenerAdapter). */
    public void handle(RobotPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PreDestroy
    private void shutdown() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

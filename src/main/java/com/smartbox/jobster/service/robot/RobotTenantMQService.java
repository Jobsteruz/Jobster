package com.smartbox.jobster.service.robot;

import com.smartbox.jobster.pojo.RobotPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueInformation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Per-tenant robot MQ topology, mirroring the per-tenant Telegram queues in
 * {@link com.smartbox.jobster.service.MQService}: every robot-enabled tenant gets its own durable
 * {@code jb.<tenantId>.robot_queue} bound with {@code jb.<tenantId>.robot_rout}. Tenants' robots
 * are therefore scheduled and consumed independently — a heavy tenant's backlog stays in its own
 * queue instead of delaying every other tenant behind the single shared FIFO the old
 * {@code jb.robot_queue} design had.
 */
@Service
public class RobotTenantMQService {
    private static final Logger log = LoggerFactory.getLogger(RobotTenantMQService.class);

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private DirectExchange directExchange;
    @Autowired
    private AmqpAdmin amqpAdmin;

    // Tenants whose queue+binding this JVM has already declared. Declaration is idempotent on the
    // broker; the cache only saves a management round-trip per send.
    private final Set<String> declaredTenants = ConcurrentHashMap.newKeySet();

    public String queueName(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String routingKey(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Declares the tenant's robot queue + binding (idempotent). The producer calls this before the
     * first send — a message published to a direct exchange with no bound queue is silently
     * dropped — and the consumer side calls it before subscribing.
     */
    public void declareQueue(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void send(String tenantId, RobotPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Ready-message depth of the tenant's robot queue; 0 when the queue does not exist yet. */
    public long queueDepth(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

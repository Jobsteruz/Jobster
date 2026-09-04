package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.service.MessageService;
import io.jmix.core.security.Authenticated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Jobster team
 * Since: 04/15/2025 7:43 PM
 */


@Slf4j
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronMessageJob {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.message.routing-key}")
    private String routingKey;
    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private MessageService messageService;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Authenticated
    @Scheduled(cron = "0 0 * * * ?", scheduler = "messageJobScheduled")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

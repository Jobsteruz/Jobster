package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.trainee.config.TraineeGroupConfig;
import com.smartbox.jobster.service.TraineeService;
import io.jmix.core.security.Authenticated;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;


@Component("jb_CronCreateTraineeGroupJob")
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronCreateTraineeGroupJob {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.trainee-group.routing-key}")
    private String traineeRoutingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private TraineeService traineeService;

    @Authenticated
    @Scheduled(initialDelay = 30, fixedDelay = 30, timeUnit = TimeUnit.SECONDS, scheduler = "createTraineeGroupJobScheduled")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

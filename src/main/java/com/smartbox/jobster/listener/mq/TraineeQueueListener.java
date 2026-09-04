package com.smartbox.jobster.listener.mq;

import com.google.common.collect.Lists;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.trainee.config.TraineeGroupConfig;
import com.smartbox.jobster.service.TraineeService;
import io.jmix.core.security.Authenticated;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 4/29/2024 12:20 PM
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class TraineeQueueListener {

    @Autowired
    private TraineeService traineeService;

    @Authenticated
    @RabbitListener(queues = "${spring.rabbitmq.jb.template.trainee-group-queue}")
    public void createTraineeGroup(UUID configId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

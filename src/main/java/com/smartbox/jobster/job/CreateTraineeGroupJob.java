package com.smartbox.jobster.job;

import com.smartbox.jobster.entity.trainee.config.TraineeGroupConfig;
import com.smartbox.jobster.service.TraineeService;
import io.jmix.core.security.Authenticated;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Jobster team
 * Since: 4/29/2024 11:55 AM
 */
@Component("jb_CreateTraineeGroupJob")
public class CreateTraineeGroupJob implements Job {

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.trainee-group.routing-key}")
    private String traineeRoutingKey;
    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private TraineeService traineeService;

    @Authenticated
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

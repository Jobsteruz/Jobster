package com.smartbox.jobster.job;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.pojo.HHPojo;
import com.smartbox.jobster.service.UserService;
import io.jmix.core.security.Authenticated;
import lombok.extern.slf4j.Slf4j;
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
 * Since: 1/25/2025 12:28 PM
 */
@Slf4j
@Component("jb_HHJob")
public class HHJob implements Job {
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.hh.routing-key}")
    private String hhRoutingKey;
    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private UserService userService;

    @Authenticated
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

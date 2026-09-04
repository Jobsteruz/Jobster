package com.smartbox.jobster.job;

import com.smartbox.jobster.service.MessageService;
import io.jmix.core.security.Authenticated;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("jb_MessageJob")
public class MessageJob implements Job {

    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private MessageService messageService;

    @Override
    @Authenticated
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
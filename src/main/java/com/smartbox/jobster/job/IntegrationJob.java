package com.smartbox.jobster.job;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Jobster team
 * Since: 1/25/2025 12:28 PM
 */
@Component("jb_IntegrationJob")
public class IntegrationJob implements Job {
    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private UserService userService;
    @Autowired
    private HHEmployerService hHEmployerService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

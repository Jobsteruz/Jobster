package com.smartbox.jobster.job;

import com.smartbox.jobster.pojo.RobotPojo;
import com.smartbox.jobster.service.robot.RobotService;
import com.smartbox.jobster.service.robot.RobotTenantMQService;
import io.jmix.core.security.Authenticated;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jobster team
 * date: 20/04/24 12:55
 */
@Component("jb_RobotJob")
public class RobotJob implements Job {

    @Autowired
    private RobotService robotService;
    @Autowired
    private RobotTenantMQService robotTenantMQService;

    // The robot subsystem is gated by its own flag only — this Quartz job enqueues solely when it
    // fires on a robot node (robot.rabbitmq.listen=true), never on the MQ/UI nodes.
    @Value("${robot.rabbitmq.listen}")
    private String listen;


    /**
     * Manual/Quartz trigger: enqueues every active robot immediately (ignoring intervals), each
     * into its tenant's own queue.
     */
    @Override
    @Authenticated
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

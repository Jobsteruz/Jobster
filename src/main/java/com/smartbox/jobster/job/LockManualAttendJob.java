package com.smartbox.jobster.job;

import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.attendance.ManualAttendLockService;
import io.jmix.core.security.SystemAuthenticator;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/**
 * @author Jobster team
 * date: 05/08/24 12:10
 */
@Component("jb_LockManualAttendJob")
public class LockManualAttendJob implements Job {
    private static final Logger log = LoggerFactory.getLogger(LockManualAttendJob.class);

    @Value("${spring.rabbitmq.listen}")
    private String listen;

    @Autowired
    private SystemAuthenticator systemAuthenticator;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ManualAttendLockService lockService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

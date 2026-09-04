package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.service.CompanyService;
import io.jmix.core.security.Authenticated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronRestoreTenantLimit {
    private static final Logger log = LoggerFactory.getLogger(CronRestoreTenantLimit.class);

    @Autowired
    private CompanyService companyService;

    @Authenticated
    @Scheduled(cron = "0 0 0 1 * ?")
    public void cronRun() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

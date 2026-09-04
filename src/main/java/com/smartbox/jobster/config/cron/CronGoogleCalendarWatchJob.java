package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.integration.GoogleCalendarWatch;
import com.smartbox.jobster.service.google.GoogleCalendarService;
import io.jmix.core.security.Authenticated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronGoogleCalendarWatchJob {
    private static final Logger log = LoggerFactory.getLogger(CronGoogleCalendarWatchJob.class);

    @Autowired
    private GoogleCalendarService googleCalendarService;

    @Authenticated
    @Scheduled(initialDelay = 5, fixedDelay = 6, timeUnit = TimeUnit.HOURS, scheduler = "googleCalendarWatchScheduled")
    public void renewExpiringWatches() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

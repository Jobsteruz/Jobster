package com.smartbox.jobster.config.cron;

import com.smartbox.jobster.entity.integration.OutlookSubscription;
import com.smartbox.jobster.service.outlook.OutlookSubscriptionService;
import io.jmix.core.security.Authenticated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Renews Microsoft Graph Outlook subscriptions before their ~7-day expiry, mirroring
 * {@link CronGoogleCalendarWatchJob}. Gated on {@code spring.rabbitmq.listen} so it runs only on the
 * dedicated worker node (like the other renewal/consumer jobs), not on every UI instance.
 */
@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
public class CronOutlookSubscriptionJob {

    private static final Logger log = LoggerFactory.getLogger(CronOutlookSubscriptionJob.class);

    @Autowired
    private OutlookSubscriptionService outlookSubscriptionService;

    @Authenticated
    @Scheduled(initialDelay = 5, fixedDelay = 6, timeUnit = TimeUnit.HOURS,
            scheduler = OutlookSubscriptionSchedulerConfig.OUTLOOK_SUBSCRIPTION_SCHEDULER)
    public void renewExpiringSubscriptions() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

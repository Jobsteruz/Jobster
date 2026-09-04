package com.smartbox.jobster.config.cron;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Dedicated single-thread scheduler for {@link CronOutlookSubscriptionJob}. Kept in a
 * {@code @Configuration} (rather than a {@code @Bean} on the job {@code @Component}) and gated on the
 * same worker-node property so it isn't created on UI nodes. Mirrors {@code CvParserAsyncConfig}.
 */
@Configuration
@ConditionalOnProperty("spring.rabbitmq.listen")
public class OutlookSubscriptionSchedulerConfig {

    public static final String OUTLOOK_SUBSCRIPTION_SCHEDULER = "outlookSubscriptionScheduled";

    @Bean(OUTLOOK_SUBSCRIPTION_SCHEDULER)
    public ThreadPoolTaskScheduler outlookSubscriptionScheduler() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

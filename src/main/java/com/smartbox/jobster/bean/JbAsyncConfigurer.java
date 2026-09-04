package com.smartbox.jobster.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * application level async configurer
 */

@Configuration
@EnableAsync
public class JbAsyncConfigurer implements AsyncConfigurer {

    /** Executor name used by {@code TicketService} to run async ticket work. */
    public static final String TICKET_EXECUTOR = "ticketExecutor";

    /** Executor name used by {@code FcmService} to send mobile push notifications. */
    public static final String FCM_EXECUTOR = "fcmExecutor";

    @Override
    public Executor getAsyncExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Dedicated bounded executor for exception ticket persistence + MQ publish.
     * Kept small and isolated so a slow DB or RabbitMQ never blocks the main
     * request/MQ listener threads. Overflow policy is "discard oldest" —
     * dropping a ticket is preferable to stalling the caller.
     */
    @Bean(TICKET_EXECUTOR)
    public Executor ticketExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Dedicated bounded executor for FCM push sends.
     * <p>
     * Not the default {@link #getAsyncExecutor()} pool: that one takes the {@code ThreadPoolTaskExecutor}
     * defaults, and an unbounded queue means max-pool-size is never reached — so it is effectively a
     * single thread, already shared with CV parsing and other long jobs. A banner queued behind those
     * arrives too late to be a banner. Overflow discards the oldest: a stale push is worth less than a
     * fresh one.
     */
    @Bean(FCM_EXECUTOR)
    public Executor fcmExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

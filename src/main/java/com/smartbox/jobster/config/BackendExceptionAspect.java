package com.smartbox.jobster.config;

import com.smartbox.jobster.entity.ats.TicketSource;
import com.smartbox.jobster.service.TicketService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Captures runtime exceptions thrown by async backend entry points that are
 * not covered by the UI sniffer or REST controller advice:
 * <ul>
 *   <li>{@code @RabbitListener} methods in {@code listener/mq}</li>
 *   <li>{@code @Scheduled} / cron jobs in {@code config/cron}</li>
 * </ul>
 * Each caught exception is forwarded to {@link TicketService} as a
 * {@link TicketSource#BACKEND} ticket. The exception is <b>not rethrown</b> —
 * {@code @AfterThrowing} only observes it, so Spring's own error handling for
 * the listener/scheduler continues to run normally (retry, dead-letter, etc.).
 */
@Aspect
@Component
public class BackendExceptionAspect {

    private static final Logger log = LoggerFactory.getLogger(BackendExceptionAspect.class);

    @Autowired
    private TicketService ticketService;

    @Pointcut("execution(* com.smartbox.jobster.listener.mq..*(..))")
    public void mqListenerMethod() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Pointcut("execution(* com.smartbox.jobster.config.cron..*(..))")
    public void cronJobMethod() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @AfterThrowing(pointcut = "mqListenerMethod() || cronJobMethod()", throwing = "exception")
    public void onAsyncException(JoinPoint joinPoint, Throwable exception) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

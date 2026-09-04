package com.smartbox.jobster.config.replica;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ReplicaRoutingAspect {

    private static final Logger log = LoggerFactory.getLogger("replica.routing");

    private final ReplicaRoutingToggle toggle;
    private final ReplicaRoutingMetrics metrics;

    public ReplicaRoutingAspect(ReplicaRoutingToggle toggle, ReplicaRoutingMetrics metrics) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Around("@within(com.smartbox.jobster.config.replica.UseReplica) "
            + "|| @annotation(com.smartbox.jobster.config.replica.UseReplica)")
    public Object routeToReplica(ProceedingJoinPoint pjp) throws Throwable {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

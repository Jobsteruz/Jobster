package com.smartbox.jobster.config.replica;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Live counters for the replica routing subsystem. Incremented by
 * {@link ReplicaRoutingAspect} on every {@code @UseReplica} method
 * invocation. Read by the admin UI for the "Live stats" card.
 */
@Component
public class ReplicaRoutingMetrics {

    private final AtomicLong totalCalls = new AtomicLong();
    private final AtomicLong totalErrors = new AtomicLong();

    public void incrementCall() { totalCalls.incrementAndGet(); }
    public void incrementError() { totalErrors.incrementAndGet(); }

    public long getTotalCalls() { return totalCalls.get(); }
    public long getTotalErrors() { return totalErrors.get(); }
}

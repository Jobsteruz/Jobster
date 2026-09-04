package com.smartbox.jobster.config.replica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Background sentinel that pings the replica every 10s and probes the
 * primary's pg_stat_replication for the current replay lag. Both values
 * drive the routing fallback decision and the admin UI's live stats.
 */
@Component
public class ReplicaHealthMonitor {

    private static final Logger log = LoggerFactory.getLogger("replica.routing.fallback");

    private final DataSource replicaDataSource;
    private final DataSource primaryDataSource;
    private final ReplicaRoutingEventLog eventLog;
    private final ReplicaRoutingToggle routingToggle;

    private volatile boolean healthy = true;
    private volatile String lastError;
    private volatile Long replicationLagMs;       // null = unknown
    private volatile Long replicationLagBytes;    // null = unknown
    private final AtomicLong fallbackCount = new AtomicLong();

    public ReplicaHealthMonitor(@Qualifier("replicaDataSource") DataSource replicaDataSource,
                                @Qualifier("primaryDataSource") DataSource primaryDataSource,
                                ReplicaRoutingEventLog eventLog,
                                ReplicaRoutingToggle routingToggle) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initialCheck() {
        check();
    }

    @Scheduled(fixedDelay = 10_000, initialDelay = 10_000)
    public void check() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void probeReplicationLag() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isHealthy() { return healthy; }
    public String getLastError() { return lastError; }
    public Long getReplicationLagMs() { return replicationLagMs; }
    public Long getReplicationLagBytes() { return replicationLagBytes; }

    public long incrementAndGetFallbackCount() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public long getFallbackCount() { return fallbackCount.get(); }
}

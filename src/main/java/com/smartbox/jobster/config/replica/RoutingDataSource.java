package com.smartbox.jobster.config.replica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataSource extends AbstractRoutingDataSource {

    private static final Logger log = LoggerFactory.getLogger("replica.routing.decision");
    private static final Logger fallbackLog = LoggerFactory.getLogger("replica.routing.fallback");

    private final ReplicaHealthMonitor healthMonitor;

    public RoutingDataSource(ReplicaHealthMonitor healthMonitor) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Object determineCurrentLookupKey() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

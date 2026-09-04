package com.smartbox.jobster.view.reports.managerperformance;

import com.smartbox.jobster.config.caching.SupportsCaching;
import io.jmix.core.entity.EntityValues;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

/**
 * Input of {@code ManagerPerformanceReportService.getReport} and, through {@link SupportsCaching}, its
 * Hazelcast cache key. An empty set means "not filtered" for that dimension. Every set is normalised
 * to a sorted, unmodifiable copy so that equal filters render the same {@link #key()} on every node.
 */
public record ManagerPerformanceFilter(OffsetDateTime from, OffsetDateTime to,
                                       Set<UUID> branchIds, Set<UUID> departmentIds, Set<UUID> positionIds,
                                       Set<UUID> responsibleIds, Set<UUID> managerIds,
                                       Set<UUID> cancelReasonIds)
        implements SupportsCaching, Serializable {

    public ManagerPerformanceFilter {
        Objects.requireNonNull(from, "from");
        Objects.requireNonNull(to, "to");
        branchIds = normalize(branchIds);
        departmentIds = normalize(departmentIds);
        positionIds = normalize(positionIds);
        responsibleIds = normalize(responsibleIds);
        managerIds = normalize(managerIds);
        cancelReasonIds = normalize(cancelReasonIds);
    }

    /** Single-value convenience for {@code EntityComboBox} filters: no selection means not filtered. */
    public static Set<UUID> ids(@Nullable Object entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static Set<UUID> normalize(@Nullable Set<UUID> ids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.company.Company;
import io.jmix.core.DataManager;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

/**
 * Aggregates dashboard limit metrics for the current tenant.
 * Tenant filtering is applied automatically by Jmix multitenancy via @TenantId,
 * so JPQL queries don't need an explicit "where e.tenantId = ..." clause.
 */
@Service("jb_DashboardLimitsService")
public class DashboardLimitsService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;

    public DashboardLimits load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private double aiCostThisMonth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private long botMembers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record DashboardLimits(int sms, int email, double aiCost, long botMembers) {
    }
}

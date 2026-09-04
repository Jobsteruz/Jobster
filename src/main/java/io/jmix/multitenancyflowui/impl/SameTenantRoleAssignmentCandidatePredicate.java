package io.jmix.multitenancyflowui.impl;


import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.security.model.BaseRole;
import io.jmix.securityflowui.util.RoleAssignmentCandidatePredicate;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Jobster team
 * Since: 12/23/2025 6:48 PM
 */
public class SameTenantRoleAssignmentCandidatePredicate implements RoleAssignmentCandidatePredicate {

    protected final TenantProvider tenantProvider;

    public SameTenantRoleAssignmentCandidatePredicate(TenantProvider tenantProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean test(UserDetails userDetails, BaseRole baseRole) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

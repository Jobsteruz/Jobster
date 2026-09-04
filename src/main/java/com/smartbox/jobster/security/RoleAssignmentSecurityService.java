package com.smartbox.jobster.security;

import io.jmix.core.UnconstrainedDataManager;
import org.springframework.stereotype.Component;

/**
 * Shared authorization helper for role-assignment guards.
 * <p>
 * Both the data-layer guard ({@code RoleAssignmentSecurityListener}) and the HTTP-layer guard
 * ({@code SuperAdminEntityAuthorizationManager}) ask the same question: does a given user already
 * hold the system-wide {@link FullAccessRole#CODE system-full-access} role? Resolving this against
 * the actual {@code sec_RoleAssignmentEntity} rows (rather than parsing granted-authority strings)
 * keeps the check independent of Jmix's authority representation and of the request channel.
 */
@Component
public class RoleAssignmentSecurityService {

    private final UnconstrainedDataManager dataManager;

    public RoleAssignmentSecurityService(UnconstrainedDataManager dataManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @return {@code true} if {@code username} currently has a {@code system-full-access}
     * resource-role assignment. Uses the unconstrained data manager because the superadmin role
     * is global (not tenant-scoped) and the check must see it regardless of the caller's tenant.
     */
    public boolean holdsSystemFullAccess(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @return {@code true} if {@code username} currently has a role assignment with the given
     * role code. Safe to call on unauthenticated threads (login flow, security filters): the
     * unconstrained data manager does not require an authentication in the security context.
     */
    public boolean holdsRole(String username, String roleCode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Variant that ignores a specific role-assignment id. The data-layer guard passes the id of
     * the row being saved so that an in-flight self-grant of {@code system-full-access} can never
     * count toward the caller's own authorization (i.e. the new row must not authorize itself).
     *
     * @param excludeId role-assignment id to exclude, or {@code null} to count all rows
     */
    public boolean holdsSystemFullAccess(String username, Object excludeId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

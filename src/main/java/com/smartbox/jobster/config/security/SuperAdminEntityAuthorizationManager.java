package com.smartbox.jobster.config.security;

import com.smartbox.jobster.security.RoleAssignmentSecurityService;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;
import org.springframework.util.StringUtils;

import java.util.function.Supplier;

/**
 * Enforces pentest recommendation #1 at the HTTP layer: the Jmix security model
 * ({@code /rest/entities/sec_*} — role assignments, roles, resource/row-level policies) is
 * reachable through the generic REST entity API <em>only</em> by a caller that already holds
 * {@code system-full-access}.
 *
 * <p>This is the defense-in-depth complement to the data-layer
 * {@code RoleAssignmentSecurityListener}: it additionally blocks REST <b>reads</b> (cross-tenant
 * role enumeration) and <b>deletes</b> of security entities, which entity-save events do not cover.
 *
 * <p>Decision logic:
 * <ul>
 *   <li>null / unauthenticated / anonymous → DENY</li>
 *   <li>subject does not resolve to a {@code system-full-access} holder → DENY. A
 *       {@code client_credentials} token (subject = client_id) never resolves, so it is denied
 *       too, without a special case.</li>
 *   <li>subject holds {@code system-full-access} → ALLOW</li>
 * </ul>
 */
public final class SuperAdminEntityAuthorizationManager
        implements AuthorizationManager<RequestAuthorizationContext> {

    private static final AuthorizationDecision DENY = new AuthorizationDecision(false);
    private static final AuthorizationDecision ALLOW = new AuthorizationDecision(true);

    private final RoleAssignmentSecurityService securityService;

    public SuperAdminEntityAuthorizationManager(RoleAssignmentSecurityService securityService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AuthorizationDecision check(Supplier<Authentication> authentication,
                                       RequestAuthorizationContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

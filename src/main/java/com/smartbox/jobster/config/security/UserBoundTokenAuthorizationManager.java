package com.smartbox.jobster.config.security;

import com.smartbox.jobster.security.MobileLoginRestrictionRole;
import com.smartbox.jobster.security.RoleAssignmentSecurityService;
import io.jmix.core.security.UserRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;
import org.springframework.util.StringUtils;

import java.util.function.Supplier;

/**
 * Enforces pentest recommendation #2: every request to the protected REST surface
 * (/api/**, /rest/**) must be backed by a CONCRETE USER subject — not merely an
 * authenticated client.
 *
 * <p>Why this is needed: {@code .anyRequest().authenticated()} accepts ANY successfully
 * introspected token, including a {@code client_credentials} (client-only) token that has
 * no user behind it. Such a token authenticates the <em>client</em> (the app) but
 * represents no person, so it must never reach user/business data. This manager rejects it.
 * It is a defense-in-depth backstop: even if {@code client_credentials} is re-enabled by
 * misconfiguration, or any other path mints a user-less token, the REST surface stays closed.
 *
 * <p>Additionally enforces the {@link MobileLoginRestrictionRole mobile-login-denied} role on the
 * credential-based API channels (bearer tokens and HTTP Basic), so that assigning the role cuts
 * off mobile/API access immediately — including tokens issued before the assignment.
 *
 * <p>Decision logic:
 * <ul>
 *   <li>null / unauthenticated / anonymous → DENY</li>
 *   <li>holder of {@code mobile-login-denied} via bearer token or HTTP Basic → DENY</li>
 *   <li>HTTP Basic or session login → principal is a Jmix {@link UserDetails} → ALLOW</li>
 *   <li>Opaque bearer token → ALLOW only if the token subject resolves to a real Jmix user.
 *       A {@code password} / {@code authorization_code} token's subject is a username
 *       (resolves → ALLOW); a {@code client_credentials} token's subject is the client_id
 *       (does not resolve → DENY).</li>
 * </ul>
 */
public final class UserBoundTokenAuthorizationManager
        implements AuthorizationManager<RequestAuthorizationContext> {

    private static final AuthorizationDecision DENY = new AuthorizationDecision(false);
    private static final AuthorizationDecision ALLOW = new AuthorizationDecision(true);

    private final UserRepository userRepository;
    private final RegisteredClientRepository registeredClientRepository;
    private final RoleAssignmentSecurityService roleAssignmentSecurityService;

    public UserBoundTokenAuthorizationManager(UserRepository userRepository,
                                              RegisteredClientRepository registeredClientRepository,
                                              RoleAssignmentSecurityService roleAssignmentSecurityService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public AuthorizationDecision check(Supplier<Authentication> authentication,
                                       RequestAuthorizationContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean hasRealUserSubject(Authentication auth) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

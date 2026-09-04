package com.smartbox.jobster.listener;

import com.smartbox.jobster.security.MobileLoginRestrictionRole;
import com.smartbox.jobster.security.RoleAssignmentSecurityService;
import io.jmix.core.security.event.PostAuthenticationCheckEvent;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Blocks mobile-app login for users holding {@link MobileLoginRestrictionRole}.
 * <p>
 * The mobile app authenticates with login/password via the OAuth2 {@code password} grant at
 * {@code /oauth2/token}; the authserver's password-grant provider delegates to the standard Jmix
 * {@code AuthenticationManager}, whose {@code PostAuthenticationChecks} fires
 * {@link PostAuthenticationCheckEvent}. Throwing an {@link org.springframework.security.core.AuthenticationException}
 * here fails the grant — the provider converts it to a regular OAuth2 {@code invalid_grant}
 * response, so the app shows an ordinary login failure.
 * <p>
 * Gated on the token-endpoint request so web-UI (Vaadin form) logins — which fire the same
 * event — are never affected. Listening on the <em>post</em>-check (not pre-) keeps the
 * restriction invisible to wrong-password probing: the deny only ever fires after the password
 * has been verified.
 */
@Component("jb_MobileLoginRestrictionListener")
@RequiredArgsConstructor
public class MobileLoginRestrictionListener {

    // AuthorizationGrantType.PASSWORD is deprecated-for-removal (dropped from OAuth 2.1);
    // the authserver still supports the grant, so the literal is used here.
    private static final String PASSWORD_GRANT_TYPE = "password";

    private final RoleAssignmentSecurityService roleAssignmentSecurityService;

    @EventListener
    public void onPostAuthenticationCheck(final PostAuthenticationCheckEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isPasswordGrantTokenRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

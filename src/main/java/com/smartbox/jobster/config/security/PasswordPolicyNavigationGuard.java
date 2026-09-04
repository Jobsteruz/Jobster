package com.smartbox.jobster.config.security;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.service.security.PasswordPolicyService;
import com.smartbox.jobster.view.auth.ForcePasswordChangeView;
import com.smartbox.jobster.view.auth.LoginView;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.Messages;
import io.jmix.core.usersubstitution.CurrentUserSubstitution;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Enforces the password-expiry policy across the whole UI: registers a global {@code BeforeEnter}
 * listener that reroutes an authenticated user with an expired password to
 * {@link ForcePasswordChangeView} on every navigation, so no other view is reachable until the
 * password is changed. Active user substitutions are deliberately exempt from that redirect so an
 * authorized user can access the substituted account even if its password is expired. During the warning
 * window it shows a one-per-session reminder banner instead.
 *
 * <p>The policy state is reloaded fresh on each navigation (see
 * {@link PasswordPolicyService#loadPolicyUser}) rather than read from the security-context snapshot,
 * so the reroute stops the instant the password is changed. Any failure here fails <em>open</em> —
 * a guard bug must never lock the entire application out of navigation.
 */
@Component
@RequiredArgsConstructor
public class PasswordPolicyNavigationGuard implements VaadinServiceInitListener {

    private static final Logger log = LoggerFactory.getLogger(PasswordPolicyNavigationGuard.class);
    private static final String WARN_SHOWN_ATTR = "jb.passwordPolicy.warnShown";

    private final PasswordPolicyService passwordPolicyService;
    private final Messages messages;
    private final CurrentUserSubstitution currentUserSubstitution;

    @Override
    public void serviceInit(ServiceInitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private User currentPrincipal() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showWarnOnce(long days) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

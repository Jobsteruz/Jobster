package com.smartbox.jobster.config.security;

import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.server.WrappedSession;

/**
 * Stores the policy-relevant authentication context in the HTTP session. The marker is set before
 * {@code LoginViewSupport.preventSessionFixation()} runs, so it follows the custom user-substitution
 * login into the replacement session.
 */
public final class PasswordPolicySessionState {

    private static final String SUBSTITUTION_ACTIVE_ATTR = "jb.passwordPolicy.substitutionActive";

    private PasswordPolicySessionState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static boolean isSubstitutionActive() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void setSubstitutionActive(boolean active) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static WrappedSession currentHttpSession() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.bean;

import com.smartbox.jobster.config.security.PasswordPolicySessionState;
import com.vaadin.flow.spring.annotation.SpringComponent;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.securityflowui.authentication.AuthDetails;
import io.jmix.securityflowui.authentication.LoginViewSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;

import java.util.Locale;

/**
 * @author Jobster team
 * Since: 5/17/2024 2:32 PM
 */
@Primary
@SpringComponent("jb_LoginViewSupport")
public class JbLoginViewSupport extends LoginViewSupport {

    @Autowired
    private SystemAuthenticator systemAuthenticator;

    public void authenticate(String username, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Authenticates as another user from the substitution screen. The marker is set before session
     * fixation protection replaces the HTTP session, allowing password-policy navigation to
     * distinguish this from a direct login.
     */
    public void authenticateForSubstitution(String username, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void authenticate(String username, Locale locale, boolean substitution) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

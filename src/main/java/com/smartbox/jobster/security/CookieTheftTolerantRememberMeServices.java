package com.smartbox.jobster.security;

import io.jmix.core.rememberme.JmixRememberMeServices;
import io.jmix.core.security.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.rememberme.CookieTheftException;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.authentication.rememberme.RememberMeAuthenticationException;

/**
 * {@link JmixRememberMeServices} that treats a persistent-token (series/token) mismatch as an
 * expired login instead of a theft attack.
 * <p>
 * Spring Security's {@code PersistentTokenBasedRememberMeServices} throws
 * {@link CookieTheftException} when a request presents a valid series but a stale token, and
 * {@code AbstractRememberMeServices#autoLogin} (which is {@code final}, so it cannot be overridden)
 * RE-THROWS that single exception type — so it escapes the filter chain and surfaces to the user as
 * a raw HTTP 500, tripping the LB 500-alerter.
 * <p>
 * In this deployment the mismatch is overwhelmingly a FALSE POSITIVE, not theft: the UI is Vaadin,
 * which fires several requests concurrently (heartbeat + uidl + push), and they race to rotate the
 * single-use token; {@code InMemoryTokenRepositoryImpl} (per node, no shared store) widens the race
 * window further. The genuine security response still happens — {@code super.processAutoLoginCookie}
 * has already wiped the user's tokens before it throws — we only downgrade the OUTCOME so the request
 * proceeds unauthenticated (clean 302 to the login page) instead of a 500.
 * <p>
 * Mechanism: re-throw as a plain {@link RememberMeAuthenticationException} (the non-theft parent of
 * {@link CookieTheftException}). {@code autoLogin} catches that branch gracefully (cancel cookie +
 * return {@code null}), whereas it special-cases {@link CookieTheftException} into a re-throw.
 */
public class CookieTheftTolerantRememberMeServices extends JmixRememberMeServices {

    private static final Logger log = LoggerFactory.getLogger(CookieTheftTolerantRememberMeServices.class);

    public CookieTheftTolerantRememberMeServices(String key,
                                                 UserRepository userRepository,
                                                 PersistentTokenRepository tokenRepository) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected UserDetails processAutoLoginCookie(String[] cookieTokens,
                                                 HttpServletRequest request,
                                                 HttpServletResponse response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

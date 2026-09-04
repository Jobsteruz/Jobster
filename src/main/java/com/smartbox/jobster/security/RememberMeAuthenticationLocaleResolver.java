package com.smartbox.jobster.security;

import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.JmixOrder;
import io.jmix.core.security.AuthenticationLocaleResolver;
import org.jspecify.annotations.Nullable;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component("jb_RememberMeAuthenticationLocaleResolver")
public class RememberMeAuthenticationLocaleResolver implements AuthenticationLocaleResolver {

    @Override
    public boolean supports(Authentication authentication) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    @Override
    public Locale getLocale(Authentication authentication) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public int getOrder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.config.security;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.server.WrappedSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * On a fresh {@link VaadinSession} created right after a cross-instance failover restore,
 * hoist the locale stashed by {@link HazelcastAuthShareFilter#AUTH_LOCALE_ATTR} into the
 * VaadinSession <em>before</em> any view renders.
 * <p>
 * {@code MainView.applyUserLocale} also sets the locale, but it fires from {@code InitEvent} —
 * by then the layout components have already resolved their i18n keys against the request's
 * {@code Accept-Language} (typically English on this deployment), and those resolved strings
 * are baked into the rendered page. Setting the locale at session-init time guarantees every
 * subsequent message lookup uses the right bundle, so the first repaint after a failover
 * comes up in the user's chosen language instead of flipping to English.
 * <p>
 * No-op when the attribute is absent — initial logins go through Jmix's {@code LoginViewSupport}
 * which sets the locale on {@code AuthDetails}, so this listener only fires on restored sessions.
 */
@Component
public class FailoverLocaleInitListener implements VaadinServiceInitListener {

    private static final Logger log = LoggerFactory.getLogger(FailoverLocaleInitListener.class);

    @Override
    public void serviceInit(ServiceInitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

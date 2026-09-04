package com.smartbox.jobster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Permits unauthenticated POSTs to {@code /open/report-sender/callback}. The endpoint is
 * protected by a shared {@code X-API-Key} header verified inside
 * {@link com.smartbox.jobster.controller.open.ReportSenderCallbackController}, so Spring
 * Security does not need to enforce session authentication here.
 * <p>
 * CSRF is disabled because the worker is a backend service without browser context.
 * Priority is {@link Ordered#HIGHEST_PRECEDENCE} — this chain must win over Jmix' default
 * chain which would otherwise return 403 for anonymous POSTs.
 */
@Configuration
@EnableWebSecurity
public class ReportSenderSecurityConfiguration {

    @Bean("jb_ReportSenderSecurityFilterChain")
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SecurityFilterChain reportSenderSecurityFilterChain(HttpSecurity http) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

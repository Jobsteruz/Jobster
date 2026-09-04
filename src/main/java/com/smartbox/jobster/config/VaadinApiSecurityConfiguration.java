package com.smartbox.jobster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfigurationSource;

/**
 * Security configuration for internal API endpoints that are called from
 * Vaadin-embedded React components. These endpoints use session-based
 * authentication (JSESSIONID cookie) instead of OAuth2/Basic Auth.
 *
 * This filter chain has higher priority (Order 40) than the general
 * RestApiSecurityFilterChain (Order 50), so it matches first for
 * the specified paths.
 */
@Configuration
public class VaadinApiSecurityConfiguration {

    @Bean("jb_VaadinApiSecurityFilterChain")
    @Order(40)
    public SecurityFilterChain vaadinApiSecurityFilterChain(
            HttpSecurity http,
            CorsConfigurationSource corsConfigurationSource) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

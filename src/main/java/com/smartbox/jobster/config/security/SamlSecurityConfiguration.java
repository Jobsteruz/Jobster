package com.smartbox.jobster.config.security;

import com.smartbox.jobster.service.sso.DatabaseRelyingPartyRegistrationRepository;
import com.smartbox.jobster.service.sso.SamlAuthenticationSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * SAML 2.0 SSO Security Configuration.
 * Loads IdP configuration dynamically from JB_SSO_PROVIDER table (not application.properties).
 * Each company can add its own SSO provider via admin UI.
 */
@Configuration
public class SamlSecurityConfiguration {

    private final SamlAuthenticationSuccessHandler successHandler;
    private final DatabaseRelyingPartyRegistrationRepository registrationRepository;

    public SamlSecurityConfiguration(SamlAuthenticationSuccessHandler successHandler,
                                     DatabaseRelyingPartyRegistrationRepository registrationRepository) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("jb_SamlSecurityFilterChain")
    @Order(38)
    public SecurityFilterChain samlSecurityFilterChain(HttpSecurity http) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

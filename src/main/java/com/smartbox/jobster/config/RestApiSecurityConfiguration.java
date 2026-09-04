package com.smartbox.jobster.config;

import com.smartbox.jobster.config.security.SuperAdminEntityAuthorizationManager;
import com.smartbox.jobster.config.security.UserBoundTokenAuthorizationManager;
import com.smartbox.jobster.security.RoleAssignmentSecurityService;
import com.smartbox.jobster.security.filter.IpRestrictionFilter;
import com.smartbox.jobster.service.IpWhitelistService;
import io.jmix.core.security.UserRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
@EnableWebSecurity
public class RestApiSecurityConfiguration {

    @Bean("jb_IpRestrictionFilter")
    public IpRestrictionFilter ipRestrictionFilter(@Lazy IpWhitelistService ipWhitelistService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("jb_IpRestrictionFilterRegistration")
    public FilterRegistrationBean<IpRestrictionFilter> ipRestrictionFilterRegistration(IpRestrictionFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

//    @Bean("jb_HazelcastAuthShareFilter")
//    public HazelcastAuthShareFilter hazelcastAuthShareFilter(
//            @Qualifier("sessionAuth") IMap<String, byte[]> sessionAuth,
//            @Lazy UserRepository userRepository) {
//        return new HazelcastAuthShareFilter(sessionAuth, userRepository);
//    }
//
//    @Bean("jb_HazelcastAuthShareFilterRegistration")
//    public FilterRegistrationBean<HazelcastAuthShareFilter> hazelcastAuthShareFilterRegistration(
//            HazelcastAuthShareFilter hazelcastAuthShareFilter) {
//        FilterRegistrationBean<HazelcastAuthShareFilter> registration =
//                new FilterRegistrationBean<>(hazelcastAuthShareFilter);
//        registration.setOrder(-110); // Before Spring Security (-100)
//        registration.addUrlPatterns("/*");
//        return registration;
//    }

    @Bean("jb_CorsConfigurationSource")
    public CorsConfigurationSource corsConfigurationSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("jb_RestApiSecurityFilterChain")
    @Order(50)
    public SecurityFilterChain restApiSecurityFilterChain(HttpSecurity http,
                                                          IpRestrictionFilter ipRestrictionFilter,
                                                          @Lazy UserRepository userRepository,
                                                          @Lazy RegisteredClientRepository registeredClientRepository,
                                                          @Lazy RoleAssignmentSecurityService roleAssignmentSecurityService,
                                                          CorsConfigurationSource corsConfigurationSource) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

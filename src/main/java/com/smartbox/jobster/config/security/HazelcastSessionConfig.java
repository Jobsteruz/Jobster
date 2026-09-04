package com.smartbox.jobster.config.security;

import com.hazelcast.map.IMap;
import io.jmix.core.security.UserRepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Registers Hazelcast-based session sharing components when
 * {@code jb.session.registry.mode=hazelcast}.
 * <p>
 * Components:
 * - {@link HazelcastAuthShareFilter} — shares auth state via Hazelcast IMap + cookie
 * - {@link HazelcastSessionCleanupListener} — removes Hazelcast auth on session destroy
 */
@Configuration
@ConditionalOnProperty(name = "jb.session.registry.mode", havingValue = "hazelcast")
public class HazelcastSessionConfig {

    @Bean
    public FilterRegistrationBean<HazelcastAuthShareFilter> hazelcastAuthShareFilterRegistration(
            @Qualifier("sessionAuth") IMap<String, byte[]> sessionAuth,
            @Qualifier("sessionUserToken") IMap<String, String> sessionUserToken,
            ObjectProvider<UserRepository> userRepositoryProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public HazelcastSessionCleanupListener hazelcastSessionCleanupListener(
            @Qualifier("sessionAuth") IMap<String, byte[]> sessionAuth,
            @Qualifier("sessionUserToken") IMap<String, String> sessionUserToken) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

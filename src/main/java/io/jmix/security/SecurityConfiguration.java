/*
 * Copyright 2019 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.security;

import com.smartbox.jobster.security.CookieTheftTolerantRememberMeServices;
import com.smartbox.jobster.service.CompanyService;
import io.jmix.core.CoreConfiguration;
import io.jmix.core.CoreProperties;
import io.jmix.core.annotation.JmixModule;
import io.jmix.core.rememberme.JmixRememberMeServices;
import io.jmix.core.rememberme.RememberMeProperties;
import io.jmix.core.security.*;
import io.jmix.core.security.impl.AuthenticationManagerSupplierImpl;
import io.jmix.core.security.impl.JmixSessionAuthenticationStrategy;
import io.jmix.core.session.SessionProperties;
import io.jmix.security.authentication.StandardAuthenticationManagerSupplier;
import io.jmix.security.authentication.StandardAuthenticationProvidersProducer;
import io.jmix.security.impl.constraint.SecurityConstraintsRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.authentication.session.CompositeSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlAuthenticationStrategy;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices.DEFAULT_PARAMETER;

@Configuration
@ComponentScan
@ConfigurationPropertiesScan
@JmixModule(dependsOn = CoreConfiguration.class)
@PropertySource(name = "io.jmix.security", value = "classpath:/io/jmix/security/module.properties")
public class SecurityConfiguration {

    private static final Logger log = LoggerFactory.getLogger(SecurityConfiguration.class);

    @Autowired
    private CoreProperties coreProperties;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private SessionProperties sessionProperties;

    @Autowired
    private RememberMeProperties rememberMeProperties;

    @Autowired
    private UserRepository userRepository;

    @Value("${jb.session.registry.mode:local}")
    private String sessionRegistryMode;

    @Bean(name = "sec_SecurityConstraintsRegistration")
    public SecurityConstraintsRegistration constraintsRegistration() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    protected PersistentTokenRepository inMemoryRememberMeRepository() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("sec_rememberMeServices")
    public RememberMeServices rememberMeServices(PersistentTokenRepository rememberMeTokenRepository) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Primary
    @Bean
    public SessionAuthenticationStrategy sessionControlAuthenticationStrategy(SessionRegistry sessionRegistry) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected List<SessionAuthenticationStrategy> strategies(SessionRegistry sessionRegistry) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    public SessionAuthenticationStrategy jmixSessionAuthenticationStrategy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "sec_SessionRegistry")
    public SessionRegistry sessionRegistry(
            @Autowired(required = false) @Qualifier("sessionPrincipals") ConcurrentMap<Object, Set<String>> principals,
            @Autowired(required = false) @Qualifier("sessionIds") Map<String, SessionInformation> sessionIds,
            @Autowired(required = false) @Qualifier("sessionIps") Map<String, String> sessionIps) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "sec_HttpSessionEventPublisher")
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "sec_PreAuthenticationChecks")
    public PreAuthenticationChecks preAuthenticationChecks() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean(name = "sec_PostAuthenticationChecks")
    public PostAuthenticationChecks postAuthenticationChecks() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("sec_StandardAuthenticationManagerSupplier")
    @Order(200)
    public AddonAuthenticationManagerSupplier standardAuthenticationManagerSupplier(StandardAuthenticationProvidersProducer providersProducer,
                                                                                    ApplicationEventPublisher publisher) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("sec_AuthenticationManagerSupplier")
    public AuthenticationManagerSupplier authenticationManagerSupplier(List<AddonAuthenticationManagerSupplier> suppliers) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Global AuthenticationManager
     */
    @Bean("sec_AuthenticationManager")
    public AuthenticationManager authenticationManager(AuthenticationManagerSupplier authenticationManagerSupplier) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

package com.smartbox.jobster;

import com.google.common.base.Strings;
import com.smartbox.jobster.config.OAuth2TokenUserMixin;
import com.smartbox.jobster.entity.User;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.flow.theme.Theme;
import io.jmix.authserver.service.mapper.JdbcOAuth2AuthorizationServiceObjectMapperCustomizer;
import org.jsoup.nodes.Element;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@Push
@Theme(value = "jobster")
@PWA(name = "Jobster", shortName = "Jobster")
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class JobsterApplication implements AppShellConfigurator, VaadinServiceInitListener {

    @Value("${tg.web.app}")
    private boolean tgWebApp;

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    JdbcOAuth2AuthorizationServiceObjectMapperCustomizer tokenObjectMapperCustomizer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener
    public void printApplicationUrl(final ApplicationStartedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void serviceInit(ServiceInitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

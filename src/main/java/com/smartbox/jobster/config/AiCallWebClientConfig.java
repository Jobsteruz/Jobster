package com.smartbox.jobster.config;

import com.smartbox.jobster.entity.config.NetworkSettings;
import io.jmix.appsettings.AppSettings;
import io.netty.channel.ChannelOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.Base64;

@Configuration
public class AiCallWebClientConfig {

    @Autowired
    private AppSettings appSettings;

    @Bean("aiCallWebClient")
    public WebClient aiCallWebClient() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.bean;

import com.smartbox.jobster.entity.UserIntegration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class SpeechToTextConfig {

    @Bean
    @Qualifier("elevenLabsRestTemplate")
    public RestTemplate elevenLabsRestTemplate(RestTemplateBuilder builder) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
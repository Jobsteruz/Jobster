package com.smartbox.jobster.config;

import com.google.genai.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Slf4j
@Configuration
@ConditionalOnProperty("vertex.ai.gemini.enabled")
public class GeminiClientConfig {

    @Value("${vertex.ai.gemini.project-id}")
    private String projectId;

    @Value("${vertex.ai.gemini.location:us-central1}")
    private String location;

    @Bean
    public Client geminiClient() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("geminiStreamExecutor")
    public Executor geminiStreamExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
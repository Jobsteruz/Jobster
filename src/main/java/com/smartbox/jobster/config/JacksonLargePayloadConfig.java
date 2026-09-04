package com.smartbox.jobster.config;

import com.fasterxml.jackson.core.StreamReadConstraints;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Raises Jackson's default 20 MB per-string read limit so the {@code report-sender-service}
 * callback can deliver a Base64-encoded xlsx larger than that. Large candidate questionnaires
 * produce ~50k rows → ~17 MB xlsx → ~22 MB Base64, which exceeds the stock limit.
 * <p>
 * Applied once at startup to every {@code ObjectMapper} built via Spring's
 * {@code Jackson2ObjectMapperBuilder}, including Spring MVC's default.
 */
@Configuration
public class JacksonLargePayloadConfig {

    /** 200 MB — comfortably larger than any realistic single callback payload. */
    private static final int MAX_STRING_LENGTH = 200 * 1024 * 1024;

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer largePayloadCustomizer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.config.cvparser;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jobster.resume-parser")
public record ResumeParserProperties(
        String apiUrl,
        String username,
        String password,
        String callbackBaseUrl,
        int timeoutSeconds,
        int maxRetries
) {}

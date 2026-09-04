package com.smartbox.jobster.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Settings that tie Jobster4 to the {@code report-sender-service} microservice.
 * <p>
 * Required environment / properties:
 * <pre>
 *   jobster.report-sender.base-url    = http://<report-service-host>
 *   jobster.report-sender.api-key     = <shared secret>
 *   jobster.report-sender.callback-url = https://jobster4.example.com/app/open/report-sender/callback
 * </pre>
 * {@code callback-url} must be reachable from the worker container — in local development
 * use your tunnel (ngrok, cloudflared) or the docker-compose network alias.
 */
@Configuration
@ConfigurationProperties(prefix = "jobster.report-sender")
@Getter
@Setter
public class ReportSenderProperties {

    /** Base URL of report-sender-service, e.g. {@code http://<report-service-host>}. No trailing slash. */
    private String baseUrl;

    /** Shared secret used for the {@code X-API-Key} header in both directions. */
    private String apiKey;

    /** Public URL of Jobster4's callback endpoint — passed to the worker so it knows where to POST. */
    private String callbackUrl;

    /** Timeout (ms) for the initial "order" request. */
    private int connectTimeoutMs = 10_000;

    private int readTimeoutMs = 30_000;
}

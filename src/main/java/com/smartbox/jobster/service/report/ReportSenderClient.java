package com.smartbox.jobster.service.report;

import com.smartbox.jobster.config.ReportSenderProperties;
import com.smartbox.jobster.entity.report.ReportRequest;
import io.netty.channel.ChannelOption;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Thin wrapper around {@link WebClient} that posts a new task into
 * {@code report-sender-service}. All requests include the shared {@code X-API-Key}.
 * <p>
 * The service is intentionally dumb — it does not track status, retries, etc. The worker
 * owns that lifecycle; we only get notified via the callback endpoint.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ReportSenderClient {

    private final ReportSenderProperties properties;

    private WebClient webClient;

    @PostConstruct
    void init() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sends a POST /api/v1/report/order and returns the worker's taskId.
     * @throws ReportSenderException on any non-2xx response or transport error.
     */
    public String order(ReportRequest request, Map<String, Object> parameters) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static class ReportSenderException extends RuntimeException {
        public ReportSenderException(String message) { super(message); }
        public ReportSenderException(String message, Throwable cause) { super(message, cause); }
    }
}

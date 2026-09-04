package com.smartbox.jobster.service.ai.aisearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbox.jobster.dto.ApplicantAISearchDTO;
import com.smartbox.jobster.entity.UserIntegration;
import io.jmix.multitenancy.core.TenantProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.scheduler.Schedulers;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class ApplicantAISearchService {

    private static final Logger log = LoggerFactory.getLogger(ApplicantAISearchService.class);
    private static final Duration TIMEOUT = Duration.ofSeconds(3);

    private final WebClient webClient;
    private final TenantProvider tenantProvider;

    public ApplicantAISearchService(TenantProvider tenantProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record SearchFilter(
            @JsonProperty("query")
            String query,
            @JsonProperty("field")
            String field,
            @JsonProperty("operator")
            String operator
    ) {
    }

    public record AiSearchPromptResult(List<ApplicantAISearchService.SearchFilter> filters, String mode) {
    }

    public record SearchRequest(
            @JsonProperty("filters")
            List<SearchFilter> filters,
            @JsonProperty("offset")
            Integer offset,
            @JsonProperty("limit")
            Integer limit,
            @JsonProperty("collection_name")
            String collectionName,
            @JsonProperty("operator")
            String operator,
            @JsonProperty("important_value")
            String importantValue
    ) {
    }

    public record PromptSearchRequest(
            @JsonProperty("offset")
            Integer offset,
            @JsonProperty("limit")
            Integer limit,
            @JsonProperty("collection_name")
            String collectionName,
            @JsonProperty("important_value")
            String importantValue,
            @JsonProperty("prompt")
            String prompt,
            @JsonProperty("system_prompt")
            String systemPrompt
    ) {
    }

    public record SearchResponse(
            @JsonProperty("filters")
            Object filters,
            @JsonProperty("found")
            Integer found,
            @JsonProperty("results")
            List<SearchResult> results
    ) {
    }

    public record SearchResult(
            @JsonProperty("score")
            Double score,
            @JsonProperty("entity")
            ApplicantAISearchDTO entity
    ) {
    }

    public Future<SearchResponse> searchApplicants(String collectionName, List<SearchFilter> filters, Integer offset, Integer limit, String operator) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Future<SearchResponse> promptSearchApplicants(String collectionName, String prompt, Integer offset, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String createBasicAuthHeader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
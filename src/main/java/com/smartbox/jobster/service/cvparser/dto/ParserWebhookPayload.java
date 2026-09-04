package com.smartbox.jobster.service.cvparser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ParserWebhookPayload(
        @JsonProperty("job_id") String jobId,
        @NotBlank String status,
        ResumeParserResponse result,
        String error,
        @JsonProperty("created_at") String createdAt,
        @JsonProperty("completed_at") String completedAt
) {}

package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.jmix.core.FileRef;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
public class AiCallDataDto {
    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("company_number")
    private String companyNumber;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("tenant_id")
    private String tenantId;

    private String name;

    private String language;

    @JsonProperty("is_single_language")
    private Boolean isSingleLanguage;

    @JsonProperty("welcome_text")
    private String welcomeText;

    @JsonProperty("goodbye_text")
    private String goodbyeText;

    @JsonProperty("try_count")
    private Integer tryCount;

    private Integer id;

    private String prompt;

    private String status;

    @JsonProperty("audio_path")
    private String audioPath;

    @JsonProperty("audio_url")
    private String audioUrl;

    private FileRef audioFile;

    private List<AiCallMessageDto> messages;

    private List<AiCallQuestionDto> questions;

    private OffsetDateTime createdDate;
}

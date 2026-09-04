package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AiCallRequestDto {
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

    @JsonProperty("welcome_text")
    private String welcomeText;

    @JsonProperty("goodbye_text")
    private String goodbyeText;

    @JsonProperty("try_count")
    private Integer tryCount;

    private List<AiCallQuestionDto> questions;

    @JsonProperty("is_single_language")
    private Boolean isSingleLanguage;
}

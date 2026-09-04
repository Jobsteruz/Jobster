package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AiCallConditionDto {
    @JsonProperty("target_question_id")
    private Integer targetQuestionId;

    private String value;

    @JsonProperty("is_or")
    private Boolean isOr;
}
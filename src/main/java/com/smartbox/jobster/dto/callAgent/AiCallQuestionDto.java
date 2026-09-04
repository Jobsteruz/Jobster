package com.smartbox.jobster.dto.callAgent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AiCallQuestionDto {
    @JsonProperty("question_id")
    private Integer questionId;

    private Integer id;

    @JsonProperty("call_id")
    private Integer callId;

    private String question;

    @JsonProperty("expected_answers")
    private List<String> expectedAnswers;

    private List<AiCallConditionDto> conditions;

    private String answer;
}

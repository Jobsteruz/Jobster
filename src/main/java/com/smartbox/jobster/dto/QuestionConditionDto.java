package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class QuestionConditionDto {
    private UUID id;
    private UUID conditionQuestionId;
    private String condition;
    private Boolean skipped;
}

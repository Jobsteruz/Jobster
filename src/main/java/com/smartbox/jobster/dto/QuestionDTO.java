package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionDTO {
    private String id;
    private String text;
    private Integer sortOrder;
    private Boolean isTextAnswer;
    private List<QuestionAnswerDTO> answers;
    private List<QuestionConditionDto> conditions;
}

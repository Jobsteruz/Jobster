package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QuestionAnswerDTO {
    private String id;
    private String text;
    private Integer score;
}

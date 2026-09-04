package com.smartbox.jobster.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionRequestDTO {
    @NotBlank(message = "questionId must not be null")
    private String questionId;
    private String answerId;
    private String textAnswer;
}

package com.smartbox.jobster.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InterviewRequest {
    @NotNull(message = "questionAnswer must not be null")
    private List<QuestionRequestDTO> personAnswers;
}

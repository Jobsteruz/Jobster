package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class InterviewResponse {
    private String interviewId;
    private String questionnaireName;
    private Integer totalQuestions;
    private List<QuestionDTO> question;
}

package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InterviewResultDetailDTO {
    private Integer sortOrder;
    private String question;
    private String answer;
    private Integer score;
}

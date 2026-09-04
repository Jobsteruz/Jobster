package com.smartbox.jobster.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartInterviewRequest {
    @NotBlank(message = "applicantId must not be null")
    private String applicantId;
    @NotBlank(message = "questionnaireId must not be null")
    private String questionnaireId;
    @NotBlank(message = "locale must not be null")
    private String locale;
}

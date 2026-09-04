package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Setter
@Getter
public class QuestionnaireDTO {
    private UUID id;
    private String name;
    private String icon;
    private Integer questionCount;
    private OffsetDateTime createdDate;
}

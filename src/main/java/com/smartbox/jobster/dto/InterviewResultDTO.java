package com.smartbox.jobster.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Setter
@Getter
public class InterviewResultDTO {
    private UUID id;
    private String name;
    private Integer totalScore;
    private Integer earnedScore;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private Boolean recommended;
    private String manager;
    private UUID managerId;
    private String managerPhoto;
}

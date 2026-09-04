package com.smartbox.jobster.service.restservices.landingpage;

import io.jmix.core.FileRef;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Setter
@Getter
public abstract class AbstractVacancyDTO {
    private final UUID id;
    private final Boolean hot;
    private final RefDTO position;
    private final DepartmentDTO department;
    private final RefDTO region;
    private final OffsetDateTime verifiedDate;
    private final String type;
    private final String employmentType;
    private final String salaryMin;
    private final String salaryMax;
    private final String memo;
    private final FileRef photoUrl;
    private final String responsibility;
}

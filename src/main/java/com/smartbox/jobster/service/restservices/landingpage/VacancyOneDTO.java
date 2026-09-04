package com.smartbox.jobster.service.restservices.landingpage;

import io.jmix.core.FileRef;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
public class VacancyOneDTO extends AbstractVacancyDTO {
    private final RefDTO experience;
    private final RefDTO education;


    public VacancyOneDTO(UUID id, Boolean hot, RefDTO position, DepartmentDTO department, RefDTO region, OffsetDateTime verifiedDate, String type, String employmentType, String salaryMin, String salaryMax, String memo, FileRef photoUrl, String responsibility, RefDTO experience, RefDTO education) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

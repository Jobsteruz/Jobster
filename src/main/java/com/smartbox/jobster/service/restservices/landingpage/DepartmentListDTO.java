package com.smartbox.jobster.service.restservices.landingpage;

import io.jmix.core.FileRef;
import java.util.UUID;

/**
 * DTO for department list response
 */
public record DepartmentListDTO(
        UUID id,
        String name,
        String shortName,
        RefDTO parent,
        RefDTO region,
        String location,
        String phone,
        String email,
        Integer sort,
        FileRef photo,
        Long activeVacancyCount
) {
}
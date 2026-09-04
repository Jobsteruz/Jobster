package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record DepartmentResponseDTO(
        String platformId,
        String name,
        String shortName,
        String tinyName,
        String legalCompanyPlatformId,
        Boolean active,
        String parentPlatformId,
        String tenantId) implements Serializable {
}

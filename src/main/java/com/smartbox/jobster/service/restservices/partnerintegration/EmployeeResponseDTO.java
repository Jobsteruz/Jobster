package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record EmployeeResponseDTO(
        String platformId,
        String fullName,
        String companyPlatformId,
        String status,
        String staffPlanPlatformId) implements Serializable {
}

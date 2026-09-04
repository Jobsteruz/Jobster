package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record StaffingTableDTO(
        String platformId,
        String positionPlatformId,
        String departmentPlatformId) implements Serializable {
}

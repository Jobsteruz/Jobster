package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record DepartmentDTO(
                String platformId,
                String name,
                String shortName,
                String tinyName,
                String companyPlatformId,
                String parentId,
                String regionId) implements Serializable {
}

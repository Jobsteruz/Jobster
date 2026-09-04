package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LegalCompanyDTO(
        String platformId,
        String name,
        String shortName) implements Serializable {
}

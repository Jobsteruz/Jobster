package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LegalCompanyResponseDTO(
        UUID id,
        String platformId,
        String name,
        String tenantId) implements Serializable {
}

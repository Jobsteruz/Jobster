package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record PositionResponseDTO(
        String platformId,
        String name,
        String shortName,
        Boolean active) implements Serializable {
}

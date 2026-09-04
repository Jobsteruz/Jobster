package com.smartbox.jobster.service.restservices.partnerintegration;

import java.io.Serializable;

public record PositionDTO(
        String platformId,
        String name,
        String shortName,
        Boolean active) implements Serializable {
}

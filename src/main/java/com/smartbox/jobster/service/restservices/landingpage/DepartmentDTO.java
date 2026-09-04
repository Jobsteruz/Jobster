package com.smartbox.jobster.service.restservices.landingpage;

import java.util.UUID;

public record DepartmentDTO(
        UUID id,
        String name,
        String address,
        Float latitude,
        Float longitude,
        RefDTO type
) {
}

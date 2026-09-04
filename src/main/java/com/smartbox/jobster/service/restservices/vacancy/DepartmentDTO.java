package com.smartbox.jobster.service.restservices.vacancy;

import java.util.List;
import java.util.UUID;

public record DepartmentDTO(UUID id, String name, String shortName, List<DepartmentDTO> children) {
}

package com.smartbox.jobster.service.restservices.employee;

import java.util.UUID;

public record AllEmployeeFilterDTO(UUID position, UUID department, String phone, String search, String staffNumber,
                                   String roleName, Integer offset, Integer limit) {
}

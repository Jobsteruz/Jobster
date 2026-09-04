package com.smartbox.jobster.service.restservices.applicant.managerDTOs;

import java.util.UUID;

public record ApplicantByManagerRequestDTO(UUID kanban, UUID manager, String status, Integer offset, Integer limit,
                                           ApplicantFilterDTO filter) {
}

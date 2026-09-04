package com.smartbox.jobster.service.restservices.applicant.managerDTOs;

import java.util.UUID;

public record ApplicantFilterDTO(UUID position, UUID department, UUID category, String phone) {
}

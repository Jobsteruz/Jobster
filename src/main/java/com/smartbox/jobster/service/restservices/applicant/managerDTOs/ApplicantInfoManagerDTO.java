package com.smartbox.jobster.service.restservices.applicant.managerDTOs;

import io.jmix.core.FileRef;

import java.util.List;

public record ApplicantInfoManagerDTO(FileRef photo, List<DynamicApplicantDTO> fields) {
}

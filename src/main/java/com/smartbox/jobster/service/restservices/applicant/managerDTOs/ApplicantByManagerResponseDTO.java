package com.smartbox.jobster.service.restservices.applicant.managerDTOs;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.EventResponse;
import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.UUID;

public record ApplicantByManagerResponseDTO(UUID id, String fullName, OffsetDateTime birthDate, FileRef photo, Platform platform, String status,
                                            OffsetDateTime fillDate, Position position, Department department,
                                            OffsetDateTime eventTime, EventResponse eventResponse) {
}

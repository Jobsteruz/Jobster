package com.smartbox.jobster.service.restservices.adaptation;

import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.UUID;

public record AdaptationEmployeeDTO(UUID id, String fullName, FileRef photo, String phone, OffsetDateTime birthDate,
                                    String department, String position, String role,
                                    UUID stageId, String stage, String stageColor,
                                    Long daysOnStage, Boolean stageOverdue, Long daysInMonitoring,
                                    OffsetDateTime stageDate, OffsetDateTime monitoringStartDate,
                                    String status, Boolean awaitingConfirmation, Boolean canRespond) {
}

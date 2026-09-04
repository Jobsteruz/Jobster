package com.smartbox.jobster.service.restservices.applicant.managerDTOs;

import java.util.UUID;

public record ManagerResponseDTO(UUID applicant, UUID manager, UUID kanban, UUID cancelReason, String status,
                                 String commentary) {
}

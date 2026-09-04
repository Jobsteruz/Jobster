package com.smartbox.jobster.service.restservices.adaptation;

import java.util.UUID;

public record AdaptationManagerResponseDTO(UUID employee, UUID kanban, String status, String commentary,
                                           UUID cancelReason) {
}

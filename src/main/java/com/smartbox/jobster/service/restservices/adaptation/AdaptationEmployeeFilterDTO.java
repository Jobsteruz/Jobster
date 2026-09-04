package com.smartbox.jobster.service.restservices.adaptation;

import java.util.UUID;

public record AdaptationEmployeeFilterDTO(UUID position, UUID department, UUID stage, String phone,
                                          Boolean awaitingConfirmation) {
}

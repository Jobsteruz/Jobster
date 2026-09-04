package com.smartbox.jobster.service.restservices.adaptation;

import java.time.LocalDate;
import java.util.UUID;

public record CompleteAdaptationDTO(UUID employee, UUID exitReason, LocalDate date, String comment) {
}

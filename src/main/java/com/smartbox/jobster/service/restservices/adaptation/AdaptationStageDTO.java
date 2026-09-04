package com.smartbox.jobster.service.restservices.adaptation;

import java.util.UUID;

public record AdaptationStageDTO(UUID id, String name, String color, Integer sort, Integer deadline) {
}

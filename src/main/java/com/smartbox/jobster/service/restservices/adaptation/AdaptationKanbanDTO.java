package com.smartbox.jobster.service.restservices.adaptation;

import java.util.List;
import java.util.UUID;

public record AdaptationKanbanDTO(UUID id, String name, List<AdaptationStageDTO> stages) {
}

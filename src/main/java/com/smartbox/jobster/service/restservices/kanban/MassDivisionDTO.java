package com.smartbox.jobster.service.restservices.kanban;

import java.util.List;
import java.util.UUID;

public record MassDivisionDTO(String entityName, List<UUID> entities, UUID vacancy, UUID responsible, UUID roleType) {
}

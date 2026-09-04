package com.smartbox.jobster.service.restservices.kanban;

import java.util.List;
import java.util.UUID;

public record MassActionDTO(UUID autoFillTemplateId, String autoFillMessage, String autoFillSMS, List<String> platforms,
                            UUID cancelReasonId, String comment, List<MassEntityDTO> entities) {
}

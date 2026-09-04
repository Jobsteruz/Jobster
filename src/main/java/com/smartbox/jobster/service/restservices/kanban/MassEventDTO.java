package com.smartbox.jobster.service.restservices.kanban;

import java.util.List;
import java.util.UUID;

public record MassEventDTO(List<UUID> entities, String title, String comment, UUID autoFillTemplate,
                           String autoFillMessage, String autoFillSMS, List<String> platforms, UUID responsible,
                           UUID branch, String priority, String startDateTime, String endDateTime) {
}

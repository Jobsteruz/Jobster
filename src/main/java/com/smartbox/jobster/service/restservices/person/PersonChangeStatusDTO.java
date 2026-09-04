package com.smartbox.jobster.service.restservices.person;

import java.util.List;
import java.util.UUID;

public record PersonChangeStatusDTO(UUID stageId, UUID personId, UUID cancelReasonId, String comment,
                                    UUID autoFillTemplateId, String autoFillMessage, String autoFillSMS,
                                    List<String> platforms, String status, String entityName) {
}

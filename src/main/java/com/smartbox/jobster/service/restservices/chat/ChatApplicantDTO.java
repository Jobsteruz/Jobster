package com.smartbox.jobster.service.restservices.chat;

import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.UUID;

public record ChatApplicantDTO(UUID id, FileRef photo, String applicantName, OffsetDateTime date, Long unreadCount) {
}

package com.smartbox.jobster.service.restservices.messagehistory;

import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.UUID;

public record ApplicantUnreadCountResDTO(UUID id, String fullName, FileRef photo, OffsetDateTime date, Long unreadCount) {
}

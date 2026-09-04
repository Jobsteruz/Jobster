package com.smartbox.jobster.service.restservices.person;

import com.smartbox.jobster.entity.ats.Platform;
import io.jmix.core.FileRef;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public record PersonKanbanDTO(UUID id, FileRef photo, Platform platform, String fullName, String position,
                              OffsetDateTime fillDate, Boolean failDeadLine, List<String> properties) {
}

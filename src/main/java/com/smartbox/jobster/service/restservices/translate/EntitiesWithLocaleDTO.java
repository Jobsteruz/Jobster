package com.smartbox.jobster.service.restservices.translate;

import java.util.List;
import java.util.UUID;

public record EntitiesWithLocaleDTO(List<UUID> ids, String locale) {
}

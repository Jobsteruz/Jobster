package com.smartbox.jobster.service.restservices.translate;

import org.json.JSONObject;

import java.util.UUID;

public record TranslateEntityDTO(UUID id, JSONObject translates) {
}

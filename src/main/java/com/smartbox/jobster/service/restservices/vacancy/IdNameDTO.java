package com.smartbox.jobster.service.restservices.vacancy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.UUID;

/**
 * Compact reference DTO — only id + display name.
 * Used by REST API responses to avoid Jmix _instance_name extra system fields.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record IdNameDTO(UUID id, String name) implements Serializable {
}

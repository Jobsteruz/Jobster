package com.smartbox.jobster.service.restservices.request;

import java.util.UUID;

public record RequestTypeDTO(UUID id, String code, String name, Integer sort) {
}

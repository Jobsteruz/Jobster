package com.smartbox.jobster.service.restservices.request;

import java.util.UUID;

public record RequestCancelReasonDTO(UUID id, String code, String name, Integer sort) {
}

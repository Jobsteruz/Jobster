package com.smartbox.jobster.service.restservices.applicant;

import java.util.UUID;

public record CancelReasonDTO(UUID id, String code, String name, Boolean refused, Integer sort) {
}

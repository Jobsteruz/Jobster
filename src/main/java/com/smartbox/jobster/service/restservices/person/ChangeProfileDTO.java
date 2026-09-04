package com.smartbox.jobster.service.restservices.person;

import java.util.UUID;

public record ChangeProfileDTO(UUID id, String photo, String fullName, String email, String phone) {
}

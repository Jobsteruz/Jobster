package com.smartbox.jobster.service.restservices.landingpage;

import java.util.UUID;

/**
 * Data Transfer Object for applicant response.
 * Used for API responses in the landing page controller.
 */
public record ApplicantResponseDTO(
        UUID applicantId,
        String botLink
) {
}
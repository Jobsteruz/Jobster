package com.smartbox.jobster.service.restservices.landingpage;

import java.util.UUID;

/**
 * Data Transfer Object for applicant answers.
 * Used for API requests in the landing page controller.
 */
public record QuestionAnswerDTO(
        UUID question,
        String answer
) {
}
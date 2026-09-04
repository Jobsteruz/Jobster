package com.smartbox.jobster.service.restservices.landingpage;

import java.util.UUID;

/**
 * Data Transfer Object for QuestionCondition entity.
 * Used for API responses in the landing page controller.
 */
public record QuestionConditionDTO(
        UUID id,
        UUID conditionQuestionId,
        String conditionEntityField,
        String condition,
        Boolean skipped
) {
}
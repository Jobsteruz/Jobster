package com.smartbox.jobster.service.restservices.landingpage;

import java.util.List;
import java.util.UUID;

/**
 * Data Transfer Object for Question entity.
 * Used for API responses in the landing page controller.
 */
public record QuestionDTO(
        UUID id,
        Integer sort,
        Boolean required,
        String question,
        String shortQuestion,
        String questionType,
        String pattern,
        List<RefDTO> entities,
        List<?> options,
        List<QuestionConditionDTO> conditions
) {
}

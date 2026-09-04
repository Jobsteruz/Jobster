package com.smartbox.jobster.service.restservices.applicant;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

public record IshGOCandidateExperienceDTO(
        String company,
        String position,
        String description,
        OffsetDateTime startDate,
        OffsetDateTime endDate
) implements Serializable {
    @Serial
    private static final long serialVersionUID = -288089811234943937L;
}
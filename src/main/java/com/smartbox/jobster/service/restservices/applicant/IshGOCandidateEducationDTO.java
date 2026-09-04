package com.smartbox.jobster.service.restservices.applicant;

import java.io.Serial;
import java.io.Serializable;

public record IshGOCandidateEducationDTO(
        String level,
        String institution,
        String specialization,
        Integer yearOfStart,
        Integer yearOfEnd,
        String comment
) implements Serializable {
    @Serial
    private static final long serialVersionUID = -3911382776163467827L;
}
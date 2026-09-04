package com.smartbox.jobster.service.restservices.applicant;

import java.io.Serial;
import java.io.Serializable;

public record IshGOLanguageDTO(
        String name,
        String locale,
        String level
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 9050035576504138058L;
}
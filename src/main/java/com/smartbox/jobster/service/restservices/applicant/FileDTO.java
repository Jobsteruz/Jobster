package com.smartbox.jobster.service.restservices.applicant;

import java.io.Serial;
import java.io.Serializable;

public record FileDTO(String name, String url) implements Serializable {
    @Serial
    private static final long serialVersionUID = -6504702521515802770L;
}

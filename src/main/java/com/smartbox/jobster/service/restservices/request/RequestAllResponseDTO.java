package com.smartbox.jobster.service.restservices.request;

import com.smartbox.jobster.entity.hrm.Vacancy;
import io.jmix.core.FileRef;

public record RequestAllResponseDTO(Vacancy request, FileRef photo) {
}

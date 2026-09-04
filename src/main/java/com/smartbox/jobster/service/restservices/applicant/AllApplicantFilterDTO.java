package com.smartbox.jobster.service.restservices.applicant;

import java.util.UUID;

public record AllApplicantFilterDTO(UUID position, UUID department, UUID personCategory, String phone, String search, Integer offset,
                                    Integer limit, String status) {
}

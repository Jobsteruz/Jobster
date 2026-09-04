package com.smartbox.jobster.controller;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

public record GeneralApplicantReportDto(
        UUID id,
        String code,
        String vacancyCode,
        String fullName,
        String status,
        String region,
        String department,
        String position,
        String utmSource,
        String source,
        String utmParam,
        String email,
        String phone,
        String phone2,
        String gender,
        OffsetDateTime birthDate,
        String pinfl,
        String education,
        String salaryLevel,
        String experience,
        String responsible,
        Boolean employeeOrNot,
        String category,
        String group,
        Integer age,
        String address,
        OffsetDateTime rejectDate,
        String rejectReason,
        Map<UUID, OffsetDateTime> stageDates,
        OffsetDateTime fillDate
) {
}

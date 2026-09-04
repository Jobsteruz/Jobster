package com.smartbox.jobster.service.restservices.vacancy;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Response DTO for {@code api_vacancyService/getVacancies}.
 * Mirrors {@code vacancy-list-view.xml} columnVisibility (30 entity fields).
 * Computed UI columns (departmentHierarchy, currentWorkplaceQty, daysOpen,
 * closedApplicants, publishedPlatforms) intentionally excluded.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record VacancyApiResponseDTO(
        UUID id,
        String code,
        IdNameDTO position,
        IdNameDTO department,
        IdNameDTO education,
        IdNameDTO experience,
        IdNameDTO schedule,
        BigDecimal salaryMin,
        BigDecimal salaryMax,
        String condition,
        String requirement,
        String responsibility,
        IdNameDTO author,
        IdNameDTO requestAuthor,
        IdNameDTO verifier,
        OffsetDateTime verifiedDate,
        IdNameDTO responsible,
        IdNameDTO closedBy,
        OffsetDateTime closedDate,
        IdNameDTO cancelReason,
        Integer workplaceQty,
        Boolean hot,
        String platform,
        String gender,
        String employmentType,
        IdNameDTO request,
        String status,
        String type,
        OffsetDateTime fillDate,
        OffsetDateTime createdDate,
        Boolean manualClosed) implements Serializable {
}

package com.smartbox.jobster.service.cvparser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResumeParserResponse(
        String fullName,
        String firstName,
        String lastName,
        String middleName,
        String birthDate,
        String phone,
        String email,
        String gender,
        String experience,
        String education,
        String address,
        BigDecimal salaryMin,
        BigDecimal salaryMax,
        String salaryCurrency,
        List<LanguageItem> languages,
        List<ExperienceItem> experiences,
        List<EducationItem> educations,
        String photo
) implements Serializable {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record LanguageItem(String languageName, String languageLevel) implements Serializable {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ExperienceItem(
            String title,
            String position,
            String description,
            String from,
            String to
    ) implements Serializable {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record EducationItem(
            String title,
            String description,
            String from,
            String to
    ) implements Serializable {}
}

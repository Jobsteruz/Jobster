package com.smartbox.jobster.service.restservices.vacancy;

import com.smartbox.jobster.service.restservices.request.VacancyLanguageDTO;

import java.util.List;
import java.util.UUID;

public record VacancyDTO(String id, UUID request, UUID department, UUID position,
                         Integer quantity, Boolean hot, String status, String type, UUID education, UUID experience,
                         String gender, String hhExperience, String hhSchedule, String employmentType, String salaryMin,
                         String salaryMax, String currency, UUID responsible, UUID form, String condition,
                         String requirement, String responsibility, List<VacancyLanguageDTO> languages, String schedule) {
}

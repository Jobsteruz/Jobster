package com.smartbox.jobster.service.restservices.request;

import java.util.List;

public record RequestDTO(String id, String department, String position,
                         Integer quantity, String education, String experience, String gender, String salaryMin,
                         String salaryMax, String currency, String author, String condition,
                         String requirement, String responsibility, List<VacancyLanguageDTO> languages,
                         String memo, String requiredDate, String requestType, String priority, String schedule,
                         String personGroup) {
}

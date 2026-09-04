package com.smartbox.jobster.service.restservices.applicant;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;

public record ApplicantVacancyDTO(Vacancy vacancy, Employee employee) {
}

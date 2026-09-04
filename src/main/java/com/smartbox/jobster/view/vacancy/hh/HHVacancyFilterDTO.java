package com.smartbox.jobster.view.vacancy.hh;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.VacancyStatus;

public record HHVacancyFilterDTO(Department department, Position position, User responsible, VacancyStatus status, String code) {
}

package com.smartbox.jobster.service.restservices.employee;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireEntityLabel;

import java.util.List;

public record EmployeeInfoResDTO(List<QuestionnaireEntityLabel> labels, Employee employee, Department department) {
}

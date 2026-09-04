package com.smartbox.jobster.view.reports.reviewedapplicants;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.view.reports.monitoringbyemployees.FilterItem;

import java.time.OffsetDateTime;

public record ReviewedApplicantsReportDTO(OffsetDateTime from, OffsetDateTime to,
                                          FilterItem<Region> region, FilterItem<Position> position,
                                          FilterItem<Employee> manager, User user) {
}
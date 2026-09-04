package com.smartbox.jobster.view.reports.statisticsonrecruiters.poistionrecruiterchart;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;

import java.time.LocalDate;
import java.util.List;

public record PositionRecruiterChartFilter(
        Position position,
        List<RoleType> roleTypes,
        LocalDate from,
        LocalDate to,
        Employee employee) {
}

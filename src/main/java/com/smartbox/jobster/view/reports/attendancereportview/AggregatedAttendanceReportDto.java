package com.smartbox.jobster.view.reports.attendancereportview;

import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_AggregatedAttendanceReportDto")
@Getter
@Setter
public class AggregatedAttendanceReportDto implements Serializable {

    private static final long serialVersionUID = 2146190185819868217L;

    private Employee employee;
    private Double totalRegularHours;
    private Double totalOvertimeHours;
}

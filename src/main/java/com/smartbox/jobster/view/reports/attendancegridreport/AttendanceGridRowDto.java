package com.smartbox.jobster.view.reports.attendancegridreport;

import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@JmixEntity(name = "jb_AttendanceGridRowDto")
@Getter
@Setter
public class AttendanceGridRowDto implements Serializable {

    private static final long serialVersionUID = -1234567890L;

    private Employee employee;

    @InstanceName
    private String employeeName;

    private String employeeCode;

    private Double totalHours = 0.0;

    private Map<LocalDate, Double> dailyHours = new HashMap<>();

    public Double getHoursByDate(LocalDate date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

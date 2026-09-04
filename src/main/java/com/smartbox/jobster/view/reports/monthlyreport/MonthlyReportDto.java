package com.smartbox.jobster.view.reports.monthlyreport;

import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_MonthlyReportDto")
@Getter
@Setter
public class MonthlyReportDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Employee employee;

    private String departmentName;

    private Integer workedDays;

    private Double totalRegularHours;

    private Double totalOvertimeHours;

    @JmixProperty
    public Double getTotalHours() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.reports.turnoverreport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurnoverReportDTO {
    private TurnoverKpiDTO kpi;
    private List<TurnoverMonthlyDTO> trend;
    private List<EmployeeLeaverDTO> leavers;
}

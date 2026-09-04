package com.smartbox.jobster.view.reports.staffcompleteness;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffCompletenessByDeptReportDTO {
    private List<StaffCompletenessDTO> rows;
    private StaffCompletenessDTO total;
    private double overallRate;
    private int totalVacant;
    private int totalPositions;
}

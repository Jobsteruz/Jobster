package com.smartbox.jobster.view.reports.averageprocessingtimereport;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public record AverageProcessingTimeDTO(
        List<KanbanStage> stages,
        Map<Employee, Map<UUID, StageMetric>> data
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 8392854729384571092L;

    public record StageMetric(long count, double avgDays) implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;
    }
}

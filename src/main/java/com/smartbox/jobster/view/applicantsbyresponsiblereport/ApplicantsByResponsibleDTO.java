package com.smartbox.jobster.view.applicantsbyresponsiblereport;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * DTO for ApplicantsByResponsibleReport
 * Contains stages, data per responsible employee, and totals per stage
 * Uses stage ID (UUID) as key for uniqueness
 */
public record ApplicantsByResponsibleDTO(
        List<KanbanStage> stages,
        Map<Employee, Map<UUID, Long>> data,
        Map<UUID, Long> notSetData,
        Map<UUID, Long> totals
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 7391847366384572066L;
}

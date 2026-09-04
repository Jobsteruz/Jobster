package com.smartbox.jobster.view.reports.stage_entity_movement.applicant_movement;

import com.smartbox.jobster.config.caching.SupportsCaching;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author Jobster team
 * date: 02/07/24 18:42
 */
public record ApplicantMovementDto(
        Kanban kanban,
        OffsetDateTime startDate, OffsetDateTime endDate,
        List<KanbanStage> kanbanStages,
        Position position, BranchType branchType,
        Department department, Employee responsible,
        PersonStatus personStatus) implements SupportsCaching {

    public String key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean equals(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public int hashCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

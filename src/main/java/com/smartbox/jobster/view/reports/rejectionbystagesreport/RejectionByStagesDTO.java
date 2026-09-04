package com.smartbox.jobster.view.reports.rejectionbystagesreport;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;

public record RejectionByStagesDTO(List<KanbanStage> stages, OffsetDateTime from, OffsetDateTime to,
                                   Set<Position> position, Set<Department> department, Set<User> responsible) {
}

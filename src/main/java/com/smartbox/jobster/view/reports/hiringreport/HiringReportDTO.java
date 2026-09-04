package com.smartbox.jobster.view.reports.hiringreport;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;

public record HiringReportDTO(OffsetDateTime from, OffsetDateTime to, KanbanStage appCountStage,
                              KanbanStage rejectCountStage, RoleType recruiterRole) {
}

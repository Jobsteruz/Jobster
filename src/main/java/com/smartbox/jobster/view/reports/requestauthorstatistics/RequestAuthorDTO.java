package com.smartbox.jobster.view.reports.requestauthorstatistics;


import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * @author Jobster team
 * Since: 2/17/2025 12:13 PM
 */
public record RequestAuthorDTO(List<RoleType> roleTypes, KanbanStage stage,
                               OffsetDateTime from, OffsetDateTime to) {
}

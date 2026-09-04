package com.smartbox.jobster.view.reports.branch_processing;

import com.smartbox.jobster.config.caching.JbCacheKeyMaker;
import com.smartbox.jobster.config.caching.SupportsCaching;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;
import java.util.List;

public record BranchProcStageEntitiesDto(Department department,
                                         KanbanStage stage,
                                         List<Position> positions,
                                         User responsible,
                                         OffsetDateTime from,
                                         OffsetDateTime to) implements SupportsCaching, JbCacheKeyMaker {

    public String key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

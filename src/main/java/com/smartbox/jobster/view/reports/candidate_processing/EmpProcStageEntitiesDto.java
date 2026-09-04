package com.smartbox.jobster.view.reports.candidate_processing;

import com.smartbox.jobster.config.caching.JbCacheKeyMaker;
import com.smartbox.jobster.config.caching.SupportsCaching;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;

import java.time.OffsetDateTime;

/**
 * @author Jobster team
 * date: 06/07/24 15:47
 */

public record EmpProcStageEntitiesDto(Employee employee, KanbanStage stage, CandidateProcessingFilter filter,
                                      OffsetDateTime from, OffsetDateTime to) implements SupportsCaching, JbCacheKeyMaker {

    public String key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

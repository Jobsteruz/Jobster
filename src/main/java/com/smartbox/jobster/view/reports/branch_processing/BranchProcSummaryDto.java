package com.smartbox.jobster.view.reports.branch_processing;

import com.smartbox.jobster.config.caching.JbCacheKeyMaker;
import com.smartbox.jobster.config.caching.SupportsCaching;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * "Отчёт по филиалам" ning oxirgi jamlovchi ustunlari (Отказ / Резерв / Hire) uchun DTO.
 * <p>
 * {@code status} — REJECTED yoki RESERVED (reject/reserve ustunlari uchun); hire ustunida {@code null}.
 * Etap kesimi yo'q — bu ustunlar butun kanban + filial (subtree) bo'yicha sanaladi.
 */
public record BranchProcSummaryDto(Department department,
                                   PersonStatus status,
                                   Kanban kanban,
                                   List<Position> positions,
                                   User responsible,
                                   OffsetDateTime from,
                                   OffsetDateTime to) implements SupportsCaching, JbCacheKeyMaker {

    public String key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

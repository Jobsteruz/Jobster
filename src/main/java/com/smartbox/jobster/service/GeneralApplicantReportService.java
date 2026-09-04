package com.smartbox.jobster.service;

import com.smartbox.jobster.config.replica.UseReplica;
import com.smartbox.jobster.controller.GeneralApplicantReportDto;
import com.smartbox.jobster.controller.GeneralApplicantReportPageDto;
import com.smartbox.jobster.controller.GeneralApplicantReportStageDto;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.entity.KeyValueEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@UseReplica
public class GeneralApplicantReportService {

    private final DataManager dataManager;
    private final InstanceNameProvider instanceNameProvider;
    private final ReportService reportService;

    public GeneralApplicantReportPageDto getReport(int offset, int limit, UUID kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KanbanStage> loadStages(UUID kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, RejectionDetails> loadRejectionDetails(Collection<UUID> applicantIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, OffsetDateTime> loadStageDates(List<KanbanStage> stages, List<UUID> applicantIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private GeneralApplicantReportDto toDto(
            Applicant applicant,
            RejectionDetails rejection,
            List<KanbanStage> stages,
            Map<String, OffsetDateTime> stageDates
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String instanceName(JbEntity<?> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record RejectionDetails(OffsetDateTime rejectDate, String rejectReason) {
    }
}

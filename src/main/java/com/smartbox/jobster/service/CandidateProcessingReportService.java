package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.ReportDataDto;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.reports.candidate_processing.CandidateProcessingFilter;
import com.smartbox.jobster.view.reports.candidate_processing.EmpProcStageEntitiesDto;
import com.smartbox.jobster.view.reports.candidate_processing.UserProcessedEntitiesDto;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import lombok.RequiredArgsConstructor;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@UseReplica
public class CandidateProcessingReportService {

    private final InstanceNameProvider instanceNameProvider;
    private final Messages messages;
    private final KanbanStageHistoryService kanbanStageHistoryService;
    private final ReportService reportService;
    private final KanbanService kanbanService;
    private final EmployeeService employeeService;
    private final EntityService entityService;


    public List<ReportDataDto<String>> getData(OffsetDateTime from, OffsetDateTime to, Integer offset, Integer limit,
                                               Kanban kanban, RoleType roleType, List<Department> departments, Boolean isCache) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Birinchi ("Новые") bosqich ustuni hisobotdan olib tashlanadi.
     * <p>
     * Sababi — {@code countEmpProcessedEntities} faqat shu bosqich uchun KanbanStageHistory'dagi
     * ko'chirishlarga QO'SHIMCHA ravishda {@code fillDate} bo'yicha yangi arizalarni ham qo'shadi
     * (ya'ni boshqa ustunlar bilan bir xil semantikada emas), shuning uchun uning soni qolgan
     * bosqichlar bilan solishtirib bo'lmaydigan chiqardi. Ekran versiyasi bilan bir xil bo'lishi
     * uchun mobil/REST varianti ham xuddi shunday tashlab ketadi.
     */
    private List<KanbanStage> withoutFirstStage(List<KanbanStage> stages, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

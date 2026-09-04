package com.smartbox.jobster.controller;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.CandidateProcessingReportService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.GeneralApplicantReportService;
import io.jmix.core.FetchPlan;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/landing-page/report")
@RequiredArgsConstructor
public class ReportController {
    private static final int MAX_REPORT_LIMIT = 500;

    private final CandidateProcessingReportService candidateProcessingReportService;
    private final EntityService entityService;
    private final GeneralApplicantReportService generalApplicantReportService;

    @GetMapping("/candidate-processing-report")
    public ResponseEntity<List<ReportDataDto<String>>> getCandidateProcessingReport(
            @RequestParam String from, @RequestParam String to,
            @RequestParam(defaultValue = "0", required = false) Integer offset,
            @RequestParam(defaultValue = "50", required = false) Integer limit,
            @RequestParam UUID kanbanId,
            @RequestParam(required = false) UUID roleTypeId,
            @RequestParam(required = false) List<UUID> departmentIds,
            @RequestParam(required = false) Boolean isCache
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @GetMapping("/general-applicants")
    public ResponseEntity<GeneralApplicantReportPageDto> getGeneralApplicantsReport(
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "50") int limit,
            @RequestParam UUID kanbanId
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

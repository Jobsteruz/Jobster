package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.report.ReportGroup;
import com.smartbox.jobster.entity.report.ReportKanbanStage;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import io.jmix.core.SaveContext;

import java.util.List;

/**
 * @author Jobster team
 * Since: 7/9/2024 1:42 AM
 */
public class CloneReport extends AbstractCloning implements CloneBuilder {
    ReportService reportService;

    public CloneReport(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneReports(ReportGroup sourceGroup, ReportGroup group, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneReportStages(ReportView sourceReport, ReportView reportView, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

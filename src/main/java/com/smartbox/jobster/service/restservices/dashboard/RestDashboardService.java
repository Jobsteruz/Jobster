package com.smartbox.jobster.service.restservices.dashboard;


import com.smartbox.jobster.$;
import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.view.reports.AbstractReportView;
import io.jmix.flowui.view.ViewInfo;
import io.jmix.flowui.view.ViewRegistry;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

@RestService("api_DashboardService")
@RequiredArgsConstructor
public class RestDashboardService {
    private static final Logger log = LoggerFactory.getLogger(RestDashboardService.class);
    private final ReportService reportService;
    private final ViewRegistry viewRegistry;


    @RestMethod
    public List<DashboardDTO> getDashboards(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod
    public ReportDTO getDashboardReport(String viewId, List<ReportFilterDTO> filters, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @Nullable AbstractReportView createInstanceReportView(String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.reports.ai.overview;

import com.smartbox.jobster.service.ai.AiUsageReportService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.ai.AbstractAiUsageReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.chartsflowui.component.Chart;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@Route(value = "ai-usage-overview", layout = MainView.class)
@ViewController(id = "jb_AiUsageOverview")
@ViewDescriptor(path = "ai-usage-overview-report.xml")
public class AiUsageOverviewReport extends AbstractAiUsageReport {

    @Autowired
    private AiUsageReportService aiUsageReportService;

    @ViewComponent
    private KeyValueCollectionContainer kvDailyRequests;
    @ViewComponent
    private Chart chartDonut;

    // KPI value spans
    @ViewComponent
    private Span kpiRequestsValue;
    @ViewComponent
    private Span kpiTokensValue;
    @ViewComponent
    private Span kpiCostValue;
    @ViewComponent
    private Span kpiDurationValue;
    @ViewComponent
    private Span kpiSuccessRateValue;

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadKpi() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadDailyChart() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ─── Helpers ─────────────────────────────────────────────────────────

    private String formatNumber(long value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatDuration(double ms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

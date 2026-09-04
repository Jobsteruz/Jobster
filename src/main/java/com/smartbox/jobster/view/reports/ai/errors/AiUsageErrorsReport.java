package com.smartbox.jobster.view.reports.ai.errors;

import com.smartbox.jobster.service.ai.AiUsageReportService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.ai.AbstractAiUsageReport;
import com.vaadin.flow.component.ClickEvent;
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
@Route(value = "ai-usage-errors", layout = MainView.class)
@ViewController(id = "jb_AiUsageErrors")
@ViewDescriptor(path = "ai-usage-errors-report.xml")
public class AiUsageErrorsReport extends AbstractAiUsageReport {

    @Autowired
    private AiUsageReportService aiUsageReportService;

    @ViewComponent
    private KeyValueCollectionContainer kvDailyErrors;
    @ViewComponent
    private KeyValueCollectionContainer kvTopErrors;
    @ViewComponent
    private Chart chartErrorsByModel;
    @ViewComponent
    private Chart chartErrorsByFeature;

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

    private void loadErrorsByModel() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadErrorsByFeature() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

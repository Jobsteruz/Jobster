package com.smartbox.jobster.view.reports.ai.cost;

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
@Route(value = "ai-usage-cost", layout = MainView.class)
@ViewController(id = "jb_AiUsageCost")
@ViewDescriptor(path = "ai-usage-cost-report.xml")
public class AiUsageCostReport extends AbstractAiUsageReport {

    @Autowired
    private AiUsageReportService aiUsageReportService;

    @ViewComponent
    private KeyValueCollectionContainer kvDailyCost;
    @ViewComponent
    private Chart chartCostByFeature;
    @ViewComponent
    private Chart chartCostByModel;

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

    private void loadCostByFeature() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadCostByModel() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

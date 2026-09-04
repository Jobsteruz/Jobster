package com.smartbox.jobster.view.dashboard.limits;

import com.smartbox.jobster.service.DashboardLimitsService;
import com.smartbox.jobster.service.DashboardLimitsService.DashboardLimits;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

@Route(value = "limits-dashboard", layout = MainView.class)
@ViewController("jb_LimitsDashboard")
@ViewDescriptor("limits-dashboard-view.xml")
public class LimitsDashboardView extends AbstractReportView {

    @Autowired
    private DashboardLimitsService limitsService;

    @ViewComponent
    private Span smsValue;
    @ViewComponent
    private Span emailValue;
    @ViewComponent
    private Span aiValue;
    @ViewComponent
    private Span botValue;

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Supplier<Runnable> backgroundLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refreshBtn", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatNumber(long value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

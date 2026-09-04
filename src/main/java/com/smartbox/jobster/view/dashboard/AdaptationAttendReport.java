package com.smartbox.jobster.view.dashboard;


import com.smartbox.jobster.$;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;

@Route(value = "adaptation-attend-report", layout = MainView.class)
@ViewController("jb_AdaptationAttendReport")
@ViewDescriptor("adaptation-attend-report.xml")
public class AdaptationAttendReport extends AbstractHasPeriodReport {

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;


    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Supplier<Runnable> backgroundLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
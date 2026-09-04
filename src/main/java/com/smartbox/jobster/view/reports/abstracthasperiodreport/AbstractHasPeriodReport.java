package com.smartbox.jobster.view.reports.abstracthasperiodreport;


import com.smartbox.jobster.bean.JbUserZonedDateTime;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.utils.ZonedDateUtils;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Route(value = "abstract-has-period-report", layout = MainView.class)
@ViewController("jb_AbstractHasPeriodReport")
@ViewDescriptor("abstract-has-period-report.xml")
public abstract class AbstractHasPeriodReport extends AbstractReportView {

    @ViewComponent
    protected TypedDatePicker<LocalDate> from;
    @ViewComponent
    protected TypedDatePicker<LocalDate> to;

    @ViewComponent
    protected JmixSelect<ReportPeriod> reportPeriodSelection;
    @Autowired
    private JbUserZonedDateTime userZonedDateTime;


    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("reportPeriodSelection")
    public void onReportPeriodSelectionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportPeriod>, ReportPeriod> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected OffsetDateTime getFromOffsetDateTime() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected OffsetDateTime getToOffsetDateTime() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("from")
    public void onFromComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>,
            LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("to")
    public void onToComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>,
            LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
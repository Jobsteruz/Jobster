package com.smartbox.jobster.view.dashboard;


import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.view.abstractview.AsyncDataLoad;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

@Route(value = "report-request-monthly", layout = MainView.class)
@ViewController(id = "jb_ReportRequestMonthly")
@ViewDescriptor(path = "report-request-monthly.xml")
public class ReportRequestMonthly extends AbstractHasPeriodReport {
    @Autowired
    private RequestService requestService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @ViewComponent
    private EntityComboBox<User> userField;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private EntityComboBox<Department> departmentField;
    @ViewComponent
    private EntityComboBox<CancelReason> cancelReasonField;
    @ViewComponent
    private KeyValueCollectionContainer keyValueDc;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionLoader<Department> departmentDl;
    @ViewComponent
    private CollectionLoader<CancelReason> cancelReasonDl;

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setKeyValueToDc(List<Object[]> values) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Supplier<Runnable> backgroundLoad() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
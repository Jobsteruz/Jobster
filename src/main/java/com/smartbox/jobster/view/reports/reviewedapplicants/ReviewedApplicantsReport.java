package com.smartbox.jobster.view.reports.reviewedapplicants;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.StandardEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.ReportFilterCondition;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.monitoringbyemployees.FilterItem;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Route(value = "reviewed-applicants-view", layout = MainView.class)
@ViewController("jb_ReviewedApplicantsView")
@ViewDescriptor("reviewed-applicants-report.xml")
public class ReviewedApplicantsReport extends AbstractHasPeriodReport {
    @Autowired
    private UserService userService;

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private EntityComboBox<Position> positions;
    @ViewComponent
    private JmixMultiSelectComboBox<Position> positionsMulti;
    @ViewComponent
    private JmixSelect<ReportFilterCondition> positionCondition;
    @ViewComponent
    private EntityComboBox<Region> regions;
    @ViewComponent
    private JmixMultiSelectComboBox<Region> regionsMulti;
    @ViewComponent
    private JmixSelect<ReportFilterCondition> regionCondition;
    @ViewComponent
    private JmixSelect<ReportFilterCondition> employeeCondition;
    @ViewComponent
    private EntityComboBox<Employee> employees;
    @ViewComponent
    private JmixMultiSelectComboBox<Employee> employeesMulti;
    @ViewComponent
    private JmixCheckbox number;
    @ViewComponent
    private DataGrid<Object> dataGrid;
    @ViewComponent
    private DataGrid<Object> dataGrid2;
    @ViewComponent
    private KeyValueCollectionContainer kvCollection2;
    @ViewComponent
    private JmixButton excel;


    @Subscribe("positionCondition")
    public void onPositionConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition>
                                                                event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionCondition")
    public void onRegionConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeeCondition")
    public void onEmployeeConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regions")
    public void onRegionsComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Region>, Region> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionsMulti")
    public void onRegionsMultiComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Region>, Set<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positions")
    public void onPositionsComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionsMulti")
    public void onPositionsMultiComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Position>, Set<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employees")
    public void onEmployeesComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Employee>, Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeesMulti")
    public void onEmployeesMultiComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Employee>, Set<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }











    @Subscribe(id = "number", subject = "clickListener")
    public void onNumberClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ReviewedApplicantsReportDTO getDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends StandardEntity> FilterItem<T> getFilter(JmixSelect<ReportFilterCondition> filterCondition, EntityComboBox<T> comboBox, JmixMultiSelectComboBox<T> multiComboBox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.datePending", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridDatePendingRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.dateAccepted", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridDateAcceptedRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.dateRejected", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridDateRejectedRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull TextRenderer<KeyValueEntity> getKeyValueEntityDateRenderer(String key) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
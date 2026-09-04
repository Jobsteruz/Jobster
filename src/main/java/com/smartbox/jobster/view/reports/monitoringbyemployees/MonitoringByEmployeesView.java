package com.smartbox.jobster.view.reports.monitoringbyemployees;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.ReportFilterCondition;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.averageprocessingtimereport.EntityDto;
import com.smartbox.jobster.view.reports.averageprocessingtimereport.RoleTypeDTO;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.text.NumberFormat;
import java.time.OffsetDateTime;
import java.util.*;

@Route(value = "monitoring-by-employees-view", layout = MainView.class)
@ViewController("jb_MonitoringByEmployeesView")
@ViewDescriptor("monitoring-by-employees-view.xml")
public class MonitoringByEmployeesView extends AbstractHasPeriodReport {
    private static final String STAGE_KEY = "stage";

    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private ReportService reportService;
    @Autowired
    private Messages messages;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private JmixSelect<ReportFilterCondition> positionCondition;
    @ViewComponent
    private JmixSelect<ReportFilterCondition> branchTypeCondition;
    @ViewComponent
    private JmixSelect<ReportFilterCondition> branchCondition;
    @ViewComponent
    private DataGrid<EmployeeDTO> dataGrid;
    @ViewComponent
    private CollectionContainer<EmployeeDTO> employeeDc;
    @ViewComponent
    private EntityComboBox<Position> positions;
    @ViewComponent
    private JmixMultiSelectComboBox<Position> positionsMulti;
    @ViewComponent
    private EntityComboBox<Department> branches;
    @ViewComponent
    private JmixMultiSelectComboBox<Department> branchesMulti;
    @ViewComponent
    private EntityComboBox<BranchType> branchType;
    @ViewComponent
    private JmixMultiSelectComboBox<BranchType> branchTypeMulti;
    @ViewComponent
    private CollectionLoader<BranchType> branchTypeDl;
    @ViewComponent
    private CollectionLoader<Department> branchDl;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionLoader<Kanban> kanbanDl;
    @ViewComponent
    private EntityComboBox<Kanban> kanban;
    @ViewComponent
    private CollectionContainer<Kanban> kanbanDc;


    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionCondition")
    public void onPositionConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition>
                                                                event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchCondition")
    public void onBranchConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition>
                                                              event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchTypeCondition")
    public void onBranchTypeConditionComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportFilterCondition>, ReportFilterCondition>
                                                                  event) {
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

    @Subscribe("branchType")
    public void onBranchTypeComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<BranchType>, BranchType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchTypeMulti")
    public void onBranchTypeMultiComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<BranchType>, Set<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branches")
    public void onBranchesComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Department>, Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("branchesMulti")
    public void onBranchesMultiComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Department>, Set<?>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanban")
    public void onKanbanComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Kanban>, Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addColumn(Map<Serializable, Map<EmployeeDTO, Long>> itemsMap, PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addItems(Map<Serializable, Map<EmployeeDTO, Long>> itemsMap, PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FilterItem<Position> positionFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FilterItem<BranchType> branchTypeFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FilterItem<Department> departmentFilter() {
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
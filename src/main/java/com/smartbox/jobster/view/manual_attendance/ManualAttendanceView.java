package com.smartbox.jobster.view.manual_attendance;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.manual_attendance.manual_absent_reasons_info.ManualAbsentReasonsInfoView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridSortOrder;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.provider.SortDirection;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;


@Route(value = "manual-attendance-view", layout = MainView.class)
@ViewController("jb_ManualAttendanceView")
@ViewDescriptor("manual-attendance-view.xml")
public class ManualAttendanceView extends AbstractCachingSupport {
    private static final Logger log = LoggerFactory.getLogger(ManualAttendanceView.class);

    protected TreeComboBox<Department> branchesTreeComboBox;

    @ViewComponent
    protected CollectionContainer<EmployeeDto> employeeDc;
    @ViewComponent
    protected HorizontalLayout branchesBoxWrapper;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private HorizontalLayout manualAttendanceGridBox;
    @ViewComponent
    protected DataGrid<EmployeeDto> employeeGrid;

    @Autowired
    private Dialogs dialogs;

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void refreshEmployeeRow(EmployeeDto employeeDto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "absentReasonsInfo", subject = "clickListener")
    public void onAbsentReasonsInfoClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setLockers(Department parentDep) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component getUnlockerComponent(Collection<Department> departments, LocalDate lockDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component getLockerComponent(Collection<Department> departmentsToLock, LocalDate lockDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loopDays(Consumer<LocalDate> consumer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addExtraColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TreeComboBox<Department> getBranchesComboBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
package com.smartbox.jobster.view.reports.attendancegridreport;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.ReportPeriod;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Route(value = "attendance-grid-report-view", layout = MainView.class)
@ViewController(id = "jb_AttendanceGridReportView")
@ViewDescriptor(path = "attendance-grid-report-view.xml")
public class AttendanceGridReportView extends AbstractHasPeriodReport {

    private static final String DATE_COLUMN_PREFIX = "date_";

    @ViewComponent
    private CollectionContainer<AttendanceGridRowDto> attendanceGridRowsDc;

    @ViewComponent
    private DataGrid<AttendanceGridRowDto> dataGrid;

    @Autowired
    private AttendanceService attendanceService;

    @ViewComponent("dataGrid.printExcel")
    private ExcelExportAction dataGridPrintExcel;

    @ViewComponent
    private JmixSelect<Employee> employee;

    @ViewComponent
    private Div departmentsWrapper;

    @ViewComponent
    private Checkbox includeNormal;

    @ViewComponent
    private Checkbox includeOvertime;

    private TreeComboBox<Department> treeComboBox;

    @Override
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employee")
    public void onEmployeeComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("includeNormal")
    public void onIncludeNormalComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<Checkbox, Boolean> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("includeOvertime")
    public void onIncludeOvertimeComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<Checkbox, Boolean> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

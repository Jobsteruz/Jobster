package com.smartbox.jobster.view.reports.dailyattendancereport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "daily-attendance-report-view", layout = MainView.class)
@ViewController(id = "jb_DailyAttendanceReportView")
@ViewDescriptor(path = "daily-attendance-report-view.xml")
public class DailyAttendanceReportView extends AbstractHasPeriodReport {

    @ViewComponent
    private CollectionContainer<DailyAttendanceDto> dailyAttendanceDc;
    @Autowired
    private AttendanceService attendanceService;
    @ViewComponent("dataGrid.printExcel")
    private ExcelExportAction dataGridPrintExcel;

    @ViewComponent
    private JmixSelect<Employee> employee;

    @ViewComponent
    private Div departmentsWrapper;

    private TreeComboBox<Department> treeComboBox;

    @Override
    public void onBeforeShow(BeforeShowEvent event) {
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

    @Supply(to = "dataGrid.date", subject = "renderer")
    private Renderer<DailyAttendanceDto> dataGridDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.checkIn", subject = "renderer")
    private Renderer<DailyAttendanceDto> dataGridCheckInRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.checkOut", subject = "renderer")
    private Renderer<DailyAttendanceDto> dataGridCheckOutRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.overtime", subject = "renderer")
    private Renderer<DailyAttendanceDto> dataGridOvertimeRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employee")
    public void onEmployeeComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
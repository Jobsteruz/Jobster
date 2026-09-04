package com.smartbox.jobster.view.reports.monthlyreport;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.service.attendance.AttendanceService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.ReportPeriod;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "monthly-report-view", layout = MainView.class)
@ViewController(id = "jb_MonthlyReportView")
@ViewDescriptor(path = "monthly-report-view.xml")
public class MonthlyReportView extends AbstractHasPeriodReport {

    @ViewComponent
    private CollectionContainer<MonthlyReportDto> monthlyReportDc;

    @Autowired
    private AttendanceService attendanceService;

    @ViewComponent("dataGrid.printExcel")
    private ExcelExportAction dataGridPrintExcel;

    @ViewComponent
    private Div departmentsWrapper;

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
}

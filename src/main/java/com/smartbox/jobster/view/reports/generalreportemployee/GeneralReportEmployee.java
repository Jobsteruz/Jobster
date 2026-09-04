package com.smartbox.jobster.view.reports.generalreportemployee;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.ExitEmployee;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.EmployeeKanbanInfoView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Route(value = "general-report-employee", layout = MainView.class)
@ViewController(id = "jb_GeneralReportEmployee")
@ViewDescriptor(path = "general-report-employee.xml")
public class GeneralReportEmployee extends AbstractReportView {

    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private TranslateService translateService;
    @ViewComponent
    private DataGrid<Employee> dataGrid;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DataManager dataManager;

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildBoardStage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dataGrid")
    public void onDataGridItemDoubleClick(final ItemDoubleClickEvent<Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
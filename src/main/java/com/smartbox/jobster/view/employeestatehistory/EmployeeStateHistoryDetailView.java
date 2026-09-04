package com.smartbox.jobster.view.employeestatehistory;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeeStateHistory;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "employee-state-histories/:id", layout = MainView.class)
@ViewController(id = "jb_EmployeeStateHistory.detail")
@ViewDescriptor(path = "employee-state-history-detail-view.xml")
@EditedEntityContainer("employeeStateHistoryDc")
public class EmployeeStateHistoryDetailView extends AbstractDetailView<EmployeeStateHistory> {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<EmployeeStateHistory> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
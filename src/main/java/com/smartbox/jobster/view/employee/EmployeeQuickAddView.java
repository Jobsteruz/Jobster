package com.smartbox.jobster.view.employee;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.CustomQuickAdd;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "employeeQuckAdd/:id", layout = MainView.class)
@ViewController("jb_Employee.quickAdd")
@ViewDescriptor("employee-quick-add-view.xml")
@EditedEntityContainer("employeeDc")
@DialogMode(draggable = false)
public class EmployeeQuickAddView extends CustomQuickAdd<Employee> {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private Messages messages;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeSave(BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
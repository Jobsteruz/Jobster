package com.smartbox.jobster.view.employee;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.view.abstractview.AbstractPersonDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "employees/:id", layout = MainView.class)
@ViewController("jb_Employee.detail")
@ViewDescriptor("employee-detail-view.xml")
@EditedEntityContainer("employeeDc")
@DialogMode(width = "80em", height = "100%")
public class EmployeeDetailView extends AbstractPersonDetailView<Employee> {
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private Messages messages;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private TypedTextField<String> departmentField;
    @ViewComponent
    private TypedTextField<String> employmentType;
    @ViewComponent
    private EntityComboBox<User> user;
    @ViewComponent
    private EntityComboBox<Position> position;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponentsWhenEdit() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
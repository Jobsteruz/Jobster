package com.smartbox.jobster.view.requeststatusnotify;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Route(value = "request-status-notify-employee-view", layout = MainView.class)
@ViewController(id = "jb_RequestStatusNotifyEmployeeView")
@ViewDescriptor(path = "request-status-notify-employee-view.xml")
@DialogMode(width = "50em", height = "AUTO")
public class RequestStatusNotifyEmployeeView extends StandardView {

    @ViewComponent
    private CollectionContainer<Employee> employeesDc;
    @ViewComponent
    private DataGrid<Employee> employeesDataGrid;

    @Setter
    private List<Employee> employees;

    @Getter
    private List<Employee> selectedEmployees;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeesDataGrid.remove")
    public void onRemove(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveAndCloseBtn", subject = "clickListener")
    public void onSaveClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeBtn", subject = "clickListener")
    public void onCloseClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

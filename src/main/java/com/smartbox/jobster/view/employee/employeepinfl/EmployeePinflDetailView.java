package com.smartbox.jobster.view.employee.employeepinfl;

import com.smartbox.jobster.entity.hrm.EmployeePinfl;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "employee-pinfls/:id", layout = MainView.class)
@ViewController(id = "jb_EmployeePinfl.detail")
@ViewDescriptor(path = "employee-pinfl-detail-view.xml")
@EditedEntityContainer("employeePinflDc")
@DialogMode(width = "50%")
public class EmployeePinflDetailView extends AbstractDetailView<EmployeePinfl> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
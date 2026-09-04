package com.smartbox.jobster.view.employee.employeepinfl;

import com.smartbox.jobster.entity.hrm.EmployeePinfl;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.mapping.entitymapping.EntityMappingView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "employee-pinfls", layout = MainView.class)
@ViewController(id = "jb_EmployeePinfl.list")
@ViewDescriptor(path = "employee-pinfl-list-view.xml")
@DialogMode(width = "64em")
public class EmployeePinflListView extends AbstractListView<EmployeePinfl> {


    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private DialogWindows dialogWindows;


    @Subscribe("entityDataGrid.upload")
    public void onEntityDataGridUpload(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
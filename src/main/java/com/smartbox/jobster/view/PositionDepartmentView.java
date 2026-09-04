package com.smartbox.jobster.view;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.department.DepartmentListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySet;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.data.grid.DataGridItems;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Route(value = "position-department-view", layout = MainView.class)
@ViewController(id = "jb_PositionDepartmentView")
@ViewDescriptor(path = "position-department-view.xml")
@DialogMode(width = "40em", height = "AUTO")
public class PositionDepartmentView extends StandardView {
    @ViewComponent
    private CollectionLoader<Department> departmentDl;
    @ViewComponent
    private CollectionContainer<Department> departmentDc;
    @ViewComponent
    private DataGrid<Department> departmentsDataGrid;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DataManager dataManager;
    @Setter
    private Position position;
    @Setter
    private SaveContext saveContext;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isDepartmentAlreadyLoaded(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveAndCloseBtn", subject = "clickListener")
    public void onSaveAndCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeBtn", subject = "clickListener")
    public void onCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "departmentsDataGrid.add", subject = "viewConfigurer")
    private void departmentsDataGridAddViewConfigurer(final DepartmentListView departmentListView) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentsDataGrid.remove")
    public void onDepartmentsDataGridRemove(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isStaffingTableAlreadyInSaveContext(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void removeStaffingTableFromSaveContext(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
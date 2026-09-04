package com.smartbox.jobster.view.department;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.security.specific.UiPartnerIntegrationMatchBtnEnabled;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.view.abstractview.AbstractTreeListView;
import com.smartbox.jobster.view.action.department.BulkEditDepartmentView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.orgchart.OrgChartView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Route(value = "departments", layout = MainView.class)
@ViewController("jb_Department.list")
@ViewDescriptor("department-list-view.xml")
@DialogMode(width = "64em", height = "48em")
public class DepartmentListView extends AbstractTreeListView<Department> {
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private UserService userService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private RoleService roleService;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Button partnerintegrationMatchBtn;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.remove")
    public void onEntityDataGridRemove(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("orgChart")
    public void onOrgChart(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("partnerintegrationMatch")
    public void onPartnerIntegrationMatch(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("sync")
    public void onSync(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.bulkEdit")
    public void onEntityDataGridBulkEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.clone")
    public void onEntityDataGridClone(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPosition(Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.address", subject = "renderer")
    private Renderer<Department> entityDataGridAddressRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<Department> getChildren(Department item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
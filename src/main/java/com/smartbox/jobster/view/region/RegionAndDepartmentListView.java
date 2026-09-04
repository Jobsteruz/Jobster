package com.smartbox.jobster.view.region;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.DocumentationUrlEnum;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.security.specific.UiEditGenericFilterEnabled;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.action.department.BulkEditDepartmentView;
import com.smartbox.jobster.view.department.DepartmentDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.orgchart.OrgChartView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.GridSelectionModel;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.flowui.view.navigation.ViewClassNavigator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;


@Route(value = "regionsAndDepartments", layout = MainView.class)
@ViewController("jb_Region_And_jb_Department.list")
@ViewDescriptor("region-and-department-list-view.xml")
@LookupComponent("regionsDataGrid")
@DialogMode(width = "64em")
public class RegionAndDepartmentListView extends AbstractNavigationListView<Department> {
    private String query;

    @Autowired
    private ViewNavigators viewNavigators;
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
    @ViewComponent
    private MessageBundle messageBundle;

    @ViewComponent
    private CollectionLoader<Department> departmentsDl;
    @ViewComponent
    private TreeDataGrid<Region> regionsDataGrid;
    @ViewComponent
    private DataGrid<Department> departmentsDataGrid;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private GenericFilter genericFilter;
//    @ViewComponent
//    private JmixMultiSelectComboBox<Object> filter;
//    @ViewComponent
//    private Icon filterBtn;
    @ViewComponent
    private CollectionLoader<Region> regionsDl;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private Timer timer;
    @ViewComponent
    private CollectionContainer<Region> regionsDc;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void startTimer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionsDataGrid")
    public void onRegionsDataGridItemClick(final ItemClickEvent<Region> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("orgChart")
    public void onOrgChart(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("sync")
    public void onSync(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentsDataGrid.bulkEdit")
    public void onDepartmentsDataGridBulkEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentsDataGrid.clone")
    public void onDepartmentsDataGridClone(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentsDataGrid")
    public void onDepartmentsDataGridItemClick(final ItemClickEvent<Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "departmentsDataGrid.create", subject = "initializer")
    private void departmentsDataGridCreateInitializer(final Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Department> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<Department> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "guideBtn", subject = "clickListener")
    public void onGuideBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
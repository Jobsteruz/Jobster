package com.smartbox.jobster.view.orgchart;

import com.flowingcode.vaadin.addons.orgchart.OrgChart;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.DocumentationUrlEnum;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.department.DepartmentDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.EmployeeKanbanInfoView;
import com.smartbox.jobster.view.region.RegionAndDepartmentListView;
import com.smartbox.jobster.view.request.RequestDetailView;
import com.vaadin.componentfactory.TreeComboBox;
import io.jmix.flowui.download.Downloader;
import com.smartbox.jobster.service.OrgChartExcelService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.Resources;
import io.jmix.flowui.*;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Route(value = "org-chart", layout = MainView.class)
@ViewController("jb_OrgChartView")
@ViewDescriptor("org-chart-view.xml")
public class OrgChartView extends AbstractNavigationView {
    private Department department;

    @Autowired
    private Notifications notifications;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private Resources resources;
    @Autowired
    private Downloader downloader;
    @Autowired
    private OrgChartExcelService orgChartExcelService;
    @Autowired
    private DepartmentService departmentService;

    @ViewComponent
    private VerticalLayout orgChartLayout;
    @ViewComponent
    private JmixButton createBtn;
    @ViewComponent
    private HorizontalLayout labelBox;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private Timer timer;
    @ViewComponent
    private VerticalLayout departmentsTreeSelectLayout;
    @ViewComponent
    private CollectionContainer<Department> departmentsDc;
    @ViewComponent
    private CollectionLoader<Department> departmentsDl;


    @Override
    public void onNavigationQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDepartmentSelection() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "createBtn", subject = "clickListener")
    public void onCreateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "switchBtn", subject = "clickListener")
    public void onSwitchBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildOrgChart(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildLabel(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDoubleClickListener(OrgChart orgChart) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    public void onNodeDoubleClick(String depId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    public void onImgClick(String empId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void removeDepartment(Department department, Department removedDep) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void editDepartment(Department department, Department editedDep) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createRequest(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneDepartment(Department department, Department toClone) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDepartment(Department department, Department addedDep) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startTimer(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "guideBtn", subject = "clickListener")
    public void onGuideBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "excelBtn", subject = "clickListener")
    public void onExcelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.trainee;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.datepicker.WeekStart;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.AbsentReason;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.trainee.TraineeGroup;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.entity.trainee.TraineeGroupTrainer;
import com.smartbox.jobster.entity.trainee.attendance.TraineeGroupAttendance;
import com.smartbox.jobster.entity.trainee.attendance.TraineeInternAttendance;
import com.smartbox.jobster.entity.trainee.config.TraineeGroupConfig;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.TraineeService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.trainee.mastergroupconfig.TraineeGroupConfigMasterView;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.dom.DomEventListener;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.kit.action.BaseAction;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

import static com.smartbox.jobster.component.ComponentUtils.createHbox;
import static com.smartbox.jobster.component.ComponentUtils.getAvatarColorIndex;

@Route(value = "trainee-group-view", layout = MainView.class)
@ViewController("jb_TraineeGroupView")
@ViewDescriptor("trainee-group-view.xml")
public class TraineeGroupView extends AbstractNavigationListView<TraineeGroup> {
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    private List<TraineeGroup> traineeGroups;
    private String query;

    // data
    @ViewComponent
    private CollectionLoader<TraineeGroupIntern> internsDl;
    @ViewComponent
    private CollectionLoader<TraineeGroup> groupsDl;
    @ViewComponent
    private CollectionContainer<AbsentReason> absentReasonDc;
    @ViewComponent
    private CollectionLoader<AbsentReason> absentReasonDl;

    @ViewComponent
    private MessageBundle messageBundle;

    // grids
    @ViewComponent
    private DataGrid<TraineeGroup> groupsDataGrid;
    @ViewComponent
    private DataGrid<TraineeGroupIntern> attendanceDataGrid;
    @ViewComponent
    private DataGrid<TraineeGroupIntern> gradeDataGrid;
    @ViewComponent
    private DataGrid<TraineeGroupIntern> internsDataGrid;

    // beans
    @Autowired
    private TraineeService traineeService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UserService userService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;

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

    @Subscribe("groupsDataGrid")
    public void onGroupsDataGridItemClick(final ItemClickEvent<TraineeGroup> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void groupsDataGridSelectEvent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("filter")
    public void onFilterComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // renderers
    @Supply(to = "groupsDataGrid.name", subject = "renderer")
    private Renderer<TraineeGroup> groupsDataGridNameRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "internsDataGrid.intern", subject = "renderer")
    private Renderer<TraineeGroupIntern> internsDataGridInternRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "internsDataGrid.group", subject = "renderer")
    private Renderer<TraineeGroupIntern> internsDataGridGroupRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "attendanceDataGrid.intern", subject = "renderer")
    private Renderer<TraineeGroupIntern> attendanceDataGridInternRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "gradeDataGrid.grade", subject = "renderer")
    private Renderer<TraineeGroupIntern> gradeDataGridGradeRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "gradeDataGrid.intern", subject = "renderer")
    private Renderer<TraineeGroupIntern> gradeDataGridInternRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupInternsTable(TraineeGroup group) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupAttendanceTable(TraineeGroup group) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void changeInternGroup(TraineeGroupIntern groupIntern, TraineeGroup oldGroup, TraineeGroup newGroup) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private ComponentRenderer<Component, TraineeGroupIntern> createTraineeRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private ValueProvider<TraineeGroupIntern, Component> createAttendanceRenderer(TraineeGroupAttendance groupAttendance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private BaseAction createCancelAction(Consumer<ActionPerformedEvent> handler) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component createAttendanceHeader(TraineeGroupAttendance attendance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addStars(HorizontalLayout starGroup, Integer nullableGrade, int maxGrade, boolean editable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("groupsDataGrid.closeGroup")
    public void onGroupsDataGridCloseGroup(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void closeGroup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<TraineeGroup> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "groupSetting", subject = "clickListener")
    public void onGroupSettingClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
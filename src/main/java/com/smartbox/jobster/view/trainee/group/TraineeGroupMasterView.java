package com.smartbox.jobster.view.trainee.group;

import com.flowingcode.vaadin.addons.twincolgrid.TwinColGrid;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.trainee.TraineeGroup;
import com.smartbox.jobster.entity.trainee.TraineeGroupTrainer;
import com.smartbox.jobster.service.AutoFillTemplateService;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.trainee.grouptrainer.TrainerLookupView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Route(value = "traineeGroupsMaster", layout = MainView.class)
@ViewController("jb_TraineeGroupMaster.list")
@ViewDescriptor("trainee-group-master-view.xml")
@LookupComponent("traineeGroupsDataGrid")
@DialogMode(width = "64em")
public class TraineeGroupMasterView extends AbstractNavigationListView<TraineeGroup> {
    private TwinColGrid<Employee> twinColGrid;
    private String query;

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<TraineeGroup> traineeGroupsDc;
    @ViewComponent
    private CollectionLoader<TraineeGroup> traineeGroupsDl;
    @ViewComponent
    private InstanceContainer<TraineeGroup> traineeGroupDc;
    @ViewComponent
    private InstanceLoader<TraineeGroup> traineeGroupDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private DataGrid<TraineeGroup> traineeGroupsDataGrid;
    @ViewComponent
    private CollectionContainer<Employee> trainerDc;
    @ViewComponent
    private CollectionLoader<Employee> trainerDl;
    @ViewComponent
    private HorizontalLayout properties;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UserService userService;
    @Autowired
    private AutoFillTemplateService autoFillTemplateService;
    @ViewComponent
    private MessageBundle messageBundle;

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

    @Subscribe("traineeGroupsDataGrid.create")
    public void onTraineeGroupsDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("traineeGroupsDataGrid.edit")
    public void onTraineeGroupsDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelBtn")
    public void onCancelButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "traineeGroupsDc", target = Target.DATA_CONTAINER)
    public void onTraineeGroupsDcItemChange(final InstanceContainer.ItemChangeEvent<TraineeGroup> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(TraineeGroup entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewValidation getViewValidation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addTrainer", subject = "clickListener")
    public void onAddTrainerClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildTwinColGrid(TraineeGroup item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateTrainers(TraineeGroup traineeGroup, Collection<Employee> employees) {
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
}
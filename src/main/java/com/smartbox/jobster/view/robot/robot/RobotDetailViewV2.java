package com.smartbox.jobster.view.robot.robot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.robot.IntervalType;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.robot.RobotConditionType;
import com.smartbox.jobster.view.robot.RobotOperation;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionFieldDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionManagerInterviewDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionManagerResponseDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionQuestionDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionQuizDetailView;
import com.smartbox.jobster.view.robot.robotactions.RobotActionsView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "robot-detail-v2/:id", layout = MainView.class)
@ViewController(id = "jb_Robot.detail_V2")
@ViewDescriptor(path = "robot-detail-view-v2.xml")
@EditedEntityContainer("robotDc")
public class RobotDetailViewV2 extends AbstractDetailView<Robot> {
    private RobotActionsView actionsView;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private H5 name;
    @ViewComponent
    private Span description;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private VerticalLayout actionsLayout;
    @ViewComponent
    private JmixSelect<RobotConditionType> conditionSelect;
    @ViewComponent
    private JmixRadioButtonGroup<RobotOperation> operation;
    @ViewComponent
    private CollectionPropertyContainer<RobotCondition> conditionsDc;
    @ViewComponent
    private HorizontalLayout intervalBox;
    @ViewComponent
    private JmixCheckbox active;


    @Subscribe
    public void onInitEntity(final InitEntityEvent<Robot> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("nameField")
    public void onNameFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("descriptionField")
    public void onDescriptionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixTextArea, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("intervalField")
    public void onIntervalFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixIntegerField, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("intervalTypeField")
    public void onIntervalTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<IntervalType>, IntervalType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addCondition", subject = "clickListener")
    public void onAddConditionClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
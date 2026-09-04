package com.smartbox.jobster.view.robot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.ConditionCard;
import com.smartbox.jobster.config.validator.RobotIntervalValidator;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.entity.robot.RobotKanbanStage;
import com.smartbox.jobster.service.robot.RobotService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.robot.robotactions.RobotActionsView;
import com.smartbox.jobster.view.robot.robotcondition.RobotConditionDetailView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.exception.ValidationException;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Route(value = "robots/:id", layout = MainView.class)
@ViewController("jb_Robot.detail")
@ViewDescriptor("robot-detail-view.xml")
@EditedEntityContainer("robotDc")
public class RobotDetailView extends AbstractDetailView<Robot> {
    private boolean phone;
    private MetaClass metaClass;
    private RobotActionsView actionsView;

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Messages messages;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private RobotIntervalValidator robotIntervalValidator;
    @Autowired
    private Metadata metadata;
    @Autowired
    private RobotService robotService;
    @Autowired
    private UiComponents uiComponents;

    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private JmixRadioButtonGroup<String> kanbanStagesField;
    @ViewComponent
    private VerticalLayout stagesLayout;
    @ViewComponent
    private JmixCheckboxGroup<KanbanStage> stagesCheckboxGroup;
    @ViewComponent
    private JmixRadioButtonGroup<String> conditionType;
    @ViewComponent
    private JmixSelect<String> operationField;
    @ViewComponent
    private CollectionPropertyContainer<RobotCondition> robotConditionDc;
    @ViewComponent
    private CollectionContainer<Kanban> kanbanDc;
    @ViewComponent
    private JmixSelect<Kanban> kanbanField;
    @ViewComponent
    private VerticalLayout conditionLayout;
    @ViewComponent
    private VerticalLayout robotConditions;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private VerticalLayout left;
    @ViewComponent
    private H4 shortName;
    @ViewComponent
    private Paragraph name;
    @ViewComponent
    private JmixIntegerField intervalField;
    @ViewComponent
    private Span interval;
    @ViewComponent
    private H4 kanban;
    @ViewComponent
    private HorizontalLayout kanbanStages;
    @ViewComponent
    private VerticalLayout conditions;
    @ViewComponent
    private InstanceLoader<Robot> robotDl;
    @ViewComponent
    private VerticalLayout actionsLayout;
    @ViewComponent
    private JmixTabSheet tabSheet;
    @ViewComponent
    private H2 viewTitle;


    @Subscribe
    public void onInitEntity(final InitEntityEvent<Robot> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtnInfo", subject = "clickListener")
    public void onBackBtnInfoClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "edit", subject = "clickListener")
    public void onEditClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbanStagesField")
    public void onKanbanStagesFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<String>, String>
                                                                event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbanField")
    public void onKanbanFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<Kanban>, Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addCondition", subject = "clickListener")
    public void onAddFieldClick(final ClickEvent<JmixButton> event) {
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

    @Subscribe("closeAction")
    public void onCloseAction(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponentsOnPhone() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void hasKanban() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupActionsLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildLeftCard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span allStages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span getStageSpan(KanbanStage kanbanStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildConditions(VerticalLayout verticalLayout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<RobotKanbanStage> transferKanbanStagesToRobotKanbanStages(Set<KanbanStage> kanbanStages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KanbanStage> transferRobotKanbanStagesToKanbanStages(List<RobotKanbanStage> robotKanbanStages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addConditionCard(DialogWindow.AfterCloseEvent<RobotConditionDetailView> closeEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildConditionCard(RobotCondition robotCondition, VerticalLayout verticalLayout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDoubleClickForConditionCard(RobotCondition robotCondition, ConditionCard conditionCard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setValuesFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
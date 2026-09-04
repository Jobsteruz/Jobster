package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.entity.robot.RobotKanbanStage;
import com.smartbox.jobster.view.robot.RobotStages;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FragmentDescriptor("robot-stages-edit-fragment.xml")
public class RobotStagesEditFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private CollectionLoader<Kanban> kanbanDl;
    @ViewComponent
    private JmixCheckboxGroup<KanbanStage> stagesCheckbox;
    @ViewComponent
    private JmixRadioButtonGroup<RobotStages> stagesRadio;
    @ViewComponent
    private InstanceContainer<Robot> robotDc;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<RobotKanbanStage> robotKanbanStagesDc;


    @Subscribe(target = Target.HOST_CONTROLLER)
    public void onHostBeforeShow(final View.BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanban")
    public void onKanbanComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Kanban>, Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("stagesRadio")
    public void onStagesRadioComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<RobotStages>, RobotStages> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("stagesCheckbox")
    public void onStagesCheckboxComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckboxGroup<KanbanStage>, List<KanbanStage>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<RobotKanbanStage> transferToRobotKanbanStages(Robot robot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KanbanStage> transferToKanbanStages(Robot robot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
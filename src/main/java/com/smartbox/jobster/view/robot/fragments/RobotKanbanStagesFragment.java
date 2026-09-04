package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.robot.RobotKanbanStage;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("robot-kanban-stages-fragment.xml")
public class RobotKanbanStagesFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private CollectionContainer<RobotKanbanStage> robotKanbanStagesDc;
    @ViewComponent
    private HorizontalLayout stages;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private Messages messages;


    @Subscribe(target = Target.HOST_CONTROLLER)
    public void onHostBeforeShow(final View.BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "robotKanbanStagesDc", target = Target.DATA_CONTAINER)
    public void onRobotKanbanStagesDcCollectionChange(final CollectionContainer.CollectionChangeEvent<RobotKanbanStage> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span allStages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
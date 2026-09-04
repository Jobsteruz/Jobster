package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.entity.robot.RobotAction;
import com.vaadin.flow.component.html.Image;
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

import java.util.Comparator;
import java.util.Objects;

@FragmentDescriptor("robot-actions-fragment.xml")
public class RobotActionsFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private VerticalLayout actions;
    @ViewComponent
    private CollectionContainer<RobotAction> robotActionsDc;

    @Autowired
    private Messages messages;


    @Subscribe(id = "robotActionsDc", target = Target.DATA_CONTAINER)
    public void onRobotActionsDcCollectionChange(final CollectionContainer.CollectionChangeEvent<RobotAction> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(target = Target.HOST_CONTROLLER)
    public void onHostBeforeShow(final View.BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
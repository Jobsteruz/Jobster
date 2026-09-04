package com.smartbox.jobster.view.robot.fragments;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.robot.RobotConditionValueException;
import com.smartbox.jobster.robot.builders.ConditionMatcherBuilder;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionFieldDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionManagerInterviewDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionManagerResponseDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionQuestionDetailView;
import com.smartbox.jobster.view.robot.robot.condition_details.RobotConditionQuizDetailView;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.*;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.fragmentrenderer.FragmentRenderer;
import io.jmix.flowui.fragmentrenderer.RendererItemContainer;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("robot-condition-fragment.xml")
@RendererItemContainer("conditionDc")
public class RobotConditionFragment extends FragmentRenderer<VerticalLayout, RobotCondition> {
    private static final Logger log = LoggerFactory.getLogger(RobotConditionFragment.class);

    private RobotConditionValueSpan conditionSpan;

    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private Metadata metadata;
    @Autowired
    private EntityStates entityStates;

    @ViewComponent
    private InstanceContainer<RobotCondition> conditionDc;
    @ViewComponent
    private CollectionContainer<RobotCondition> conditionsDc;
    @ViewComponent
    private VerticalLayout value;
    @ViewComponent
    private NativeLabel label;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Span span;
    @ViewComponent
    private Span newText;
    @ViewComponent
    private Span conditionTypeSpan;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @ViewComponent
    private DataContext dataContext;


    @Subscribe
    public void onAttachEvent(final AttachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "card", subject = "doubleClickListener")
    public void onCardClick(final ClickEvent<VerticalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "delete", subject = "clickListener")
    public void onDeleteClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
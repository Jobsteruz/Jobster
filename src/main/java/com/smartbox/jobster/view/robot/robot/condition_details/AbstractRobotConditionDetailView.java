package com.smartbox.jobster.view.robot.robot.condition_details;

import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.robot.RobotOperation;
import com.vaadin.flow.component.html.Span;
import io.jmix.core.MessageTools;
import io.jmix.core.Messages;
import io.jmix.core.Metadata;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewValidation;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRobotConditionDetailView extends AbstractDetailView<RobotCondition> {

    @Autowired
    protected Messages messages;
    @Autowired
    protected Metadata metadata;
    @Autowired
    protected MessageTools messageTools;
    @Autowired
    protected ViewValidation viewValidation;


    @ViewComponent
    protected JmixFormLayout form;
    @ViewComponent
    protected Span condition;

    @Subscribe
    protected void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

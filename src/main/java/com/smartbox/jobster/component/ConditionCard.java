package com.smartbox.jobster.component;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.service.EntityService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.FetchPlan;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.MessageTools;
import io.jmix.core.Messages;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.Range;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class ConditionCard extends VerticalLayout {
    private static final Logger log = LoggerFactory.getLogger(ConditionCard.class);
    private final Messages messages;
    private final EntityService entityService;

    @Setter
    private RobotCondition robotCondition;
    @Setter
    private ComponentEventListener<ClickEvent<Icon>> iconClick;

    public ConditionCard(RobotCondition robotCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void load(MetaClass metaClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("ConstantConditions")
    private String getConditionValue(MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

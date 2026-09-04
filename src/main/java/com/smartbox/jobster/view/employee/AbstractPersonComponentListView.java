package com.smartbox.jobster.view.employee;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.view.StandardListView;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public abstract class AbstractPersonComponentListView<T extends StandardTenantEntity> extends StandardListView<T> {
    @Setter
    protected boolean infoView;
    @Setter
    protected UUID entityId;
    @Setter
    protected SaveContext saveContext;

    @Autowired
    protected Dialogs dialogs;
    @Autowired
    protected Messages messages;
    @Autowired
    protected Notifications notifications;
    @Autowired
    protected DialogWindows dialogWindows;
    @Autowired
    protected DataManager dataManager;
    @Autowired
    protected InstanceNameProvider instanceNameProvider;


    protected @NotNull Icon getDelete(StandardTenantEntity entity, Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

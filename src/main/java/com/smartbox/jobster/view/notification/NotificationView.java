package com.smartbox.jobster.view.notification;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.notification.notificationcard.NotificationCardView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "notification-view", layout = MainView.class)
@ViewController("jb_NotificationView")
@ViewDescriptor("notification-view.xml")
@DialogMode(width = "370px", height = "100%", closeOnOutsideClick = true)
public class NotificationView extends StandardView {

    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ViewNavigators viewNavigators;

    @ViewComponent
    private VerticalLayout notificationBox;
    @ViewComponent
    private MessageBundle messageBundle;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build(Notification notification) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
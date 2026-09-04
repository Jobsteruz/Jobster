package com.smartbox.jobster.view.notification.notificationcard;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "notification-card-view", layout = MainView.class)
@ViewController("jb_NotificationCardView")
@ViewDescriptor("notification-card-view.xml")
public class NotificationCardView extends StandardView {

    @ViewComponent
    private VerticalLayout unreadBox;
    @ViewComponent
    private VerticalLayout readBox;
    @ViewComponent("tabSheet.unread")
    private Tab unreadTab;
    @ViewComponent("tabSheet.read")
    private Tab readTab;
    @ViewComponent
    private Button markAllBtn;
    @ViewComponent
    private JmixTabSheet tabSheet;

    private boolean hasUnread;

    @Autowired
    private NotificationService notificationService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildTabs() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout buildCard(Notification notification, boolean showMarkRead) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
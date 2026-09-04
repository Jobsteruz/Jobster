package com.smartbox.jobster.view.robot.mobile.robotmobilecardfragment;

import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.robot.Robot;
import com.smartbox.jobster.view.robot.RobotDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("robot-mobile-card-fragment.xml")
public class RobotMobileCardFragment extends Fragment<VerticalLayout> {
    @Setter
    private Robot robot;

    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Notifications notifications;

    @ViewComponent
    private H3 name;
    @ViewComponent
    private Span kanban;
    @ViewComponent
    private JmixCheckbox active;
    @ViewComponent
    private Span kanbanStages;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private HorizontalLayout header;


    public void beforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private MenuBar getActionsMenuBar() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "active", subject = "clickListener")
    public void onActiveClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
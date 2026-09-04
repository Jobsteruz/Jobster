package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.superset.SupersetReportView;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.view.View;
import lombok.Getter;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.function.Consumer;

/**
 * Row component rendering a single Superset report inside its group accordion.
 * Double-click opens the {@link com.smartbox.jobster.view.superset.superset.SupersetView}
 * with the report's {@code crcId} as a query param so the view can resolve the right
 * Superset dashboard.
 */
public class SupersetReportDiv extends HorizontalLayout {
    private HorizontalLayout icons;
    private Icon star;
    private Icon starFavorite;

    @Getter
    private final SupersetReportView report;
    private final List<RoleType> roles;
    private final View<?> origin;
    private final Consumer<SupersetReportView> editProcess;
    private final Consumer<SupersetReportView> consumerRemoveFavorite;
    private final SupersetReportAccordionPanel favoriteLayout;

    private Messages messages;
    private DataManager dataManager;
    private Dialogs dialogs;
    private Notifications notifications;
    private EmployeeService employeeService;
    private Environment environment;


    public SupersetReportDiv(SupersetReportView report, View<?> origin, Consumer<SupersetReportView> editProcess,
                             List<RoleType> roles, SupersetReportAccordionPanel favoriteLayout,
                             Consumer<SupersetReportView> consumerRemoveFavorite) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initBeans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void removeFavorite() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private MenuBar getReportViewMenuBar(Consumer<SupersetReportView> editProcess, SupersetReportView report, Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

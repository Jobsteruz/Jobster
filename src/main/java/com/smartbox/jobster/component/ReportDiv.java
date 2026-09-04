package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.reportgroup.ReportRoleListView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.checkbox.Checkbox;
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
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.View;
import io.jmix.securityflowui.view.resourcepolicy.ResourcePolicyViewUtils;
import lombok.Getter;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.function.Consumer;

public class ReportDiv extends HorizontalLayout {
    private HorizontalLayout icons;
    private Icon star;
    private Icon starFavorite;

    @Getter
    private ReportView report;
    private final List<RoleType> roles;
    private final View<?> origin;
    private final Consumer<ReportView> editProcess;
    private final Consumer<ReportView> consumerRemoveFavorite;
    private final ReportAccordionPanel favoriteLayout;

    private Messages messages;
    private DataManager dataManager;
    private Dialogs dialogs;
    private DialogWindows dialogWindows;
    private Notifications notifications;
    private EmployeeService employeeService;
    private Environment environment;
    private ViewService viewService;
    private ResourcePolicyViewUtils resourcePolicyViewUtils;


    public ReportDiv(ReportView report, View<?> origin, Consumer<ReportView> editProcess, List<RoleType> roles,
                     ReportAccordionPanel favoriteLayout, Consumer<ReportView> consumerRemoveFavorite) {
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

    private MenuBar getReportViewMenuBar(Consumer<ReportView> editProcess, ReportView report, Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

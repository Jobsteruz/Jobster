package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.report.ReportGroup;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.service.ReportService;
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
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.accordion.JmixAccordionPanel;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.view.View;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ReportAccordionPanel extends JmixAccordionPanel {
    private final Employee employee;
    @Getter
    private VerticalLayout verticalLayout;
    @Setter
    private ReportGroup reportGroup;
    @Setter
    private List<RoleType> roles;
    @Setter
    private ReportAccordionPanel favoriteLayout;
    private final View<?> origin;

    private DataManager dataManager;
    private Notifications notifications;
    private Messages messages;
    private Dialogs dialogs;
    private EmployeeService employeeService;
    private ReportService reportService;

    public ReportAccordionPanel(View<?> origin, List<RoleType> roles) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ReportAccordionPanel(View<?> origin, ReportGroup reportGroup, List<RoleType> roles) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initBeans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ReportAccordionPanel build(Consumer<ReportView> editProcess, Consumer<ReportView> consumerRemoveFavorite) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ReportAccordionPanel build(List<ReportView> reports, Consumer<ReportView> editProcess, Consumer<ReportView> consumerRemoveFavorite) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addReportDiv(HorizontalLayout reportDiv) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void removeReportDiv(ReportView report) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isEmpty() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("all")
    private MenuBar getReportGroupActionsLayout(Span nameSpan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull VerticalLayout getAccordionContent(List<ReportView> reports, Consumer<ReportView> editProcess, Consumer<ReportView> consumerRemoveFavorite) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

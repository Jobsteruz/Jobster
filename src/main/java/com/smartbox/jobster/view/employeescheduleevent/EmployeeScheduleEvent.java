package com.smartbox.jobster.view.employeescheduleevent;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.security.specific.UiCalendarViewAllEventsEnabled;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.google.GoogleCalendarService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.event.EventDetailView;
import com.smartbox.jobster.view.event.EventInfoView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.MetadataTools;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButtonItem;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.fullcalendarflowui.component.FullCalendar;
import io.jmix.fullcalendarflowui.component.event.DateClickEvent;
import io.jmix.fullcalendarflowui.component.event.DatesSetEvent;
import io.jmix.fullcalendarflowui.component.event.EventClickEvent;
import io.jmix.fullcalendarflowui.kit.component.model.CalendarDisplayModes;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.UUID;

@Route(value = "employee-schedule-event", layout = MainView.class)
@ViewController(id = "jb_EmployeeScheduleEvent")
@ViewDescriptor(path = "employee-schedule-event.xml")
public class EmployeeScheduleEvent extends AbstractNavigationView {
    private Employee employee;
    private LocalDate currentDate = LocalDate.now();
    private IntegratedUser googleIntegratedUser;

    @ViewComponent
    private CollectionLoader<Event> eventsDl;
    @ViewComponent
    private Select<Priority> priorityFilter;
    @ViewComponent
    private EntityComboBox<Department> departmentFilter;
    @ViewComponent
    private EntityComboBox<Position> positionFilter;
    @ViewComponent
    private EntityComboBox<Employee> responsibleFilter;
    @ViewComponent
    private Span month;
    @ViewComponent
    private HorizontalLayout googleSyncBox;
    @ViewComponent
    private Span googleEmail;
    @ViewComponent
    private Span googleSyncStatus;
    @ViewComponent
    private FullCalendar calendar;
    @ViewComponent
    private DropdownButton calendarModeBtn;


    @Autowired
    private UserService userService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;
    @Autowired
    private GoogleCalendarService googleCalendarService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private RoleService roleService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private MetadataTools metadataTools;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "prevBtn", subject = "clickListener")
    public void onPrevBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "nextBtn", subject = "clickListener")
    public void onNextBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendar")
    public void onCalendarDatesSet(final DatesSetEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendarModeBtn.monthlyItem")
    public void onMonthlyItemClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendarModeBtn.weeklyItem")
    public void onWeeklyItemClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendarModeBtn.dailyItem")
    public void onDailyItemClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendar")
    public void onCalendarEventClick(final EventClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendar")
    public void onCalendarDateClick(final DateClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "newEventBtn", subject = "clickListener")
    public void onNewEventBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void onGoogleSyncBoxClick() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    public void onGooglePopupClosed() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateMonthLabel() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initPriorityFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initPositionFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initResponsibleFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initGoogleCalendarSync() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showGoogleConnected() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showGoogleDisconnected() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
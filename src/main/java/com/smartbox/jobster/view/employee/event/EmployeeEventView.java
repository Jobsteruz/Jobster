package com.smartbox.jobster.view.employee.event;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.event.EventDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.fullcalendarflowui.component.event.DateClickEvent;
import io.jmix.fullcalendarflowui.component.event.EventClickEvent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "employee-event-view", layout = MainView.class)
@ViewController(id = "jb_EmployeeEventView")
@ViewDescriptor(path = "employee-event-view.xml")
public class EmployeeEventView extends AbstractNavigationView {
    private Employee employee;

    @ViewComponent
    private CollectionLoader<Event> eventsDl;

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
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
}
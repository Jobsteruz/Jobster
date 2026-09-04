package com.smartbox.jobster.view.employeescheduleevent;


import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.fullcalendarflowui.component.FullCalendar;
import io.jmix.fullcalendarflowui.kit.component.model.CalendarDisplayModes;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Route(value = "employee-schedule-event-view", layout = MainView.class)
@ViewController(id = "jb_EmployeeScheduleEventView")
@ViewDescriptor(path = "employee-schedule-event-view.xml")
public class EmployeeScheduleEventView extends AbstractNavigationView {
    @ViewComponent
    private CollectionLoader<Event> eventsDl;
    @ViewComponent
    private JmixButton monthlyEventBtn;
    @ViewComponent
    private JmixButton dailyEventBtn;
    @ViewComponent
    private FullCalendar calendar;
    @ViewComponent
    private Span month;
    @Autowired
    private EmployeeService employeeService;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "monthlyEventBtn", subject = "clickListener")
    public void onMonthlyEventBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dailyEventBtn", subject = "clickListener")
    public void onDailyEventBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
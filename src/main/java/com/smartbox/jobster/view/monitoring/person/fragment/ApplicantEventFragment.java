package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.EventService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.event.EventDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.stefan.fullcalendar.CalendarViewImpl;
import org.vaadin.stefan.fullcalendar.Entry;
import org.vaadin.stefan.fullcalendar.FullCalendar;
import org.vaadin.stefan.fullcalendar.FullCalendarBuilder;
import org.vaadin.stefan.fullcalendar.dataprovider.EntryProvider;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

@FragmentDescriptor("applicant-event-fragment.xml")
public class ApplicantEventFragment extends Fragment<VerticalLayout> {
    private FullCalendar calendar;

    @ViewComponent
    private VerticalLayout root;
    @ViewComponent
    private JmixButton dailyEventBtn;
    @ViewComponent
    private JmixButton monthlyEventBtn;
    @ViewComponent
    private HorizontalLayout calendarWrapper;

    @Autowired
    private EventService eventService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;

    private Applicant currentApplicant;

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

    public void setApplicant(Applicant applicant, CalendarViewImpl view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadEntries(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
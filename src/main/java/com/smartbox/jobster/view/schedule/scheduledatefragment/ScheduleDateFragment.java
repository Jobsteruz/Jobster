package com.smartbox.jobster.view.schedule.scheduledatefragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import com.smartbox.jobster.service.EventService;
import com.smartbox.jobster.service.ScheduleService;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;


@FragmentDescriptor("schedule-date-fragment.xml")
public class ScheduleDateFragment extends Fragment<VerticalLayout> {
    LocalDate date;
    Schedule schedule;
    private boolean open = false;
    private boolean loaded = false;

    @Autowired
    private Messages messages;
    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private EventService eventService;

    @ViewComponent
    private Span dateSpan;
    @ViewComponent
    private Span dayOffWeek;
    @ViewComponent
    private HorizontalLayout slotsContainer;
    @ViewComponent
    private VerticalLayout root;
    @ViewComponent
    private JmixButton btn;

    public void build(Schedule schedule, LocalDate date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void handleBtnClick() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadSlots() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.schedule;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.schedule.OffDay;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.schedule.timepickerfragment.TimepickerFragment;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.fullcalendarflowui.component.FullCalendar;
import io.jmix.fullcalendarflowui.component.event.DateClickEvent;
import io.jmix.fullcalendarflowui.component.event.DatesSetEvent;
import io.jmix.fullcalendarflowui.component.event.DayCellClassNamesContext;
import io.jmix.fullcalendarflowui.component.event.DayHeaderClassNamesContext;
import io.jmix.fullcalendarflowui.component.model.DayOfWeek;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.*;

@Route(value = "schedules/:id", layout = MainView.class)
@ViewController(id = "jb_Schedule.detail")
@ViewDescriptor(path = "schedule-detail-view.xml")
@EditedEntityContainer("scheduleDc")
@DialogMode(width = "600px", height = "AUTO")
public class ScheduleDetailView extends AbstractDetailView<Schedule> {
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private Fragments fragments;


    @ViewComponent
    private FullCalendar calendar;
    @ViewComponent
    private VerticalLayout mondayTimeBox;
    @ViewComponent
    private VerticalLayout tuesdayTimeBox;
    @ViewComponent
    private VerticalLayout wednesdayTimeBox;
    @ViewComponent
    private VerticalLayout thursdayTimeBox;
    @ViewComponent
    private VerticalLayout fridayTimeBox;
    @ViewComponent
    private VerticalLayout saturdayTimeBox;
    @ViewComponent
    private Span month;

    private LocalDate currentDate = LocalDate.now();
    private Set<LocalDate> selectedDates = new HashSet<>();
    private Map<String, List<TimepickerFragment>> timePickerFragments = new HashMap<>();
    private Map<TimepickerFragment, TimeSlot> fragmentToTimeSlotMap = new HashMap<>();

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendar")
    public void onCalendarDatesSet(final DatesSetEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "previousButton", subject = "clickListener")
    public void onPreviousButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "nextButton", subject = "clickListener")
    public void onNextButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("calendar")
    public void onCalendarDateClick(final DateClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Install(to = "calendar", subject = "dayCellClassNamesGenerator")
    private List<String> calendarDayCellClassNamesGenerator(final DayCellClassNamesContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "calendar", subject = "dayHeaderClassNamesGenerator")
    private List<String> calendarDayHeaderClassNamesGenerator(final DayHeaderClassNamesContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "mondayBtn", subject = "clickListener")
    public void mondayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "tuesdayBtn", subject = "clickListener")
    public void tuesdayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "wednesdayBtn", subject = "clickListener")
    public void wednesdayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "thursdayBtn", subject = "clickListener")
    public void thursdayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "fridayBtn", subject = "clickListener")
    public void fridayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saturdayBtn", subject = "clickListener")
    public void saturdayBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void mergeOffDays(Schedule schedule) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void mergeTimeSlots(Schedule schedule) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void addFragmentToDay(WeekDay day, TimepickerFragment fragment) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void selectCellStyle(String isoDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void unselectCellStyle(String isoDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
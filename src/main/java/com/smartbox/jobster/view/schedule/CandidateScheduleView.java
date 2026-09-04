package com.smartbox.jobster.view.schedule;


import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.service.ScheduleService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.schedule.scheduledatefragment.ScheduleDateFragment;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.stream.IntStream;

@Route(value = "candidate-schedule-view", layout = MainView.class)
@ViewController(id = "jb_CandidateScheduleView")
@ViewDescriptor(path = "candidate-schedule-view.xml")
@DialogMode(width = "70%", height = "AUTO")
public class CandidateScheduleView extends AbstractNavigationView {
    @Autowired
    private Fragments fragments;
    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private Messages messages;

    @ViewComponent
    private VerticalLayout scheduleDate;
    @ViewComponent
    private Span month;

    private LocalDate currentDate = LocalDate.now();


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
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

    private void buildScheduleDateFragment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getScheduleCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
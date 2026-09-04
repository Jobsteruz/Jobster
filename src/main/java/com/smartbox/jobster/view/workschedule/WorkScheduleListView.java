package com.smartbox.jobster.view.workschedule;

import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "workSchedules", layout = MainView.class)
@ViewController("jb_WorkSchedule.list")
@ViewDescriptor("work-schedule-list-view.xml")
public class WorkScheduleListView extends AbstractListView<WorkSchedule> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
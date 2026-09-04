package com.smartbox.jobster.view.schedule;

import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "schedules", layout = MainView.class)
@ViewController(id = "jb_Schedule.list")
@ViewDescriptor(path = "schedule-list-view.xml")
@LookupComponent("schedulesDataGrid")
@DialogMode(width = "64em")
public class ScheduleListView extends AbstractListView<Schedule> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void buildSettingsMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
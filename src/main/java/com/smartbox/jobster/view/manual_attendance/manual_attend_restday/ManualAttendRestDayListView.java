package com.smartbox.jobster.view.manual_attendance.manual_attend_restday;

import com.smartbox.jobster.entity.vision.ManualAttendRestDay;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "manualAttendRestDays", layout = MainView.class)
@ViewController("jb_ManualAttendRestDay.list")
@ViewDescriptor("manual-attend-rest-day-list-view.xml")
public class ManualAttendRestDayListView extends AbstractListView<ManualAttendRestDay> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
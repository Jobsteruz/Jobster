package com.smartbox.jobster.view.attendance;

import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "attendances", layout = MainView.class)
@ViewController("jb_Attendance.list")
@ViewDescriptor("attendance-list-view.xml")
public class AttendanceListView extends AbstractListView<Attendance> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.attendance;

import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "attendances/:id", layout = MainView.class)
@ViewController("jb_Attendance.detail")
@ViewDescriptor("attendance-detail-view.xml")
@EditedEntityContainer("attendanceDc")
@DialogMode(width = "32em", height = "AUTO")
public class AttendanceDetailView extends AbstractDetailView<Attendance> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
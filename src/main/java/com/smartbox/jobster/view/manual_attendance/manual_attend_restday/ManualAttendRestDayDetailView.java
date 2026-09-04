package com.smartbox.jobster.view.manual_attendance.manual_attend_restday;

import com.smartbox.jobster.entity.vision.ManualAttendRestDay;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "manualAttendRestDays/:id", layout = MainView.class)
@ViewController("jb_ManualAttendRestDay.detail")
@ViewDescriptor("manual-attend-rest-day-detail-view.xml")
@EditedEntityContainer("manualAttendRestDayDc")
@DialogMode(width = "40em", height = "AUTO")
public class ManualAttendRestDayDetailView extends AbstractDetailView<ManualAttendRestDay> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
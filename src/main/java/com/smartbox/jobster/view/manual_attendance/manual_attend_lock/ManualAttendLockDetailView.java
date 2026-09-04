package com.smartbox.jobster.view.manual_attendance.manual_attend_lock;

import com.smartbox.jobster.entity.vision.ManualAttendLock;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "manualAttendLocks/:id", layout = MainView.class)
@ViewController("jb_ManualAttendLock.detail")
@ViewDescriptor("manual-attend-lock-detail-view.xml")
@EditedEntityContainer("manualAttendLockDc")
@DialogMode(width = "40em", height = "AUTO")
public class ManualAttendLockDetailView extends AbstractDetailView<ManualAttendLock> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.manual_attendance.manual_attend_lock;

import com.smartbox.jobster.entity.vision.ManualAttendLock;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "manualAttendLocks", layout = MainView.class)
@ViewController("jb_ManualAttendLock.list")
@ViewDescriptor("manual-attend-lock-list-view.xml")
public class ManualAttendLockListView extends AbstractListView<ManualAttendLock> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.manual_attendance.manual_absent_reason;

import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "manualAbsentReasons", layout = MainView.class)
@ViewController("jb_ManualAbsentReason.list")
@ViewDescriptor("manual-absent-reason-list-view.xml")
public class ManualAbsentReasonListView extends AbstractListView<ManualAbsentReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
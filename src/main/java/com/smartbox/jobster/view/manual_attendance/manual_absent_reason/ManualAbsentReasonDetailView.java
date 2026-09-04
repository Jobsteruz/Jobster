package com.smartbox.jobster.view.manual_attendance.manual_absent_reason;

import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "manualAbsentReasons/:id", layout = MainView.class)
@ViewController("jb_ManualAbsentReason.detail")
@ViewDescriptor("manual-absent-reason-detail-view.xml")
@EditedEntityContainer("manualAbsentReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class ManualAbsentReasonDetailView extends AbstractDetailView<ManualAbsentReason> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
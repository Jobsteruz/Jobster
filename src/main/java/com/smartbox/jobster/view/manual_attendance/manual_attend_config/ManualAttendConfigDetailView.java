package com.smartbox.jobster.view.manual_attendance.manual_attend_config;

import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "manualAttendConfigs/:id", layout = MainView.class)
@ViewController("jb_ManualAttendConfig.detail")
@ViewDescriptor("manual-attend-config-detail-view.xml")
@EditedEntityContainer("manualAttendConfigDc")
@DialogMode(width = "40em", height = "AUTO")
public class ManualAttendConfigDetailView extends AbstractDetailView<ManualAttendConfig> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
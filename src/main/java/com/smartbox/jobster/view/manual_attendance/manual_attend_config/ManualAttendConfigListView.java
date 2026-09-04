package com.smartbox.jobster.view.manual_attendance.manual_attend_config;

import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "manualAttendConfigs", layout = MainView.class)
@ViewController("jb_ManualAttendConfig.list")
@ViewDescriptor("manual-attend-config-list-view.xml")
public class ManualAttendConfigListView extends AbstractListView<ManualAttendConfig> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.tgattendconfig;

import com.smartbox.jobster.entity.vision.TgAttendConfig;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "tgAttendConfigs/:id", layout = MainView.class)
@ViewController(id = "jb_TgAttendConfig.detail")
@ViewDescriptor(path = "tg-attend-config-detail-view.xml")
@EditedEntityContainer("tgAttendConfigDc")
public class TgAttendConfigDetailView extends AbstractDetailView<TgAttendConfig> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
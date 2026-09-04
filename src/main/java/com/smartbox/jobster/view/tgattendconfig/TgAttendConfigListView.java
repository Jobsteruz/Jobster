package com.smartbox.jobster.view.tgattendconfig;

import com.smartbox.jobster.entity.vision.TgAttendConfig;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "tgAttendConfigs", layout = MainView.class)
@ViewController(id = "jb_TgAttendConfig.list")
@ViewDescriptor(path = "tg-attend-config-list-view.xml")
@DialogMode(width = "64em")
public class TgAttendConfigListView extends AbstractListView<TgAttendConfig> {


    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
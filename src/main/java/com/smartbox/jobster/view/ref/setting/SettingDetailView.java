package com.smartbox.jobster.view.ref.setting;

import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "settings/:id", layout = MainView.class)
@ViewController("jb_Setting.detail")
@ViewDescriptor("setting-detail-view.xml")
@EditedEntityContainer("settingDc")
@DialogMode(width = "40em", height = "AUTO")
public class SettingDetailView extends AbstractDetailView<Setting> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
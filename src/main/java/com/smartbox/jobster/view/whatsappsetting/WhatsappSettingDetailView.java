package com.smartbox.jobster.view.whatsappsetting;

import com.smartbox.jobster.entity.ref.WhatsappSetting;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "whatsapp-settings/:id", layout = MainView.class)
@ViewController(id = "jb_WhatsappSetting.detail")
@ViewDescriptor(path = "whatsapp-setting-detail-view.xml")
@EditedEntityContainer("whatsappSettingDc")
@DialogMode(width = "40em", height = "AUTO")
public class WhatsappSettingDetailView extends AbstractDetailView<WhatsappSetting> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
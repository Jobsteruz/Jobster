package com.smartbox.jobster.view.whatsappbot;

import com.smartbox.jobster.entity.ref.WhatsappSetting;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.whatsappmenu.WhatsappMenuListView;
import com.smartbox.jobster.view.whatsappsetting.WhatsappSettingListView;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "whatsappBots", layout = MainView.class)
@ViewController("jb_WhatsappBot.list")
@ViewDescriptor("whatsapp-bot-list-view.xml")
@DialogMode(width = "64em")
public class WhatsappBotListView extends AbstractListView<WhatsappBot> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.openMenus")
    public void onEntityDataGridOpenMenus(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.settings")
    public void onEntityDataGridSettings(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
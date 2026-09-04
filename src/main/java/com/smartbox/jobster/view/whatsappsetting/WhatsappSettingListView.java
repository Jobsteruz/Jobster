package com.smartbox.jobster.view.whatsappsetting;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.WhatsappSetting;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "whatsapp-settings", layout = MainView.class)
@ViewController(id = "jb_WhatsappSetting.list")
@ViewDescriptor(path = "whatsapp-setting-list-view.xml")
@LookupComponent("entityDataGrid")
@DialogMode(width = "64em")
public class WhatsappSettingListView extends AbstractListView<WhatsappSetting> {


    @Getter
    @Setter
    private WhatsappBot bot;

    @Autowired
    private EntityService entityService;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public void onQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Install(to = "entityDataGrid.create", subject = "initializer")
    private void entityDataGridCreateInitializer(final WhatsappSetting setting) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
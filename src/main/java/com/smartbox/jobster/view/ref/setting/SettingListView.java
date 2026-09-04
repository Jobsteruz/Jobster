package com.smartbox.jobster.view.ref.setting;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Install;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "settings", layout = MainView.class)
@ViewController("jb_Setting.list")
@ViewDescriptor("setting-list-view.xml")
public class SettingListView extends AbstractListView<Setting> {


    @Getter
    @Setter
    private Bot bot;

    @Getter
    @Setter
    private Questionnaire questionnaire;

    @Autowired
    private BotService botService;
    @Autowired
    private EntityService entityService;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.create", subject = "initializer")
    private void entityDataGridCreateInitializer(final Setting setting) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
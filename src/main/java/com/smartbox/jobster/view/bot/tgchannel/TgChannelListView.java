package com.smartbox.jobster.view.bot.tgchannel;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgChannel;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.FetchPlan;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "tg-channels", layout = MainView.class)
@ViewController(id = "jb_TgChannel.list")
@ViewDescriptor(path = "tg-channel-list-view.xml")
@DialogMode(width = "64em")
public class TgChannelListView extends AbstractListView<TgChannel> {


    private Bot bot;

    @Autowired
    private EntityService entityService;

    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public void onQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.create", subject = "newEntitySupplier")
    private TgChannel entityDataGridCreateNewEntitySupplier() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.bot.tgchannel;

import com.pengrad.telegrambot.model.Chat;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgChannel;
import com.smartbox.jobster.service.tg.TelegramService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "tg-channels/:id", layout = MainView.class)
@ViewController(id = "jb_TgChannel.detail")
@ViewDescriptor(path = "tg-channel-detail-view.xml")
@EditedEntityContainer("tgChannelDc")
@DialogMode(width = "40em", height = "AUTO")
public class TgChannelDetailView extends AbstractDetailView<TgChannel> {
    private static final Logger log = LoggerFactory.getLogger(TgChannelDetailView.class);

    @Autowired
    private TelegramService telegramService;
    @Autowired
    private Messages messages;

    @ViewComponent
    private TypedTextField<String> linkField;


    @Subscribe("linkField")
    public void onLinkFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
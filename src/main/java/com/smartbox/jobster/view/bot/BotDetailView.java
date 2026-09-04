package com.smartbox.jobster.view.bot;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.GetMe;
import com.pengrad.telegrambot.response.GetMeResponse;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@Route(value = "bots/:id", layout = MainView.class)
@ViewController("jb_TgBot.detail")
@ViewDescriptor("bot-detail-view.xml")
@EditedEntityContainer("botDc")
@DialogMode(width = "40em", height = "AUTO")
public class BotDetailView extends AbstractDetailView<Bot> {
    private boolean trigger = false;

    @ViewComponent
    private TypedTextField<String> tokenField;
    @ViewComponent
    private TypedTextField<String> usernameField;
    @Autowired
    private SystemAuthenticator systemAuthenticator;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("tokenField")
    public void onTokenFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
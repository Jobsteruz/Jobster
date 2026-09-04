package com.smartbox.jobster.bot.tg.producer;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.tg.Menu;
import com.smartbox.jobster.entity.tg.Post;
import com.smartbox.jobster.entity.tg.TgUserState;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/3/2023 4:41 PM
 */
public class MenuProducer extends AbstractBotObject implements Producer {
    Menu menu;
    Post lastPost = null;
    boolean activeKeyboard;

    public MenuProducer(BotContext botContext, Menu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

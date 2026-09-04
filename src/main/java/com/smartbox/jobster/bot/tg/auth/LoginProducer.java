package com.smartbox.jobster.bot.tg.auth;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.LoginType;
import com.smartbox.jobster.entity.tg.TgUserState;

import java.time.OffsetDateTime;

/**
 * @author Jobster team
 * Since: 5/6/2024 11:03 AM
 */
public class LoginProducer extends AbstractBotObject implements Producer {
    LoginType loginType;

    public LoginProducer(BotContext botContext, LoginType loginType) {
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

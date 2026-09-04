package com.smartbox.jobster.bot.tg.auth;


import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.LoginType;

import java.util.Arrays;

/**
 * @author Jobster team
 * Since: 1/24/2025 12:16 PM
 */
public class LoginTypeConsumer extends AbstractBotObject implements Consumer {
    Boolean produce;
    LoginType loginType;

    public LoginTypeConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LoginTypeConsumer(BotContext botContext, Boolean produce) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LoginTypeConsumer(BotContext botContext, LoginType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private LoginType fetchLoginType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

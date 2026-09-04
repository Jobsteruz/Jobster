package com.smartbox.jobster.bot.tg.producer;


import com.pengrad.telegrambot.model.WebAppData;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.questionnaire.CheckUpProducer;
import com.smartbox.jobster.bot.tg.questionnaire.VacancyProducer;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.TgUserState;

/**
 * @author Jobster team
 * Since: 9/10/2024 10:56 AM
 */
public class WebAppProducer extends AbstractBotObject implements Producer {
    WebAppData webAppData;

    public WebAppProducer(BotContext botContext, WebAppData webAppData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

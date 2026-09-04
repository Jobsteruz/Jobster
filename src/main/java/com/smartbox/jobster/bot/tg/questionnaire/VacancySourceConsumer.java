package com.smartbox.jobster.bot.tg.questionnaire;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.tg.TgUserState;
import com.smartbox.jobster.entity.tg.TgUtm;
import com.smartbox.jobster.service.TgUtmService;

public class VacancySourceConsumer extends AbstractBotObject implements Consumer {

    private final String[] parts;

    public VacancySourceConsumer(BotContext botContext, String[] parts) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
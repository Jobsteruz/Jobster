package com.smartbox.jobster.bot.tg.survey.consumer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.producer.SurveyProducer;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.entity.survey.SurveyUser;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 25/07/24 17:50
 */
public class InvitationConsumer extends AbstractSurveyBotObject implements Consumer {

    private final Survey survey;

    public InvitationConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Survey fetchSurvey(String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

package com.smartbox.jobster.bot.tg.survey.consumer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.producer.FinishSurveyProducer;
import com.smartbox.jobster.entity.survey.Survey;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 26/07/24 14:43
 */
public class FinishSurveyConsumer extends AbstractSurveyBotObject implements Consumer {

    private final Survey survey;

    public FinishSurveyConsumer(BotContext botContext, String callbackData) {
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

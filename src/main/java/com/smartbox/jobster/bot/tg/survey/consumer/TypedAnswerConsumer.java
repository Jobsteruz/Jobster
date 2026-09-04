package com.smartbox.jobster.bot.tg.survey.consumer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.producer.SurveyProducer;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;

/**
 * @author Jobster team
 * date: 25/07/24 18:38
 */
public class TypedAnswerConsumer extends AbstractSurveyBotObject implements Consumer {

    private final SurveyUserAnswer answer;

    public TypedAnswerConsumer(BotContext botContext) throws IllegalStateException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.bot.tg.survey.consumer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.producer.SurveyProducer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 25/07/24 11:49
 */
public class QuestionConsumer extends AbstractSurveyBotObject implements Consumer {

    private final SurveyQuestion question;

    public QuestionConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SurveyQuestion fetchQuestion(String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

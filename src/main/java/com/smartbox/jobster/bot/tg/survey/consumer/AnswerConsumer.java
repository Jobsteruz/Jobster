package com.smartbox.jobster.bot.tg.survey.consumer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.bot.tg.survey.producer.MultiAnswerProducer;
import com.smartbox.jobster.bot.tg.survey.producer.SingleAnswerProducer;
import com.smartbox.jobster.bot.tg.survey.producer.TypedAnswerProducer;
import com.smartbox.jobster.entity.survey.SurveyAnswer;

import java.util.UUID;

/**
 * @author Jobster team
 * date: 24/07/24 16:28
 */
public class AnswerConsumer extends AbstractSurveyBotObject implements Consumer {

    private final SurveyAnswer answer;

    public AnswerConsumer(BotContext botContext, String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SurveyAnswer fetchAnswer(String callbackData) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

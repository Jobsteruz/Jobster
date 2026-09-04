package com.smartbox.jobster.bot.tg.survey.producer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.tg.TgUserState;

import java.util.List;

/**
 * @author Jobster team
 * date: 25/07/24 18:34
 */
public class TypedAnswerProducer extends AbstractSurveyBotObject implements Producer {

    private final SurveyAnswer answer;

    public TypedAnswerProducer(BotContext botContext, SurveyAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

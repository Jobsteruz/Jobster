package com.smartbox.jobster.bot.tg.survey;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.survey.SurveyAnswer;

/**
 * @author Jobster team
 * date: 24/07/24 18:42
 */
public abstract class AbstractSurveyAnswerProducer extends AbstractSurveyBotObject implements Producer {

    protected SurveyAnswer answer;

    public AbstractSurveyAnswerProducer(BotContext botContext, SurveyAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

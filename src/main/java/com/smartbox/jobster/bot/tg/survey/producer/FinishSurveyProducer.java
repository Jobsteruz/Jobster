package com.smartbox.jobster.bot.tg.survey.producer;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.survey.AbstractSurveyBotObject;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUser;

import java.util.List;

/**
 * @author Jobster team
 * date: 25/07/24 15:32
 */
public class FinishSurveyProducer extends AbstractSurveyBotObject implements Producer {

    private final SurveyUser surveyUser;

    public FinishSurveyProducer(BotContext botContext, SurveyUser surveyUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.bot.tg.questionnaire;

import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.RequestButton;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.Menu;

import java.util.UUID;

public class CheckUpConsumer extends AbstractQuestionObject implements Consumer {
    private Question vacancyQuestion;

    public CheckUpConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Question question() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

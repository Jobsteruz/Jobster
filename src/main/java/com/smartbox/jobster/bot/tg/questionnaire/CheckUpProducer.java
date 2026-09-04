package com.smartbox.jobster.bot.tg.questionnaire;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.StartProducer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.*;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUserState;
import io.jmix.core.SaveContext;
import io.jmix.core.UuidProvider;
import jakarta.persistence.Entity;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CheckUpProducer extends AbstractQuestionObject implements Producer {
    private Question vacancyQuestion;
    private Vacancy vacancy;


    public CheckUpProducer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CheckUpProducer(BotContext botContext, Question vacancyQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CheckUpProducer(BotContext botContext, String vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Producer processVacancy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Applicant copyEntities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Question question() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

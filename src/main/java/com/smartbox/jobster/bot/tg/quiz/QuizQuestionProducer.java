package com.smartbox.jobster.bot.tg.quiz;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import com.smartbox.jobster.entity.quiz.QuizQuestion;
import com.smartbox.jobster.entity.ref.SettingType;

import java.time.OffsetDateTime;

public class QuizQuestionProducer extends AbstractBotObject implements Producer {
    QuizPersonQuestion quizPersonQuestion;
    QuizPerson quizPerson;

    public QuizQuestionProducer(BotContext botContext, QuizPersonQuestion quizPersonQuestion) {
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
}

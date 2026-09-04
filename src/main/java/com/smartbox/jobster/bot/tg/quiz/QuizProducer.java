package com.smartbox.jobster.bot.tg.quiz;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;


public class QuizProducer extends AbstractBotObject implements Producer {
    QuizPerson quizPerson;

    public QuizProducer(BotContext botContext, QuizPerson quizPerson) {
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

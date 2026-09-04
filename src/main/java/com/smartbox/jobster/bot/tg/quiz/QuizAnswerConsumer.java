package com.smartbox.jobster.bot.tg.quiz;

import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;

import java.util.UUID;


public class QuizAnswerConsumer extends AbstractBotObject implements Consumer {
    QuizAnswer quizAnswer = null;
    QuizPersonQuestion quizPersonQuestion = null;

    public QuizAnswerConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

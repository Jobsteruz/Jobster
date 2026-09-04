package com.smartbox.jobster.bot.tg.quiz;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;

public class QuizAnswerProducer extends AbstractBotObject implements Producer {
    QuizAnswer quizAnswer;
    QuizPersonQuestion quizPersonQuestion;

    public QuizAnswerProducer(BotContext botContext, QuizAnswer quizAnswer, QuizPersonQuestion quizPersonQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeQuizAnswers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

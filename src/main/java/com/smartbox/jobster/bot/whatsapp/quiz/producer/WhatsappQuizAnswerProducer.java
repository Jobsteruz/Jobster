package com.smartbox.jobster.bot.whatsapp.quiz.producer;

import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.AbstractWhatsappProducer;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;

import java.util.UUID;

public class WhatsappQuizAnswerProducer extends AbstractWhatsappProducer {
    QuizAnswer quizAnswer;
    QuizPersonQuestion quizPersonQuestion;

    public WhatsappQuizAnswerProducer(WhatsappContext context, QuizAnswer quizAnswer, QuizPersonQuestion quizPersonQuestion) {
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
}

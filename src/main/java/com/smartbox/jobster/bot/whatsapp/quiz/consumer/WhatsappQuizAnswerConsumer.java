package com.smartbox.jobster.bot.whatsapp.quiz.consumer;

import com.smartbox.jobster.bot.tg.BotData;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.AbstractWhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.quiz.producer.WhatsappQuizAnswerProducer;
import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;

import java.util.List;
import java.util.UUID;

public class WhatsappQuizAnswerConsumer extends AbstractWhatsappConsumer implements BotData {
    QuizAnswer quizAnswer = null;
    QuizPersonQuestion quizPersonQuestion = null;

    public WhatsappQuizAnswerConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.bot.whatsapp.quiz.consumer;

import com.smartbox.jobster.bot.tg.BotData;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.AbstractWhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.quiz.producer.WhatsappQuizQuestionProducer;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;

import java.util.UUID;

public class WhatsappQuizQuestionConsumer extends AbstractWhatsappConsumer implements BotData {
    QuizPersonQuestion quizPersonQuestion = null;

    public WhatsappQuizQuestionConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

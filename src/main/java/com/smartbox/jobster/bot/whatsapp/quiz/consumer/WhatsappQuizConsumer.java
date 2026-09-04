package com.smartbox.jobster.bot.whatsapp.quiz.consumer;

import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.AbstractWhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.quiz.producer.WhatsappQuizProducer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.service.whatsapp.WhatsappMessengerFactory;

public class WhatsappQuizConsumer extends AbstractWhatsappConsumer {
    QuizPerson quizPerson;
    WhatsappMessengerFactory messengerFactory;

    public WhatsappQuizConsumer(WhatsappContext botContext, QuizPerson quizPerson, WhatsappMessengerFactory messengerFactory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

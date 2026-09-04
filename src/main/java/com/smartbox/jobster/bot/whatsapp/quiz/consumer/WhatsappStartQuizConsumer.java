package com.smartbox.jobster.bot.whatsapp.quiz.consumer;

import com.smartbox.jobster.bot.tg.BotData;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.AbstractWhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.quiz.producer.WhatsappQuizQuestionProducer;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.quiz.QuizPersonQuestion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class WhatsappStartQuizConsumer extends AbstractWhatsappConsumer implements BotData {
    Logger log = LoggerFactory.getLogger(WhatsappStartQuizConsumer.class);
    QuizPerson quizPerson = null;

    public WhatsappStartQuizConsumer(WhatsappContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

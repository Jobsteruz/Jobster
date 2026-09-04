package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.event.EventData;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.questionnaire.WhatsappQuestionCallbackConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappData;
import com.smartbox.jobster.bot.whatsapp.quiz.consumer.WhatsappQuizAnswerConsumer;
import com.smartbox.jobster.bot.whatsapp.quiz.consumer.WhatsappQuizQuestionConsumer;
import com.smartbox.jobster.bot.whatsapp.quiz.consumer.WhatsappStartQuizConsumer;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import com.smartbox.jobster.service.whatsapp.WhatsappMenuService;

public interface WhatsappCallbackConsumer extends WhatsappConsumer {

    static WhatsappConsumer findConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

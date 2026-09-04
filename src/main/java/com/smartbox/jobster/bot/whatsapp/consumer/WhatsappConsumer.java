package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.questionnaire.WhatsappQuestionConsumer;
import com.smartbox.jobster.entity.whatsapp.WAUserState;

public interface WhatsappConsumer {


    static WhatsappConsumer findConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    Object consume();

}

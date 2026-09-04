package com.smartbox.jobster.bot.whatsapp.consumer.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.consumer.WhatsappConsumer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappMenuBackProducer;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappMenuSelectProducer;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.WhatsappNextQuestionProducer;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.WhatsappPreviousQuestionProducer;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.WhatsappQuestionProducer;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.ref.SettingType;

public class WhatsappQuestionCallbackConsumer extends AbstractWhatsappQuestionConsumer implements WhatsappConsumer {

    protected Question question;

    public WhatsappQuestionCallbackConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

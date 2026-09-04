package com.smartbox.jobster.bot.whatsapp.producer;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.event.EventData;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.quiz.AbstractWhatsappQuizObject;
import com.smartbox.jobster.entity.ref.AutoFillTempDTO;
import com.smartbox.jobster.entity.ref.SettingType;
import com.whatsapp.api.domain.messages.Body;
import io.jmix.core.Messages;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class WhatsappMeetingProducer extends AbstractWhatsappQuizObject implements WhatsappProducer {
    AutoFillTempDTO dto;
    Messages messages;
    String message;

    public WhatsappMeetingProducer(WhatsappContext botContext, AutoFillTempDTO dto, String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

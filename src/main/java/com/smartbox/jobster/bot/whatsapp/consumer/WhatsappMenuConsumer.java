package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.*;
import com.smartbox.jobster.bot.whatsapp.producer.questionnaire.WhatsappQuestionProducer;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.PostType;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;

import java.util.Collection;
import java.util.Objects;

public class WhatsappMenuConsumer extends AbstractWhatsappConsumer {

    protected final Collection<WhatsappMenu> menus;

    public WhatsappMenuConsumer(WhatsappContext botContext, Collection<WhatsappMenu> menus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

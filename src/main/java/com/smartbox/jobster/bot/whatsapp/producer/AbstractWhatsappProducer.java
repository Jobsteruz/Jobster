package com.smartbox.jobster.bot.whatsapp.producer;

import com.smartbox.jobster.bot.whatsapp.AbstractWhatsappService;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;

import java.util.Objects;

public abstract class AbstractWhatsappProducer extends AbstractWhatsappService implements WhatsappProducer {


    protected final WhatsappContext context;

    public AbstractWhatsappProducer(WhatsappContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public WhatsappContext getBotContext() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}

package com.smartbox.jobster.bot.whatsapp.producer;

import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;
import com.whatsapp.api.domain.messages.Body;

public abstract class AbstractWhatsappMenuProducer extends AbstractWhatsappProducer {

    protected final WhatsappMenu currentMenu;

    public AbstractWhatsappMenuProducer(WhatsappContext context, WhatsappMenu currentMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

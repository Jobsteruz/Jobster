package com.smartbox.jobster.bot.whatsapp.producer;

import com.smartbox.jobster.bot.whatsapp.InlineExceededException;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.whatsapp.api.domain.messages.Body;
import com.whatsapp.api.domain.messages.Header;
import com.whatsapp.api.domain.messages.Image;
import com.whatsapp.api.domain.messages.type.HeaderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class WhatsappStarterProducer extends AbstractWhatsappProducer {

    private static final Logger log = LoggerFactory.getLogger(WhatsappStarterProducer.class);

    public WhatsappStarterProducer(WhatsappContext context) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Header getMessageHeader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

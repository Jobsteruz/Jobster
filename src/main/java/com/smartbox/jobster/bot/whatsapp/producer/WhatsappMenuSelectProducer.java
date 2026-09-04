package com.smartbox.jobster.bot.whatsapp.producer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.whatsapp.InlineExceededException;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.entity.whatsapp.WAUserState;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;
import com.smartbox.jobster.entity.whatsapp.WhatsappPost;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.whatsapp.api.domain.messages.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

public class WhatsappMenuSelectProducer extends AbstractWhatsappMenuProducer {

    private static final Logger log = LoggerFactory.getLogger(WhatsappMenuSelectProducer.class);


    public WhatsappMenuSelectProducer(WhatsappContext context, WhatsappMenu menu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

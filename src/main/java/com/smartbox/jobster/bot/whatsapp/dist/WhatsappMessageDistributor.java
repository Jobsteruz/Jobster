package com.smartbox.jobster.bot.whatsapp.dist;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.whatsapp.WhatsappBotService;
import com.whatsapp.api.domain.webhook.Change;
import com.whatsapp.api.domain.webhook.Message;
import com.whatsapp.api.domain.webhook.Value;
import com.whatsapp.api.domain.webhook.type.FieldType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsappMessageDistributor {

    private static final Logger log = LoggerFactory.getLogger(WhatsappMessageDistributor.class);

    public static void distribute(Change change) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static void distribute(Message message, String botPhoneNumberId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


package com.smartbox.jobster.bot.whatsapp.dist;

import com.smartbox.jobster.$;
import com.whatsapp.api.domain.webhook.Change;
import com.whatsapp.api.domain.webhook.Entry;
import com.whatsapp.api.domain.webhook.WebHookEvent;
import com.whatsapp.api.domain.webhook.type.FieldType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class WhatsappEventDistributor {


    private static final Logger log = LoggerFactory.getLogger(WhatsappEventDistributor.class);

    public static void distribute(WebHookEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static void distribute(Change change) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

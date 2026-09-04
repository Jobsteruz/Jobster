package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.bot.whatsapp.AbstractWhatsappService;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import lombok.Getter;

@Getter
public class WhatsappFileIdConsumer extends AbstractWhatsappService implements WhatsappConsumer {

    public static final String FUNCTION_NAME = "get_file_id()";
    protected final WhatsappContext botContext;

    public WhatsappFileIdConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

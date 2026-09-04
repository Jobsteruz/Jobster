package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.bot.whatsapp.AbstractWhatsappService;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public abstract class AbstractWhatsappConsumer extends AbstractWhatsappService implements WhatsappConsumer {

    protected final WhatsappContext botContext;

    public AbstractWhatsappConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getAnswerAndQuestionUUId(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

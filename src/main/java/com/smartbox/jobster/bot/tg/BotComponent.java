package com.smartbox.jobster.bot.tg;

import com.pengrad.telegrambot.model.request.Keyboard;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jobster team
 * Since: 8/14/2023 5:35 PM
 */
public interface BotComponent extends BotData {
    Logger log = LoggerFactory.getLogger(BotComponent.class);

    @NotNull
    BotContext getBotContext();

    default Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

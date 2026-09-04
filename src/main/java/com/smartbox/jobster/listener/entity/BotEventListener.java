package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.tg.BotService;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/13/2023 3:20 PM
 */
@Component
public class BotEventListener {

    @Autowired
    private BotService botService;

    @EventListener
    void onBotChangedBeforeCommit(EntityChangedEvent<Bot> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

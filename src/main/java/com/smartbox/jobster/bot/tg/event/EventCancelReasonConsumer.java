package com.smartbox.jobster.bot.tg.event;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import io.jmix.core.DataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventCancelReasonConsumer extends AbstractBotObject implements Consumer {

    private static final Logger logger = LoggerFactory.getLogger(EventCancelReasonConsumer.class);

    private final EventCancelReason cancelReason;
    private final Event event;
    private final DataManager dataManager;

    public EventCancelReasonConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String[] extractHashids(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.bot.tg.manager.consumer;


import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerReservedProducer;
import com.smartbox.jobster.entity.hrm.Position;

/**
 * @author Jobster team
 * Since: 12/30/2025 11:53 AM
 */
public class ManagerReservedConsumer extends AbstractManagerBotObject implements Consumer {
    private final Position position;
    Integer startAt = null;

    public ManagerReservedConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManagerReservedConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManagerReservedConsumer(BotContext botContext, String data, boolean loadPosition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

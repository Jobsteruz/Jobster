package com.smartbox.jobster.bot.tg.manager.consumer;


import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerPersonCancelProducer;
import com.smartbox.jobster.entity.ats.CancelReason;

/**
 * @author Jobster team
 * Since: 12/26/2025 11:33 AM
 */
public class ManagerPersonCancelConsumer extends AbstractManagerBotObject implements Consumer {
    private final CancelReason cancelReason;

    public ManagerPersonCancelConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

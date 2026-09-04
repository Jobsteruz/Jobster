package com.smartbox.jobster.bot.tg.manager.consumer;


import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerPersonRejectProducer;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;

/**
 * @author Jobster team
 * Since: 12/26/2025 11:19 AM
 */
public class ManagerPersonRejectConsumer extends AbstractManagerBotObject implements Consumer {
    private final KanbanStageEntity stageEntity;

    public ManagerPersonRejectConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.bot.tg.manager.consumer;


import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.bot.tg.manager.ManagerData;
import com.smartbox.jobster.bot.tg.manager.producer.ManagerPersonProducer;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;

/**
 * @author Jobster team
 * Since: 12/24/2025 2:30 PM
 */
public class ManagerPersonConsumer extends AbstractManagerBotObject implements Consumer {
    private final KanbanStageEntity stageEntity;

    public ManagerPersonConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

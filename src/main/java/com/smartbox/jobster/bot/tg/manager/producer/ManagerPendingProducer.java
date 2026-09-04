package com.smartbox.jobster.bot.tg.manager.producer;


import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.SettingType;
import io.jmix.core.entity.KeyValueEntity;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/23/2025 1:17 PM
 */
public class ManagerPendingProducer extends AbstractManagerBotObject implements Producer {
    Employee employee;
    Integer startAt = null;
    List<KeyValueEntity> stageEntities;

    public ManagerPendingProducer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManagerPendingProducer(BotContext botContext, Integer startAt) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

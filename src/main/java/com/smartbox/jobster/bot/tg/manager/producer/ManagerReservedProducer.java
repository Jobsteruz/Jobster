package com.smartbox.jobster.bot.tg.manager.producer;


import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.bot.tg.manager.ManagerCache;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.ref.SettingType;
import io.jmix.core.entity.KeyValueEntity;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/30/2025 11:56 AM
 */
public class ManagerReservedProducer extends AbstractManagerBotObject implements Producer {
    Employee employee;
    Position position;
    Integer startAt = null;
    Map<Position, List<UUID>> positionIdsMap;

    public ManagerReservedProducer(BotContext botContext, Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManagerReservedProducer(BotContext botContext, Position position, Integer startAt) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KeyValueEntity> loadEntities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Keyboard getKeyboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

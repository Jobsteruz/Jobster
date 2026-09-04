package com.smartbox.jobster.bot.tg.manager.producer;


import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.ref.SettingType;

import java.util.List;

/**
 * @author Jobster team
 * Since: 12/26/2025 11:21 AM
 */
public class ManagerPersonRejectProducer extends AbstractManagerBotObject implements Producer {
    private final KanbanStageEntity stageEntity;

    public ManagerPersonRejectProducer(BotContext botContext, KanbanStageEntity stageEntity) {
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

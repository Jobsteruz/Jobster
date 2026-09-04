package com.smartbox.jobster.bot.tg.manager.producer;


import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.ReplyKeyboardRemove;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.TgUserState;

/**
 * @author Jobster team
 * Since: 12/26/2025 11:35 AM
 */
public class ManagerPersonCancelProducer extends AbstractManagerBotObject implements Producer {
    private final CancelReason cancelReason;

    public ManagerPersonCancelProducer(BotContext botContext, CancelReason cancelReason) {
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

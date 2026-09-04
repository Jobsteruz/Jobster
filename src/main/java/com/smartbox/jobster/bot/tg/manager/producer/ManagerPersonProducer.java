package com.smartbox.jobster.bot.tg.manager.producer;


import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.manager.AbstractManagerBotObject;
import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Format;

/**
 * @author Jobster team
 * Since: 12/24/2025 3:12 PM
 */
public class ManagerPersonProducer extends AbstractManagerBotObject implements Producer {
    private final KanbanStageEntity stageEntity;
    boolean showKeyboard = false;

    public ManagerPersonProducer(BotContext botContext, KanbanStageEntity stageEntity) {
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

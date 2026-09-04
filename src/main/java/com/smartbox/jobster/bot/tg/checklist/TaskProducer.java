package com.smartbox.jobster.bot.tg.checklist;


import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.checklist.Task;
import com.smartbox.jobster.entity.ref.SettingType;

import java.util.UUID;

/**
 * @author Jobster team
 * Since: 11/13/2024 12:22 PM
 */
public class TaskProducer extends AbstractBotObject implements Producer {
    Task task;

    public TaskProducer(BotContext botContext, Task task) {
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

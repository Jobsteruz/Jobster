package com.smartbox.jobster.bot.tg.schedule;

import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.entity.schedule.Schedule;

public class ScheduleConsumer extends AbstractBotObject implements Consumer {
    Schedule schedule;

    public ScheduleConsumer(BotContext botContext, Schedule schedule) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

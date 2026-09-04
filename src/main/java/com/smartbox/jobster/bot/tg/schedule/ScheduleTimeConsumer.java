package com.smartbox.jobster.bot.tg.schedule;

import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.entity.schedule.TimeSlot;

public class ScheduleTimeConsumer extends AbstractBotObject implements Consumer, ScheduleData {
    String data;
    TimeSlot slot;

    public ScheduleTimeConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

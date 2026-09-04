package com.smartbox.jobster.bot.tg.schedule;

import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.schedule.Schedule;

public class ScheduleWeekConsumer extends AbstractBotObject implements Consumer, ScheduleData {
    Schedule schedule;
    WeekDay weekDay;

    public ScheduleWeekConsumer(BotContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

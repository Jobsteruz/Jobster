package com.smartbox.jobster.bot.tg.schedule;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import com.smartbox.jobster.service.SequenceService;

import java.time.LocalDate;
import java.util.List;

public class ScheduleWeekProducer extends AbstractBotObject implements Producer, ScheduleData {
    Schedule schedule;
    WeekDay weekDay;
    List<TimeSlot> slots;

    public ScheduleWeekProducer(BotContext botContext, Schedule schedule, WeekDay weekDay) {
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

package com.smartbox.jobster.bot.tg.schedule;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.service.SequenceService;

import java.util.Arrays;

public class ScheduleProducer extends AbstractBotObject implements Producer, ScheduleData {
    Schedule schedule;
    Integer msgId;

    public ScheduleProducer(BotContext botContext, Schedule schedule) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ScheduleProducer(BotContext botContext, Schedule schedule, Integer msgId) {
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

package com.smartbox.jobster.bot.tg.schedule;

import com.smartbox.jobster.entity.WeekDay;

public interface ScheduleData {

    String SCHEDULE = "SCHED_";
    String WEEK = "_WEEK_";
    String TIME = "_TIME_";
    String BACK = "_BACK";

    default String fetchHashids(String data, String suffix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default WeekDay fetchWeek(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default String fetchSlotId(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

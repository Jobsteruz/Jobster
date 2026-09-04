package com.smartbox.jobster.bot.tg.attendance;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.service.attendance.AttendanceService;

public class AttendanceProcessProducer extends AbstractBotObject implements Producer {
    private final Integer messageId;

    public AttendanceProcessProducer(BotContext botContext, Integer messageId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

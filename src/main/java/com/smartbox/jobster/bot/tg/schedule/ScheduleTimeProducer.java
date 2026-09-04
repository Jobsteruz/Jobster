package com.smartbox.jobster.bot.tg.schedule;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.CallbackConsumer;
import com.smartbox.jobster.bot.tg.Producer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import com.smartbox.jobster.utils.StringConstants;
import io.jmix.core.FetchPlan;
import org.json.JSONObject;

import java.time.LocalDate;

public class ScheduleTimeProducer extends AbstractBotObject implements Producer, ScheduleData {
    TimeSlot slot;

    public ScheduleTimeProducer(BotContext botContext, TimeSlot slot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object produce() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Applicant loadApplicant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

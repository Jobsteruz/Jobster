package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.schedule.ScheduleConsumer;
import com.smartbox.jobster.bot.tg.schedule.ScheduleProducer;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.schedule.Schedule;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.utils.StringConstants;
import io.jmix.core.DataManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class ScheduleService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;

    public <T extends Person> void send(Schedule schedule, T person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Schedule getByCode(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Schedule getByHashids(String hashids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<TimeSlot> getSlotsByWeekDay(Schedule schedule, WeekDay weekDay, LocalDate next) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LocalDate next(WeekDay day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<TimeSlot> loadSlotsByScheduleAndWeekDay(Schedule schedule, String weekday) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Schedule loadScheduleByCode(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

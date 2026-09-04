package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.schedule.TimeSlot;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;


/**
 * @author Jobster team
 * Since: 4/6/2024 2:15 PM
 */
@Service
public class EventService {
    public static final long DURATION_SECONDS = 30 * 60;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;

    public List<Event> employeeEventsByApplicant(Employee employee, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean existsEvent(OffsetDateTime eventDate, Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String eventMessage(Event event, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Event> loadEventsBySlotAndTime(TimeSlot slot, OffsetDateTime date) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Event getEventByHashids(String hashids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EventCancelReason getEventCancelReasonByHashids(String hashids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public OffsetDateTime getApplicantLastEventDate(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

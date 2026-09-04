package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.google.GoogleCalendarService;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class EventCalendarSyncListener {
    private static final Logger log = LoggerFactory.getLogger(EventCalendarSyncListener.class);

    private final EntityService entityService;
    private final GoogleCalendarService googleCalendarService;

    @EventListener
    void onEventChangedAfterCommit(EntityChangedEvent<Event> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

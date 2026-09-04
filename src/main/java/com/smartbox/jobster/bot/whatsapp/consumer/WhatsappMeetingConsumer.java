package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.event.EventData;
import com.smartbox.jobster.bot.whatsapp.InlineMarkup;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappStarterProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.kanban.EventResponse;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.SettingType;
import com.whatsapp.api.domain.messages.Body;
import io.jmix.core.DataManager;
import jakarta.persistence.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class WhatsappMeetingConsumer extends AbstractWhatsappConsumer {

    private static final Logger logger = LoggerFactory.getLogger(WhatsappMeetingConsumer.class);

    Event event;
    EventResponse response;
    DataManager dataManager;

    public WhatsappMeetingConsumer(WhatsappContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Body getMessageBody() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Event loadEventFromData(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String extractEventId(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private EventResponse getResponseCode(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showCancelReasonButtons(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveDeclineWithoutReason(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

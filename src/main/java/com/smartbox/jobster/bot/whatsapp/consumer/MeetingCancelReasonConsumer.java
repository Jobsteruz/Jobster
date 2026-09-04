package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.event.EventData;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappStarterProducer;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.SettingType;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeetingCancelReasonConsumer extends AbstractWhatsappConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MeetingCancelReasonConsumer.class);

    EventCancelReason cancelReason;
    Event event;
    DataManager dataManager;
    Messages messages;

    public MeetingCancelReasonConsumer(WhatsappContext botContext, String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String[] extractHashids(String data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

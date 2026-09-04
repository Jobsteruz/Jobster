package com.smartbox.jobster.bot.whatsapp.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.whatsapp.WhatsappContext;
import com.smartbox.jobster.bot.whatsapp.WhatsappFile;
import com.smartbox.jobster.bot.whatsapp.producer.WhatsappMenuBackProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.pojo.event.MessageHistoryPojo;
import com.whatsapp.api.domain.media.MediaFile;
import io.jmix.core.FileRef;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WhatsappFeedbackConsumer extends AbstractWhatsappConsumer {
    private static final Logger log = LoggerFactory.getLogger(WhatsappFeedbackConsumer.class);

    public WhatsappFeedbackConsumer(WhatsappContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FileRef makeFile(WhatsappFile file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

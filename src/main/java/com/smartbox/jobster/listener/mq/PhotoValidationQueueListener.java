package com.smartbox.jobster.listener.mq;

import com.pengrad.telegrambot.model.request.KeyboardButton;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.Setting;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.tg.TgUserState;
import com.smartbox.jobster.pojo.PhotoValidationPojo;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.FaceDetectionService;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.tg.BotService;
import io.jmix.core.Messages;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.core.security.Authenticated;
import jakarta.persistence.Entity;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@ConditionalOnProperty("spring.rabbitmq.listen")
@RequiredArgsConstructor
public class PhotoValidationQueueListener {

    private static final Logger log = LoggerFactory.getLogger(PhotoValidationQueueListener.class);

    private final FaceDetectionService faceDetectionService;
    private final BotService botService;
    private final MQService mqService;
    private final Messages messages;
    private final EntityService entityService;
    private final UnconstrainedDataManager unconstrainedDataManager;

    @RabbitListener(queues = "${spring.rabbitmq.jb.template.photo-validation-queue}")
    @Authenticated
    public void listen(PhotoValidationPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendValidationFailureMessage(Person person, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull JSONObject getJsonObject(Person person, TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

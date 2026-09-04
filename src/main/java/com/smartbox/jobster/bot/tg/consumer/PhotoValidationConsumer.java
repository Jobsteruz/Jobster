package com.smartbox.jobster.bot.tg.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.bot.tg.producer.WrongChoiceProducer;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.TgFile;
import com.smartbox.jobster.service.FaceDetectionService;
import io.jmix.core.FileRef;
import io.jmix.core.SaveContext;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class PhotoValidationConsumer extends AbstractBotObject implements Consumer {

    private static final Logger log = LoggerFactory.getLogger(PhotoValidationConsumer.class);

    public PhotoValidationConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Object sendValidationFailureMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updatePhotoOfPersons(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
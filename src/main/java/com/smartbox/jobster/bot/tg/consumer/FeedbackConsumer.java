package com.smartbox.jobster.bot.tg.consumer;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bot.tg.AbstractBotObject;
import com.smartbox.jobster.bot.tg.BotContext;
import com.smartbox.jobster.bot.tg.Consumer;
import com.smartbox.jobster.bot.tg.MenuBackProducer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ref.SettingType;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.entity.tg.TgFile;
import com.smartbox.jobster.pojo.event.MessageHistoryPojo;
import com.smartbox.jobster.service.person.PersonActionService;
import io.jmix.core.FileRef;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @author Jobster team
 * Since: 3/9/2024 12:28 PM
 */
public class FeedbackConsumer extends AbstractBotObject implements Consumer {
    Logger log = LoggerFactory.getLogger(FeedbackConsumer.class);

    public FeedbackConsumer(BotContext botContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Object consume() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

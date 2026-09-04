package com.smartbox.jobster.service.sms;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.smartbox.jobster.entity.config.FailedSMSNotifierBotSettings;
import com.smartbox.jobster.pojo.SmsPojo;

import java.time.Duration;

/**
 * @author Jobster team
 * Since: 5/6/2024 6:38 PM
 */
public interface SmsService {
    long CACHE_TTL_SECONDS = Duration.ofMinutes(10).toSeconds();

    boolean sendSms(SmsPojo pojo);

    default void sendFailingError(FailedSMSNotifierBotSettings settings, SMSErrorHandlerDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


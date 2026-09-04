package com.smartbox.jobster.pojo;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.DeleteWebhook;
import com.pengrad.telegrambot.request.SetWebhook;
import com.pengrad.telegrambot.response.BaseResponse;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.tg.BotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @author Jobster team
 * Date: 11/17/2023 3:28 PM
 */

public class JobsterBot extends TelegramBot {
    private static final Logger log = LoggerFactory.getLogger(JobsterBot.class);

    UUID botId;
    String botUrl;
    BotService botService;

    public JobsterBot(String botToken, UUID botId, String botUrl) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean start() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean stop() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
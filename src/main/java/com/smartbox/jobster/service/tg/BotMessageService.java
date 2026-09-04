package com.smartbox.jobster.service.tg;

import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.*;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.SendResponse;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.TgMessageIdsCache;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.Format;
import com.smartbox.jobster.pojo.JobsterBot;
import com.smartbox.jobster.pojo.TgMessagePart;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.MessageHistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/12/2023 4:28 PM
 */
@Service
public class BotMessageService {
    private static final Logger log = LoggerFactory.getLogger(BotMessageService.class);

    @Value("${bot.url}")
    private String botUrl;

    @Autowired
    private MessageHistoryService messageHistoryService;
    @Autowired
    private BotService botService;
    @Autowired
    private TgMessageIdsCache tgMessageIdsCache;


    public void sendLocation(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPhoto(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendDocument(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendAudio(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendAnimation(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendVideo(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void deleteMessage(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void editMessageText(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void editMessageReply(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void answerCallbackQuery(TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendMessageParts(TgMessagePojo pojo, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendMessagePart(TgMessagePojo pojo, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends BaseRequest<T, R>, R extends BaseResponse> boolean execute(BaseRequest<T, R> request, TgMessagePojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private JobsterBot jobsterBot(UUID botId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

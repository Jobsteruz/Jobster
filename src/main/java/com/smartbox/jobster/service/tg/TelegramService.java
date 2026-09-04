package com.smartbox.jobster.service.tg;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.request.GetChat;
import com.pengrad.telegrambot.request.GetFile;
import com.pengrad.telegrambot.response.GetChatResponse;
import com.pengrad.telegrambot.response.GetFileResponse;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.tg.*;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.FileService;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.service.TranslateService;
import io.jmix.core.FileRef;
import io.jmix.core.TimeSource;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jobster team
 * Since: 12/14/2023 2:57 PM
 */
@Service
public class TelegramService {

    @Autowired
    private EntityService entityService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private MQService mqService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private FileService fileService;

    public void sendPost(TgUser tgUser, Bot bot, Post post) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPost(TgUser tgUser, Bot bot, Post post, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPost(TgUser tgUser, Bot bot, Post post, Keyboard keyboard, boolean trackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPost(Long chatId, String locale, Bot bot, Post post, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendPost(Long chatId, String locale, Bot bot, Post post, Keyboard keyboard, boolean trackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Format format) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview, FileRef file, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview, FileRef file, FileType fileType, boolean trackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(Long chatId, Bot bot, String text, Format format, FileRef file, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(Long chatId, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview, FileRef file, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(TgUser tgUser, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview, String fileUrl, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void sendMessage(Long chatId, Bot bot, String text, Format format, Keyboard keyboard, boolean webPagePreview, FileRef file, FileType fileType, boolean trackId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void deleteMessage(TgUser tgUser, Bot bot, Integer messageId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void editMessage(TgUser tgUser, Bot bot, Integer messageId, String text, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void answerCallBackMessage(TgUser tgUser, Bot bot, String text, String callbackId, Keyboard keyboard) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FileRef loadFile(Bot bot, TgFile file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Telegram kanal yoki guruh haqida ma'lumot olish
     *
     * @param bot         Bot entity
     * @param channelLink Kanal linki (username yoki post linki)
     * @return Chat obyekti yoki null
     */
    public Chat getChatInfo(Bot bot, String channelLink) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Link yoki username dan chat ID ni ajratib olish
     *
     * @param link Kanal linki yoki username
     * @return Chat ID (username yoki numeric ID)
     */
    private String parseChatId(String link) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

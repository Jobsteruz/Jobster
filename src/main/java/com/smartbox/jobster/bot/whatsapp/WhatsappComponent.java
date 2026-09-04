package com.smartbox.jobster.bot.whatsapp;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.whatsapp.WhatsappMessengerService;
import com.whatsapp.api.domain.media.Media;
import com.whatsapp.api.domain.media.MediaFile;
import com.whatsapp.api.domain.messages.*;
import com.whatsapp.api.domain.messages.response.MessageResponse;
import io.jmix.core.FileRef;

public interface WhatsappComponent {

    String makeFileUrl(FileRef fileRef);

    WhatsappMessengerService messenger();

    WhatsappContext getBotContext();

    default Message.MessageBuilder messageBuilder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MessageResponse sendMessage(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MessageResponse sendTextMessage(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MessageResponse echoMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MessageResponse sendTextMessage(String content, boolean previewUrl) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    default MessageResponse sendLocation(String latitude, String longitude, String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MessageResponse sendPost(String content, FileType fileType, FileRef fileRef, String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String cleanText(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static void sanitizeHtml(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default Media getFileUrlById(String mediaId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MediaFile getFileByUrl(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default MediaFile downloadFile(String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    default String sendLocationRequest(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

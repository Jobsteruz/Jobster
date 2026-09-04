package com.smartbox.jobster.service.whatsapp;

import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.whatsapp.api.WhatsappApiFactory;
import com.whatsapp.api.domain.media.FileType;
import com.whatsapp.api.domain.media.Media;
import com.whatsapp.api.domain.media.MediaFile;
import com.whatsapp.api.domain.media.UploadResponse;
import com.whatsapp.api.domain.messages.*;
import com.whatsapp.api.domain.messages.response.MessageResponse;
import com.whatsapp.api.impl.WhatsappBusinessCloudApi;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Jobster team
 * Date: 27/11/24 15:35
 */
@Component
@Scope("prototype")
public class WhatsappMessengerServiceImpl implements WhatsappMessengerService {

    private static final Logger log = LoggerFactory.getLogger(WhatsappMessengerServiceImpl.class);


    private final WhatsappBot bot;
    private WhatsappBusinessCloudApi cloudApiInstance;

    public WhatsappMessengerServiceImpl(WhatsappBot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private WhatsappBusinessCloudApi businessCloudApi() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendMessage(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendTextMessage(String receiver, String msg) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendAudioMessage(String to, String caption, String link, String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendAudioMessage(String to, String caption, byte[] content, String fileName, String extension) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendVideoMessage(String to, String caption, String link, String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendVideoMessage(String to, String caption, byte[] content, String fileName, String extension) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendImageMessage(String to, String caption, String link, String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendImageMessage(String to, String caption, byte[] content, String fileName, String extension) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendDocumentMessage(String to, String caption, String fileName, String link, String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageResponse sendDocumentMessage(String to, String caption,
                                               byte[] content, String fileName, String extension) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String sendLocationRequest(String to, String caption) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public UploadResponse uploadFileToWhatsapp(byte[] content, String fileName, FileType fileType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Media retrievedUrlFromWhatsappById(String fileId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MediaFile downloadFileFromWhatsappByUrl(String url) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
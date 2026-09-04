package com.smartbox.jobster.service.whatsapp;

import com.whatsapp.api.domain.media.FileType;
import com.whatsapp.api.domain.media.Media;
import com.whatsapp.api.domain.media.MediaFile;
import com.whatsapp.api.domain.media.UploadResponse;
import com.whatsapp.api.domain.messages.Message;
import com.whatsapp.api.domain.messages.response.MessageResponse;

public interface WhatsappMessengerService {

    MessageResponse sendMessage(Message message);

    MessageResponse sendTextMessage(String to, String message);

    MessageResponse sendAudioMessage(String to, String caption, String link, String fileId);

    MessageResponse sendAudioMessage(String to, String caption, byte[] content, String fileName, String extension);

    MessageResponse sendVideoMessage(String to, String caption, String link, String fileId);

    MessageResponse sendVideoMessage(String to, String caption, byte[] content, String fileName, String extension);

    MessageResponse sendImageMessage(String to, String caption, String link, String fileId);

    MessageResponse sendImageMessage(String to, String caption, byte[] content, String fileName, String extension);

    MessageResponse sendDocumentMessage(String to, String caption,String fileName, String link, String fileId);

    MessageResponse sendDocumentMessage(String to, String caption, byte[] content, String fileName, String extension);

    String sendLocationRequest(String to, String caption);

    UploadResponse uploadFileToWhatsapp(byte[] content, String fileName, FileType fileType);

    Media retrievedUrlFromWhatsappById(String fileId);

    MediaFile downloadFileFromWhatsappByUrl(String url);
}

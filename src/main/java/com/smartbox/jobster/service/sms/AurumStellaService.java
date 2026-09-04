package com.smartbox.jobster.service.sms;

import com.google.gson.Gson;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.config.AurumStellaSettings;
import com.smartbox.jobster.entity.config.FailedSMSNotifierBotSettings;
import com.smartbox.jobster.pojo.SmsPojo;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.impl.TimeSourceImpl;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@Service("jb_AurumStellaService")
@RequiredArgsConstructor
public class AurumStellaService implements SmsService {
    private static final Logger log = LoggerFactory.getLogger(AurumStellaService.class);

    private final TimeSourceImpl timeSource;
    private final AppSettings appSettings;

    @Override
    public boolean sendSms(SmsPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean sendSms(SmsPojo pojo, boolean trying) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handleFailingSMS(SmsPojo pojo, HttpResponse<Response> response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getAuth(AurumStellaSettings settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String sha1(String string) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ToString
    private static class Response {
        String id;
        String error;
        Result result;
    }

    @ToString
    private static class Result {
        String id;
        String message;
    }

    private static class Request {
        RequestParams params;

        public Request(RequestParams params) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    private static class RequestParams {
        String recipient;
        String partner_id;
        String originator;
        String text;

        public RequestParams() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public RequestParams(String recipient, String partner_id, String originator, String text) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }
}

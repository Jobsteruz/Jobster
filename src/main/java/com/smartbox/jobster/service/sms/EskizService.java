package com.smartbox.jobster.service.sms;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.config.EskizSettings;
import com.smartbox.jobster.entity.config.FailedSMSNotifierBotSettings;
import com.smartbox.jobster.pojo.SmsPojo;
import io.jmix.appsettings.AppSettings;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @author Jobster team
 * Since: 5/6/2024 6:40 PM
 */
@Service("jb_EskizService")
public class EskizService implements SmsService {
    private static final Logger log = LoggerFactory.getLogger(EskizService.class);

    // Eskiz token ~30 kun yaroqli. Har SMS'da qayta login qilmaslik uchun cache qilamiz:
    // proaktiv ravishda TTL o'tsa yangilaymiz, va yuborishda 401 kelsa darrov invalidatsiya qilamiz.
    private static final long TOKEN_TTL_MS = Duration.ofDays(25).toMillis();
    private volatile String cachedToken;
    private volatile long tokenFetchedAt;

    @Autowired
    private AppSettings appSettings;

    @Override
    public boolean sendSms(SmsPojo pojo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean sendSms(SmsPojo pojo, boolean trying) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handleFailingSMS(SmsPojo pojo, HttpResponse<SendResult> response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // Cache'langan token'ni qaytaradi; yo'q yoki TTL o'tgan bo'lsa yangilaydi (bitta HTTP login).
    private String getToken(EskizSettings settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // synchronized + double-check: bir nechta thread bir vaqtda kirsa ham FAQAT bitta login qiladi.
    private synchronized String refreshToken(EskizSettings settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void invalidateToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String fetchToken(EskizSettings settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String withFromGateway(String phone, String phoneCodeSkip, String from, String noAlphaName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Data
    private class TokenResult {
        String message;
        TokenDataResult data;
    }

    @Data
    private class TokenDataResult {
        String token;
    }

    @Data
    private class SendResult {
        Object id;
        String status;
        String message;
    }
}

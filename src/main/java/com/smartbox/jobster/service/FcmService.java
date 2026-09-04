package com.smartbox.jobster.service;

import com.google.firebase.messaging.*;
import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.JbAsyncConfigurer;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.config.FcmDeviceToken;
import io.jmix.core.DataManager;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FcmService {

    private static final Logger log = LoggerFactory.getLogger(FcmService.class);

    /**
     * FCM rejects payloads over 4 KB. Since {@link NotificationService} now routes whole rendered
     * templates through here, a long manager template would fail the send outright — and a banner
     * cannot show that much text anyway.
     */
    private static final int MAX_BODY_LENGTH = 1000;

    private final FirebaseMessaging firebaseMessaging;
    private final DataManager dataManager;


    public String sendNotification(User user, String title, String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Fire-and-forget push, used by {@link NotificationService} for every notification row it saves.
     * <p>
     * Runs on the async pool ON PURPOSE: the callers are Vaadin actions (UI thread, holding the
     * VaadinSession lock), entity listeners (inside the caller's transaction, holding a Hikari
     * connection) and MQ listeners — none of them may wait on an FCM round trip.
     * <p>
     * Takes a PREPARED token and plain strings: {@code @Async} carries neither the security nor the
     * tenant context, so nothing entity-scoped may be touched on this thread.
     */
    @Async(JbAsyncConfigurer.FCM_EXECUTOR)
    public void sendNotificationAsync(String token, String title, String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String sendNotification(String token, String title, String body) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String shorten(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public FcmDeviceToken getFcmTokenByUser(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

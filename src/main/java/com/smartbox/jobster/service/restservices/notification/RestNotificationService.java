package com.smartbox.jobster.service.restservices.notification;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.config.FcmDeviceToken;
import com.smartbox.jobster.entity.config.NotificationSetting;
import com.smartbox.jobster.entity.kanban.EventResponse;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.FcmService;
import com.smartbox.jobster.service.ManagerEventResponseService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.notification.NotificationSettingService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.rest.annotation.RestHttpMethod;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestService("api_NotificationService")
@RequiredArgsConstructor
public class RestNotificationService {
    private static final Logger log = LoggerFactory.getLogger(RestNotificationService.class);
    @PersistenceContext
    private EntityManager entityManager;


    private final UserService userService;
    private final EntityService entityService;
    private final FcmService fcmService;
    private final DataManager dataManager;
    private final NotificationSettingService notificationSettingService;
    private final ManagerEventResponseService managerEventResponseService;
    private final TenantProvider tenantProvider;

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<String> test() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<List<Notification>> getNotifications(Integer offset, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<Boolean> readNotification(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The manager answering, from the app, the meeting invite that reached them as a notification —
     * the mobile half of the Telegram accept/decline buttons.
     *
     * @param response {@link EventResponse} id: {@code ACCEPT} or {@code DECLINE}
     * @return 404 when the notification carries no meeting (nothing to confirm), 403 when it is
     * addressed to someone else. Tenant isolation already bounds what a caller can load, but the
     * recipient check is what stops a colleague inside the same tenant from answering an interview
     * that is not theirs.
     */
    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<Boolean> respondToEvent(UUID id, String response) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    @Transactional
    public ResponseEntity<Boolean> markAllAsRead() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<String> setToken(String token, String platformId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<String> removeToken() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.GET)
    public ResponseEntity<NotificationSetting> getNotificationSettings() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @RestMethod(httpMethods = RestHttpMethod.POST)
    public ResponseEntity<NotificationSetting> updateNotificationSettings(
            Boolean emailEnabled, Boolean smsEnabled, Boolean telegramEnabled, Boolean pushEnabled) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

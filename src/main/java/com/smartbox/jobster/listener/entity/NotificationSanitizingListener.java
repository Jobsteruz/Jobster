package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ui.Notification;
import io.jmix.core.event.EntitySavingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Sanitizes {@link Notification#getMessage()} before it is persisted, stripping any XSS payload
 * (e.g. {@code <img src=x onerror=...>}, {@code <script>}) from user-supplied content.
 * <p>
 * Runs for every save path — generic REST API ({@code /rest/entities/jb_Notification}), bots,
 * message queues and services — because they all go through {@code DataManager}, which publishes
 * this event. This is the primary defense; output-side {@code $.safeHtml(...)} at render time
 * is the defense-in-depth complement.
 */
@Component
public class NotificationSanitizingListener {

    @EventListener
    public void onNotificationSaving(EntitySavingEvent<Notification> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

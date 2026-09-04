package com.smartbox.jobster.event;


import com.smartbox.jobster.entity.ui.Notification;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Jobster team
 * Since: 9/14/2024 11:47 AM
 */
@Getter
public class NotificationEvent extends ApplicationEvent {

    public NotificationEvent(Notification source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Notification getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

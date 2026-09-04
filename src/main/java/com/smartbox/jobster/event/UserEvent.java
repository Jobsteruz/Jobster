package com.smartbox.jobster.event;


import com.smartbox.jobster.entity.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Jobster team
 * Since: 9/14/2024 11:43 AM
 */
@Getter
public class UserEvent extends ApplicationEvent {

    public UserEvent(User source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public User getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

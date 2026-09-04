package com.smartbox.jobster.event;

import com.smartbox.jobster.entity.ats.MessageHistory;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Jobster team
 * Since: 3/20/2024 6:09 PM
 */
@Getter
public class MessageHistoryEvent extends ApplicationEvent {

    public MessageHistoryEvent(MessageHistory source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public MessageHistory getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

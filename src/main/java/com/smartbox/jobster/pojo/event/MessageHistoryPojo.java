package com.smartbox.jobster.pojo.event;


import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.event.MessageHistoryEvent;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Jobster team
 * Since: 11/28/2024 8:51 PM
 */
@Getter
@Setter
public class MessageHistoryPojo extends AbstractEventPojo implements Serializable {
    @Serial
    private static final long serialVersionUID = 2335956052733762100L;

    private MessageHistory messageHistory;

    public MessageHistoryPojo(MessageHistory messageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void fireEvent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

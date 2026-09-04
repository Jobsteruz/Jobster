package com.smartbox.jobster.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.UUID;

@Getter
public class QuestionnaireEntityCompletedEvent extends ApplicationEvent {

    private final String entityName;
    private final UUID entityId;

    public QuestionnaireEntityCompletedEvent(Object src,String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

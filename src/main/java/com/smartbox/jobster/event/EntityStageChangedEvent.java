package com.smartbox.jobster.event;

import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.UUID;

@Getter
public class EntityStageChangedEvent extends ApplicationEvent {
    private final JbEntity<UUID> jbEntity;
    private final KanbanStage srcStage;
    private final KanbanStage dstStage;

    public EntityStageChangedEvent(Object source, JbEntity<UUID> entity, KanbanStage srcStage, KanbanStage dstStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

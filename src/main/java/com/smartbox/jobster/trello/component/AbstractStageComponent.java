package com.smartbox.jobster.trello.component;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.component.events.RebuildStageComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Div;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractStageComponent extends Div implements HasStageComponent {

    protected KanbanStage stage;

    protected AbstractStageComponent(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void build();

    public void rebuild() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void addRebuildColumnEventListener(ComponentEventListener<RebuildStageComponentEvent<AbstractStageComponent>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

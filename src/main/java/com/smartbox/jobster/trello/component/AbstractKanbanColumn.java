package com.smartbox.jobster.trello.component;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.Getter;

import java.util.Collection;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 21/08/24 10:22
 */
@Getter
public abstract class AbstractKanbanColumn extends VerticalLayout implements Parseable {


    private final KanbanStage stage;

    public AbstractKanbanColumn(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void build();

    public void rebuild(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void enableLoader();

    public abstract void disableLoader();

    public abstract boolean isEmpty();

    public abstract void addCards(Collection<AbstractKanbanCard> card);

    public abstract void addCards(AbstractKanbanCard [] cards);

    public abstract void removeCardById(UUID cardId);

    public abstract void rebuildCardById(UUID cardId);

    public abstract Collection<UUID> getCardIds();
}

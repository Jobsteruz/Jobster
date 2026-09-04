package com.smartbox.jobster.trello.component.events;

import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.smartbox.jobster.trello.component.card.TrelloCardsContainer;
import com.vaadin.flow.component.ComponentEvent;

public class TrelloContainerUpdatedEvent<T extends AbstractKanbanCard> extends ComponentEvent<TrelloCardsContainer<T>> {

    public TrelloContainerUpdatedEvent(TrelloCardsContainer<T> source, boolean fromClient) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
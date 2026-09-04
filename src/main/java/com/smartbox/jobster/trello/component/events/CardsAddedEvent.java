package com.smartbox.jobster.trello.component.events;

import com.smartbox.jobster.trello.ComponentsInfo;
import com.smartbox.jobster.trello.component.SortableLayout;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.vaadin.flow.component.ComponentEvent;
import lombok.Getter;

@Getter
public class CardsAddedEvent<T extends AbstractKanbanCard> extends ComponentEvent<SortableLayout<T>> {

    private final ComponentsInfo<T> addedComponentsInfo;
    private final ComponentsInfo<T> removedComponentsInfo;

    public CardsAddedEvent(SortableLayout<T> source,
                           boolean fromClient,
                           ComponentsInfo<T> addedComponentsInfo,
                           ComponentsInfo<T> removedComponentsInfo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
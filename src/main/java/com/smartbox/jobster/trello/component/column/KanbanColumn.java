package com.smartbox.jobster.trello.component.column;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.component.AbstractKanbanColumn;
import com.smartbox.jobster.trello.component.SortableLayout;
import com.smartbox.jobster.trello.component.card.AbstractEntityCard;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.smartbox.jobster.trello.component.events.CardsAddedEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 21/08/24 10:22
 */
@Getter
public class KanbanColumn<T extends AbstractEntityCard<?>> extends AbstractKanbanColumn {

    private final SortableLayout<T> body;
    private final KanbanColumnHeader header;
    private final KanbanColumnFooter footer;
    private final KanbanColumnLoader loader = new KanbanColumnLoader();

    {
        loader.setVisible(false);
    }

    public KanbanColumn(KanbanStage stage,
                        SortableLayout<T> body,
                        KanbanColumnHeader header,
                        KanbanColumnFooter footer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    {
        addClassNames("kanban-column", "prevent-text-select");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addCardsAddedListener(ComponentEventListener<CardsAddedEvent<T>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStage getStage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void refreshStageSize() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void enableLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void disableLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public boolean isEmpty() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void addCards(Collection<AbstractKanbanCard> card) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void addCards(AbstractKanbanCard[] cards) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void removeCardById(UUID cardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void rebuildCardById(UUID cardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull Optional<T> getCardById(UUID cardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Collection<UUID> getCardIds() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void selectAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void unselectAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

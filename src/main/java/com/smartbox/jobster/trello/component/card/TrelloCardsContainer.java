package com.smartbox.jobster.trello.component.card;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.component.events.TrelloContainerUpdatedEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Div;
import lombok.Getter;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public class TrelloCardsContainer<T extends AbstractKanbanCard> extends Div {

    private final KanbanStage kanbanStage;
    private final Supplier<Collection<T>> initCardsSupplier;


    public TrelloCardsContainer(KanbanStage kanbanStage, Supplier<Collection<T>> initCardsSupplier) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // lazy build
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getCardsSize() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Stream<T> getCards() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public T removeCardAt(int index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void add(Collection<Component> components) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void addComponentAtIndex(int index, Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addCardsAtFront(Collection<T> items) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void addCardsAtBack(Collection<T> items) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean addUniqueComponentAtIndex(int index, AbstractKanbanCard card) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean addUniqueComponent(AbstractKanbanCard card) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void remove(Collection<Component> components) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void removeAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // todo: optimize update listener with MutationObserver
    public void addCardsUpdatedListener(ComponentEventListener<TrelloContainerUpdatedEvent<T>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.trello.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.ComponentsInfo;
import com.smartbox.jobster.trello.SortableConfig;
import com.smartbox.jobster.trello.SortableStore;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.smartbox.jobster.trello.component.card.TrelloCardsContainer;
import com.smartbox.jobster.trello.component.events.CardsAddedEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.internal.ExecutionContext;
import com.vaadin.flow.shared.ui.LoadMode;
import elemental.json.JsonArray;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Objects;

@Tag("sortable")
@NpmPackage(value = "sortablejs", version = "1.15.3")
@JavaScript(value = "./themes/jobster/js/sortableConnector.js", loadMode = LoadMode.LAZY)
public class SortableLayout<CARD extends AbstractKanbanCard> extends AbstractStageComponent {
    private static final Logger logger = LoggerFactory.getLogger(SortableLayout.class);

    @Getter
    private final TrelloCardsContainer<CARD> cardsContainer;
    private final SortableStore<CARD> groupStore;
    private final SortableConfig sortableConfig;


    public SortableLayout(KanbanStage stage,
                          TrelloCardsContainer<CARD> cardsContainer,
                          SortableStore<CARD> groupStore) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public SortableLayout(KanbanStage stage,
                          TrelloCardsContainer<CARD> cardsContainer,
                          SortableStore<CARD> store,
                          SortableConfig config) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initConnector(Element layout, SortableConfig config) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @ClientCallable
//    @AllowInert
    private void onRemoveListener(JsonArray oldIndexes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
//    @AllowInert
    protected void onAddListener(JsonArray newIndexes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @SuppressWarnings({"rawtypes", "unchecked"})
    public void addCardsAddedListener(ComponentEventListener<CardsAddedEvent<CARD>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

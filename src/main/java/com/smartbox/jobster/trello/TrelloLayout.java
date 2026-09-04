package com.smartbox.jobster.trello;

import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.trello.component.AbstractKanbanColumn;
import com.smartbox.jobster.trello.component.HasBuildComponent;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import lombok.Getter;

import java.util.*;

/**
 * @author Jobster team
 * date: 27/08/24 07:43
 */

public class TrelloLayout<KC extends AbstractKanbanCard> extends HorizontalLayout implements HasBuildComponent {


    private final Collection<? extends AbstractKanbanColumn> columns;
    private Map<KanbanStage, HasComponents> columnWrappersMap;

    @Getter
    private final SortableStore<KC> cardsStore;

    public TrelloLayout(Collection<? extends AbstractKanbanColumn> columns) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void rebuild() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void rebuildColumn(KanbanStage stage, AbstractKanbanColumn column) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public List<AbstractKanbanColumn> getColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

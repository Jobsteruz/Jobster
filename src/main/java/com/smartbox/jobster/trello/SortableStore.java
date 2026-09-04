package com.smartbox.jobster.trello;

import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SortableStore<T extends AbstractKanbanCard> {

    private ComponentsInfo<T> componentsInfo;
}

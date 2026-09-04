package com.smartbox.jobster.trello;

import com.smartbox.jobster.trello.component.AbstractKanbanColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KanbanColumnInfo {

    private AbstractKanbanColumn src;
    private int clmIndex;
}

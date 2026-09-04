package com.smartbox.jobster.trello.component.column;

import com.vaadin.flow.component.html.Div;

class KanbanColumnLoader extends Div {

    {
        this.addClassName("kanban-loader-wrapper");
        Div loader = new Div();
        loader.addClassName("jb-kanban-loader");

        add(loader);
    }
}

package com.smartbox.jobster.view.kanban.template;

import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "kanbanTemplates", layout = MainView.class)
@ViewController("jb_KanbanTemplate.list")
@ViewDescriptor("kanban-template-list-view.xml")
public class KanbanTemplateListView extends AbstractListView<KanbanTemplate> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
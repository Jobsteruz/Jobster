package com.smartbox.jobster.view.kanban.stage.action;

import com.smartbox.jobster.entity.kanban.KanbanStageAction;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "kanbanStageActions", layout = MainView.class)
@ViewController("jb_KanbanStageAction.list")
@ViewDescriptor("kanban-stage-action-list-view.xml")
public class KanbanStageActionListView extends AbstractListView<KanbanStageAction> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageAction;
import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import io.jmix.core.SaveContext;

import java.util.List;

/**
 * @author Jobster team
 * Since: 7/8/2024 2:02 PM
 */
public class CloneKanban extends AbstractCloning implements CloneBuilder {
    KanbanService kanbanService;
    KanbanActionService kanbanActionService;

    public CloneKanban(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private KanbanTemplate cloneTemplate(KanbanTemplate sourceTemplate, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneStages(Kanban sourceKanban, Kanban kanban, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneStageActions(KanbanStage sourceStage, KanbanStage stage, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

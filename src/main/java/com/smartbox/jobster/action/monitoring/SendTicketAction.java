package com.smartbox.jobster.action.monitoring;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.action.schema.ActionOptionDto;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;

import java.util.UUID;

public class SendTicketAction extends AbstractJbKanbanAction {
    @Override
    protected void setMessageBundleGroup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public java.util.List<ActionFieldDto> getInputSchema() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout techniquesLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getCheck() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean needTechnique() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

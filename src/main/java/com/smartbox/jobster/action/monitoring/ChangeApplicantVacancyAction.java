package com.smartbox.jobster.action.monitoring;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.service.VacancyService;
import com.smartbox.jobster.view.vacancy.lookup.VacancyLookupView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.Actions;
import io.jmix.flowui.action.entitypicker.EntityLookupAction;
import io.jmix.flowui.component.valuepicker.EntityPicker;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Author: Clean
 * Since: 12/26/2025
 */
public class ChangeApplicantVacancyAction extends AbstractJbKanbanAction {

    @Override
    protected void setMessageBundleGroup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<ActionFieldDto> getInputSchema() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout vacancyLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Vacancy getVacancy(Map<String, String> params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.action.survey;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.service.survey.SurveyService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.combobox.JmixComboBox;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 27/07/24 17:48
 */
public class SurveyInvite2TgPersonAction extends AbstractJbKanbanAction {
    private static final String SURVEY = "surveyToInvite";

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

    private VerticalLayout getSurveyLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Survey survey() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

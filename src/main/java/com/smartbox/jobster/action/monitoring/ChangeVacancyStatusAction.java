package com.smartbox.jobster.action.monitoring;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.action.schema.ActionOptionDto;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.RequestCancelReason;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.service.RequestService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.View;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 7/27/2024 12:09 PM
 */
public class ChangeVacancyStatusAction extends AbstractJbKanbanAction {
    private final JmixComboBox<RequestCancelReason> cancelReasonComboBox;

    public ChangeVacancyStatusAction() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

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

    private VerticalLayout requestStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout cancelReasonLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private RequestStatus getRequestStatus(Map<String, String> params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private RequestCancelReason getCancelReason(Map<String, String> params) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.component.mobile;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.view.applicant.mobile.ApplicantInfoView;
import com.smartbox.jobster.view.applicant.mobile.ApplicantPendingView;
import com.smartbox.jobster.view.applicant.mobile.ApplicantReviewedView;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.view.View;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ApplicantCard extends VerticalLayout {
    private View<?> origin;
    private Applicant applicant;
    private Kanban kanban;
    private String code;

    private final Messages messages;
    private final TranslateService translateService;
    private final CurrentAuthentication currentAuthentication;
    private final DepartmentService departmentService;
    private final KanbanStageEntityService kanbanStageEntityService;

    public ApplicantCard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ApplicantCard(View<?> origin, @NonNull Applicant applicant, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ApplicantCard(View<?> origin, @NonNull Applicant applicant, Kanban kanban, String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ApplicantCard build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull VerticalLayout getDateAndVacancyCodeLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private @NotNull VerticalLayout getResponsibleLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull VerticalLayout getPositionLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull VerticalLayout getAgeAndGenderLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Span getStatusBox(Kanban kanban, UUID applicantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.monitoring.v2.vacancykanbanfragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.component.B;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.person.ApplicantService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import lombok.Getter;

import java.util.UUID;


public class VacancyCard extends VerticalLayout {

    @Getter
    private final Vacancy vacancy;

    public VacancyCard(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private final Messages messages;
    private final InstanceNameProvider instanceNameProvider;
    private final ApplicantService applicantService;
    private Runnable showMoreSelectionAction;
    private Button showMoreButton;
    private boolean applicantKanbanCountsLoaded;

    {
        setId(UUID.randomUUID().toString());
        setPadding(false);
        addClassName("vacancy-kanban-card-layout");

        messages = AppBeans.get(Messages.class);
        instanceNameProvider = AppBeans.get(InstanceNameProvider.class);
        applicantService = AppBeans.get(ApplicantService.class);
    }

    /**
     * Build card using pre-loaded batch counts (no individual DB queries).
     *
     * @param applicantsCount     active applicant count in the current kanban (from batch query)
     * @param openedWorkPositions currently open work positions (from batch query)
     */
    public void build(Long applicantsCount, Long openedWorkPositions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setShowMoreSelectionAction(Runnable showMoreSelectionAction) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setShowMoreVisible(boolean visible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component makeFooter(Vacancy item, Long applicantsCount, Long openedWorkPositions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component makeApplicantKanbanCounts(Vacancy item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component makeLabel(String labelText, String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.event;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.EventResponse;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;

@ViewController("jb_EventInfoView")
@ViewDescriptor("event-info-view.xml")
@DialogMode(width = "25em", height = "AUTO")
public class EventInfoView extends StandardView {

    private static final DateTimeFormatter DT_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private Messages messages;

    @ViewComponent
    private Avatar candidateAvatar;
    @ViewComponent
    private Span candidateName;
    @ViewComponent
    private Span priorityBadge;
    @ViewComponent
    private Span vacancyValue;
    @ViewComponent
    private Avatar employeeAvatar;
    @ViewComponent
    private Span responsibleValue;
    @ViewComponent
    private Span dateTimeValue;
    @ViewComponent
    private Span eventStatusValue;
    @ViewComponent
    private Span eventDateValue;
    @ViewComponent
    private Image statusIcon;
    @ViewComponent
    private JmixButton viewProfileBtn;
    @ViewComponent
    private HorizontalLayout eventStatusBox;
    @ViewComponent
    private VerticalLayout commentBox;
    @ViewComponent
    private Span commentValue;

    @Setter
    private Event event;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initApplicant() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initPriority() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initEmployee() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDateTime() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setAvatar(Avatar avatar, String name, io.jmix.core.FileRef photo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initComment(KanbanStageHistory history) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initEventStatus(KanbanStageHistory history) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "viewProfileBtn", subject = "clickListener")
    public void onViewProfileBtnClick(final ClickEvent<JmixButton> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

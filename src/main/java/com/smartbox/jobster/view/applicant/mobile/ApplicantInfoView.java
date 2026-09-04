package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.service.DocumentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.interview.InterviewDataService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.questionnaire.AdditionalQuestionnaireService;
import com.smartbox.jobster.view.interview.InterviewView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.fragment.AdditionalQuestionnaireResult;
import com.smartbox.jobster.view.personassistant.PersonAssistantView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.flowui.*;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.model.InstanceLoader;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.apache.commons.io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Route(value = "applicant-info-mobile-view", layout = MainView.class)
@ViewController("jb_ApplicantInfoMobileView")
@ViewDescriptor("applicant-info-view.xml")
public class ApplicantInfoView extends StandardView {
    @Value("${app.url}")
    private String appUrl;

    private Kanban kanban;
    private String code;
    private boolean isOpenedFromApplicantReviewedView;

    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private Messages messages;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private Notifications notifications;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private EntityService entityService;

    @ViewComponent
    private InstanceLoader<Applicant> applicantDl;
    @ViewComponent
    private H4 fullName;
    @ViewComponent
    private InstanceContainer<Applicant> applicantDc;
    @ViewComponent
    private Avatar photo;
    @ViewComponent
    private Span birthDate;
    @ViewComponent
    private Span gender;
    @ViewComponent
    private Span phone;
    @ViewComponent
    private Span address;
    @ViewComponent
    private Span email;
    @ViewComponent
    private Span responsible;
    @ViewComponent
    private Span education;
    @ViewComponent
    private Span experience;
    @ViewComponent
    private Span platform;
    @ViewComponent
    private Span pinfl;
    @ViewComponent
    private VerticalLayout pinflBox;
    @ViewComponent
    private JmixButton accept;
    @ViewComponent
    private JmixButton reject;
    @ViewComponent
    private JmixButton additionalQuestionsButton;
    @ViewComponent
    private H2 applicantFullName;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private VerticalLayout tempQuestionnairesResultBox;
    @ViewComponent
    private H5 additionalQuestionnaireTitle;
    @ViewComponent
    private CollectionLoader<TempQuestionnairePerson> tempQuestionnaireApplicantDl;
    @ViewComponent
    private CollectionContainer<TempQuestionnairePerson> tempQuestionnaireApplicantDc;
    @ViewComponent
    private VerticalLayout resume;
    @Autowired
    private Fragments fragments;
    @Autowired
    private InterviewDataService interviewDataService;
    @Autowired
    private AdditionalQuestionnaireService questionnaireService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Downloader downloader;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "accept", subject = "clickListener")
    public void onAcceptClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "reject", subject = "clickListener")
    public void onRejectClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "history", subject = "clickListener")
    public void onHistoryClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "questions", subject = "clickListener")
    public void onQuestionsClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull DialogWindow<ApplicantChangeStatusView> getApplicantChangeStatusViewDialogWindow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeResumeBox(PersonDocument document) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "additionalQuestionsButton", subject = "clickListener")
    public void onStartInterviewBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "aiChatButton", subject = "clickListener")
    public void onAiChatButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "copyLink", subject = "clickListener")
    public void onCopyLinkClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void loadAdditionalQuestionnaire() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean interviewAlreadyCompleted() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean interviewButtonVisibility(boolean reviewed) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TempQuestionnaire getTempQuestionnaire() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static String shortenFileNameWithExtension(String fileName, int maxLength) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.questionnaire.temp.*;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.applicant.mobile.ApplicantInfoView;
import com.smartbox.jobster.view.monitoring.person.PersonKanbanInfoView;
import com.smartbox.jobster.view.tempquestionanswer.additionalquestionnairedetailresult.AdditionalQuestionnaireDetailResultView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@FragmentDescriptor("AdditionalQuestionnaireResult.xml")
public class AdditionalQuestionnaireResult extends Fragment<VerticalLayout> {
    @ViewComponent
    private Div additionalQuestionnaireDate;
    @ViewComponent
    private Div additionalQuestionnaireName;
    @ViewComponent
    private Div additionalQuestionnaireScore;
    @ViewComponent
    private HorizontalLayout interviewer;
    @ViewComponent
    private Span recommendation;

    private String locale;
    private TempQuestionnairePerson questionnairePerson;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private Messages messages;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;

    @Subscribe("showQuestionnaireResult")
    private void onShowQuestionnaireResultClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setTempQuestionnaire(TempQuestionnairePerson questionnairePerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildRecommendation(TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildInterviewerBox(TempQuestionnairePerson questionnairePerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAdditionalQuestionnaireScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAdditionalQuestionnaireDate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAdditionalQuestionnaireName(TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private int personScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private int totalScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String truncate(String text, int maxLength) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
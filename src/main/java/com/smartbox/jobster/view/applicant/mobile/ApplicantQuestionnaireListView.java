package com.smartbox.jobster.view.applicant.mobile;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.applicant.mobile.applicantquestionanswerfragment.ApplicantQuestionAnswerFragment;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@Route(value = "applicantQuestionnaire", layout = MainView.class)
@ViewController("applicantQuestionnaire.list")
@ViewDescriptor("applicant-questionnaire-list-view.xml")
@DialogMode(width = "64em")
public class ApplicantQuestionnaireListView extends StandardListView<QuestionAnswer> {
    private Applicant applicant;

    @Autowired
    private EntityService entityService;
    @Autowired
    private Fragments fragments;

    @ViewComponent
    private H2 applicantFullName;
    @ViewComponent
    private CollectionLoader<QuestionAnswer> questionAnswersDl;
    @ViewComponent
    private CollectionContainer<QuestionAnswer> questionAnswersDc;
    @ViewComponent
    private VerticalLayout questions;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.survey.surveyquestiongroup;

import com.smartbox.jobster.component.ColorCircleComponent;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.smartbox.jobster.entity.survey.SurveyQuestionGroup;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "surveyQuestionGroups/:id", layout = MainView.class)
@ViewController("jb_SurveyQuestionGroup.detail")
@ViewDescriptor("survey-question-group-detail-view.xml")
@EditedEntityContainer("surveyQuestionGroupDc")
@DialogMode(width = "40%")
public class SurveyQuestionGroupDetailView extends AbstractDetailView<SurveyQuestionGroup> {
    private ColorCircleComponent activeColor;


    @ViewComponent
    private HorizontalLayout colors;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
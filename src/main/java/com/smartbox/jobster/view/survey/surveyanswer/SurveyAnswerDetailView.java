package com.smartbox.jobster.view.survey.surveyanswer;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.view.*;

@Route(value = "surveyAnswers/:id", layout = MainView.class)
@ViewController("jb_SurveyAnswer.detail")
@ViewDescriptor("survey-answer-detail-view.xml")
@EditedEntityContainer("surveyAnswerDc")
@DialogMode(width = "40%")
public class SurveyAnswerDetailView extends AbstractDetailView<SurveyAnswer> {
    @ViewComponent
    private JmixCheckbox manualField;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
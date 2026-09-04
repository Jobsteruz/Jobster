package com.smartbox.jobster.view.survey.surveyquestioncondition;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyQuestionCondition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;

@Route(value = "surveyQuestionConditions/:id", layout = MainView.class)
@ViewController("jb_SurveyQuestionCondition.detail")
@ViewDescriptor("survey-question-condition-detail-view.xml")
@EditedEntityContainer("surveyQuestionConditionDc")
public class SurveyQuestionConditionDetailView extends AbstractDetailView<SurveyQuestionCondition> {
    @ViewComponent
    private JmixComboBox<SurveyAnswer> answerComboBox;
    @ViewComponent
    private CollectionLoader<SurveyQuestion> surveyQuestionsDl;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("questionComboBox")
    public void onQuestionComboBoxComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<SurveyQuestion>, SurveyQuestion> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
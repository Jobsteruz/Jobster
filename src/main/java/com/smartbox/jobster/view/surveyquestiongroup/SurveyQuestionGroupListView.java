package com.smartbox.jobster.view.surveyquestiongroup;

import com.smartbox.jobster.entity.survey.SurveyQuestionGroup;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "surveyQuestionGroups", layout = MainView.class)
@ViewController("jb_SurveyQuestionGroup.list")
@ViewDescriptor("survey-question-group-list-view.xml")
@LookupComponent("surveyQuestionGroupsDataGrid")
@DialogMode(width = "64em")
public class SurveyQuestionGroupListView extends AbstractListView<SurveyQuestionGroup> {


    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
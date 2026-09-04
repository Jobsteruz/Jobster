package com.smartbox.jobster.view.survey.surveyquestion;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyQuestionGroup;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.sortablelayout.SortableConfig;
import com.smartbox.jobster.sortablelayout.SortableLayout;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.survey.SurveyListView;
import com.smartbox.jobster.view.survey.surveyquestioncard.SurveyQuestionCardFragment;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.SaveContext;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Route(value = "surveyQuestions", layout = MainView.class)
@ViewController("jb_SurveyQuestion.list")
@ViewDescriptor("survey-question-list-view.xml")
@DialogMode(width = "64em")
public class SurveyQuestionListView extends AbstractNavigationListView<SurveyQuestion> {
    private String query;
    private Survey survey;
    private final List<VerticalLayout> cardViewList = new ArrayList<>();

    @Autowired
    private EntityService entityService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private Fragments fragments;

    @ViewComponent
    private CollectionLoader<SurveyQuestion> surveyQuestionsDl;
    @ViewComponent
    private H3 surveyName;
    @ViewComponent
    private CollectionContainer<SurveyQuestion> surveyQuestionsDc;
    @ViewComponent
    private VerticalLayout questions;
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addQuestion", subject = "clickListener")
    public void onAddQuestionClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeClose(final BeforeCloseEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SurveyQuestionCardFragment buildQuestionCard(SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<SurveyQuestionGroup, List<SurveyQuestion>> getGroupMap() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<SurveyQuestion> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
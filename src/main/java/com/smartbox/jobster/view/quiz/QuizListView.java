package com.smartbox.jobster.view.quiz;

import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizQuestion;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.QuizService;
import com.smartbox.jobster.service.questionnaire.QuestionFormService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.quiz.question.QuizQuestionListView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "quizzes", layout = MainView.class)
@ViewController("jb_Quiz.list")
@ViewDescriptor("quiz-list-view.xml")
public class QuizListView extends AbstractNavigationListView<Quiz> {
    private String query;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;
    @Autowired
    private QuizService quizService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private QuestionFormService questionFormService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private EntityService entityService;

    @ViewComponent
    private Div quizLayout;
    @ViewComponent
    private CollectionLoader<Quiz> quizDl;

    @Override
    public CollectionLoader<Quiz> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div buildQuizzesCards(Quiz item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "createBtn", subject = "clickListener")
    public void onCreateBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
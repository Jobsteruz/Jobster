package com.smartbox.jobster.view.quiz;

import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.icon.IconView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Stream;

@Route(value = "quizzes/:id", layout = MainView.class)
@ViewController("jb_Quiz.detail")
@ViewDescriptor("quiz-detail-view.xml")
@EditedEntityContainer("quizDc")
@DialogMode(width = "600px", height = "AUTO")
public class QuizDetailView extends AbstractDetailView<Quiz> {
    @ViewComponent
    private Div colorsBox;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DialogWindows dialogWindows;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconMoreBtn", subject = "clickListener")
    public void onIconMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconClearBtn", subject = "clickListener")
    public void onIconClearBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
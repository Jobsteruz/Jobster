package com.smartbox.jobster.view.quiz.answer;

import com.smartbox.jobster.entity.quiz.QuizAnswer;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

import java.util.List;

@Route(value = "quizAnswers/:id", layout = MainView.class)
@ViewController("jb_QuizAnswer.detail")
@ViewDescriptor("quiz-answer-detail-view.xml")
@EditedEntityContainer("quizAnswerDc")
public class QuizAnswerDetailView extends AbstractDetailView<QuizAnswer> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<QuizAnswer> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
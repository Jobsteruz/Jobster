package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.service.QuizService;
import com.smartbox.jobster.view.quiz.answer.QuizPersonAnswerResultModal;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.Optional;

@FragmentDescriptor("quiz-result-fragment.xml")
public class QuizResultFragment extends Fragment<VerticalLayout> {
    @Getter
    private QuizPerson quizPerson;

    @ViewComponent
    private VerticalLayout quizResultLayout;
    @ViewComponent
    private Span quizName;
    @ViewComponent
    private Span startDate;
    @ViewComponent
    private Span endDate;
    @ViewComponent
    private Span score;
    @ViewComponent
    private Div quizFooter;
    @ViewComponent
    private Span answeredCount;
    @ViewComponent
    private Span durationInfo;
    @ViewComponent
    private Div expiredBox;
    @ViewComponent
    private Span expiredText;
    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private QuizService quizService;
    @Autowired
    private DialogWindows dialogWindows;


    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "detailsBtn", subject = "clickListener")
    public void onDetailsBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openAnswers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setQuizPerson(QuizPerson quizPerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Everything the recruiter needs when the attempt was cut short: how far the candidate got and
     * why it stopped. Candidates who ran out of time used to show nothing at all here, so a blank
     * card was indistinguishable from a test that was never sent.
     */
    private void buildFooter(QuizPerson quizPerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatDate(OffsetDateTime dt) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

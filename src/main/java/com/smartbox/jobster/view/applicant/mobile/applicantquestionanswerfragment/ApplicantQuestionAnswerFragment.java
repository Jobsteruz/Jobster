package com.smartbox.jobster.view.applicant.mobile.applicantquestionanswerfragment;

import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("applicant-question-answer-fragment.xml")
public class ApplicantQuestionAnswerFragment extends Fragment<VerticalLayout> {
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private Span question;
    @ViewComponent
    private Span answer;

    public void onBeforeShow(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
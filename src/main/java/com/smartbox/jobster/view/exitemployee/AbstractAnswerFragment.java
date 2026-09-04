package com.smartbox.jobster.view.exitemployee;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractAnswerFragment extends Fragment<VerticalLayout> {
    @Setter
    protected SurveyQuestion question;
    @Getter
    protected Map<SurveyAnswer, List<AbstractAnswerFragment>> conditions = new HashMap<>();
    @Getter
    @Setter
    private int visibleCount;

    @ViewComponent
    protected Span questionSpan;
    @ViewComponent
    protected VerticalLayout surveyQuestion;
    @ViewComponent
    protected Div fileLayout;


    public void beforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;
import com.smartbox.jobster.service.survey.SurveyUserAnswerService;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@FragmentDescriptor("person-survey-fragment.xml")
public class PersonSurveyFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private JmixButton btn;
    private boolean open = false;
    private boolean loaded = false;
    private SurveyUser user;
    @ViewComponent
    private Span surveyTitle;
    @ViewComponent
    private VerticalLayout surveyGrid;

    @Autowired
    private SurveyUserAnswerService surveyUserAnswerService;

    public void build(SurveyUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void handleBtnClick() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadUserAnswers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout surveyDataGridAnswerRenderer(List<SurveyUserAnswer> userAnswers) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
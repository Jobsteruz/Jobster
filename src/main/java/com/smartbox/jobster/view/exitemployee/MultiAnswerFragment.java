package com.smartbox.jobster.view.exitemployee;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@FragmentDescriptor("multi-answer-fragment.xml")
public class MultiAnswerFragment extends AbstractAnswerFragment {
    @Getter
    private final Map<SurveyAnswer, String> selectedAnswers = new HashMap<>();
    @Setter
    private List<SurveyUserAnswer> answerList;
    @Setter
    private List<SurveyAnswer> answers;

    @Autowired
    private Messages messages;

    @ViewComponent
    private CollectionContainer<SurveyAnswer> surveyAnswers;
    @ViewComponent
    private JmixCheckboxGroup<SurveyAnswer> checkBox;
    @ViewComponent
    private VerticalLayout manualAnswers;


    @Override
    public void beforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("checkBox")
    public void onCheckBoxComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckboxGroup<SurveyAnswer>, Set<SurveyAnswer>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
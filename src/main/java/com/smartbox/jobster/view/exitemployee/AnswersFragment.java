package com.smartbox.jobster.view.exitemployee;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;
import com.vaadin.flow.component.AbstractField;
import io.jmix.core.EntityStates;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@FragmentDescriptor("answers-fragment.xml")
public class AnswersFragment extends AbstractAnswerFragment implements Cloneable {
    @Setter
    private SurveyUserAnswer answer;
    @Setter
    private List<SurveyAnswer> answers;

    @ViewComponent
    private InstanceContainer<SurveyUserAnswer> surveyUserAnswer;
    @ViewComponent
    private CollectionContainer<SurveyAnswer> surveyAnswers;
    @ViewComponent
    private JmixTextArea manualArea;
    @ViewComponent
    private JmixRadioButtonGroup<SurveyAnswer> radioGroup;

    @Autowired
    private EntityStates entityStates;


    @Override
    public void beforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("radioGroup")
    public void onRadioGroupComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<SurveyAnswer>, SurveyAnswer> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
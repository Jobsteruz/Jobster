package com.smartbox.jobster.view.survey.surveycard;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.view.survey.sendsurvey.SendSurveyView;
import com.smartbox.jobster.view.survey.surveyquestion.SurveyQuestionListView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.core.DataManager;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.*;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("survey-card-fragment.xml")
public class SurveyCardFragment extends Fragment<VerticalLayout> {
    @Setter
    private boolean cardActive;
    @Setter
    @Getter
    private Survey survey;
    @Setter
    private ComponentWrapper<SurveyCardFragment> activeCardWrapper;

    @ViewComponent
    private Span name;
    @ViewComponent
    private JmixCheckbox active;
    @ViewComponent
    private Span description;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private DialogWindows dialogWindows;


    public void onBeforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("active")
    public void onActiveComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckbox, Boolean> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "surveyCard", subject = "clickListener")
    public void onSurveyCardClick(final ClickEvent<VerticalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "surveyCard", subject = "doubleClickListener")
    public void onSurveyCardDoubleClick(final ClickEvent<VerticalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "sendSurvey", subject = "clickListener")
    public void onSendSurveyClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
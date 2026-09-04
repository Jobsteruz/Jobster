package com.smartbox.jobster.view.survey.surveyquestioncard;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.SurveyConditionComponent;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyQuestionGroup;
import com.smartbox.jobster.view.survey.surveyquestion.SurveyQuestionDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("survey-question-card-fragment.xml")
public class SurveyQuestionCardFragment extends Fragment<VerticalLayout> {
    @Setter
    @Getter
    private SurveyQuestion surveyQuestion;

    @Autowired
    private Messages messages;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Notifications notifications;

    @ViewComponent
    private HorizontalLayout paperclip;
    @ViewComponent
    private HorizontalLayout fileTree;
    @ViewComponent
    private HorizontalLayout tasks;
    @ViewComponent
    private HorizontalLayout comments;
    @ViewComponent
    private H5 question;
    @ViewComponent
    private JmixAccordion answersAccordion;
    @ViewComponent
    private HorizontalLayout defaultQuestion;
    @ViewComponent
    private VerticalLayout answers;
    @ViewComponent
    private VerticalLayout conditions;
    @ViewComponent
    private AccordionPanel accordion;


    public void onBeforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "edit", subject = "clickListener")
    public void onEditClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "delete", subject = "clickListener")
    public void onDeleteClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
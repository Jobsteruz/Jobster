package com.smartbox.jobster.view.survey.surveyquestioncondition.surveyconditioncard;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyQuestionCondition;
import com.smartbox.jobster.entity.survey.SurveyQuestionGroup;
import com.smartbox.jobster.view.survey.surveyquestioncondition.SurveyQuestionConditionDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.rest.impl.openapi.OpenAPIGenerator;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("survey-condition-card-fragment.xml")
public class SurveyConditionCardFragment extends Fragment<VerticalLayout> {
    @Setter
    private SurveyQuestionCondition surveyCondition;
    @Setter
    private DataContext dataContext;

    @ViewComponent
    private Span question;
    @ViewComponent
    private VerticalLayout surveyConditionCard;
    @ViewComponent
    private Span answer;

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;


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
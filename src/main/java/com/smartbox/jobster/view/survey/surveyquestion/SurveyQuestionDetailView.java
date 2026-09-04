package com.smartbox.jobster.view.survey.surveyquestion;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.survey.*;
import com.smartbox.jobster.sortablelayout.SortableConfig;
import com.smartbox.jobster.sortablelayout.SortableLayout;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.survey.surveyanswer.SurveyAnswerDetailView;
import com.smartbox.jobster.view.survey.surveyanswer.surveyanswercard.SurveyAnswerCardFragment;
import com.smartbox.jobster.view.survey.surveyquestioncondition.SurveyQuestionConditionDetailView;
import com.smartbox.jobster.view.survey.surveyquestioncondition.surveyconditioncard.SurveyConditionCardFragment;
import com.smartbox.jobster.view.survey.surveyquestiongroup.SurveyQuestionGroupDetailView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.flowui.*;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "surveyQuestions/:id", layout = MainView.class)
@ViewController("jb_SurveyQuestion.detail")
@ViewDescriptor("survey-question-detail-view.xml")
@EditedEntityContainer("surveyQuestionDc")
public class SurveyQuestionDetailView extends AbstractDetailView<SurveyQuestion> {
    private Survey survey;
    private VerticalLayout answers;
    private boolean groupManualChange = true;
    private final SaveContext saveContext = new SaveContext();

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Fragments fragments;
    @Autowired
    private Notifications notifications;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Messages messages;

    @ViewComponent
    private H3 surveyName;
    @ViewComponent
    private JmixCheckbox multiAnswerCheckBox;
    @ViewComponent
    private CollectionLoader<SurveyQuestionGroup> surveyQuestionGroupDl;
    @ViewComponent
    private CollectionPropertyContainer<SurveyAnswer> surveyAnswerDc;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionPropertyContainer<SurveyQuestionCondition> surveyConditionsDc;
    @ViewComponent
    private VerticalLayout conditions;
    @ViewComponent
    private EntityComboBox<SurveyQuestionGroup> groupComboBox;
    @ViewComponent
    private JmixSelect<Object> fileType;
    @ViewComponent
    private Div answersLayout;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addGroup", subject = "clickListener")
    public void onAddGroupClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addAnswers", subject = "clickListener")
    public void onAddAnswersClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addConditions", subject = "clickListener")
    public void onAddConditionsClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("groupComboBox")
    public void onGroupComboBoxComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<SurveyQuestionGroup>,
            SurveyQuestionGroup> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("file")
    public void onFileComponentValueChange(final AbstractField.ComponentValueChangeEvent<FileStorageUploadField, FileRef> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setSurvey(Survey survey) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAnswerCards() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildConditionsCards() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addSurveyConditionCard(SurveyQuestionCondition surveyCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addSurveyAnswerCard(SurveyAnswer surveyAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
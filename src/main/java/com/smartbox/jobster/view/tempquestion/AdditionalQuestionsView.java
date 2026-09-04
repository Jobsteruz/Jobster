package com.smartbox.jobster.view.tempquestion;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestion;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

@Route("temp-questions-view")
@ViewController("jb_TempQuestionsView")
@ViewDescriptor("additional-questions-view.xml")
@DialogMode(width = "64em", height = "AUTO")
public class AdditionalQuestionsView extends StandardView {
    @Autowired
    private DataManager dataManager;
    @ViewComponent
    protected MessageBundle messageBundle;
    @ViewComponent
    private CollectionLoader<TempQuestion> tempQuestionDl;
    @ViewComponent
    private CollectionLoader<TempQuestionAnswer> tempQuestionAnswerDl;
    @ViewComponent
    private CollectionContainer<TempQuestion> tempQuestionDc;
    @ViewComponent
    private CollectionContainer<TempQuestionAnswer> tempQuestionAnswerDc;
    @ViewComponent
    private DataGrid<TempQuestion> questionsTable;
    @ViewComponent
    private JmixButton saveBtn;

    private final Map<UUID, TempQuestionAnswer> answerMap = new HashMap<>();
    private String entityName;
    private UUID entityId;

    public void setPerson(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "questionnaireSelect", subject = "itemLabelGenerator")
    private Object questionnaireSelectItemLabelGenerator(final TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("questionnaireSelect")
    public void onQuestionnaireSelectComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<TempQuestionnaire>, TempQuestionnaire> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void loadQuestions(TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void reloadAnswers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component createAnswerComponent(TempQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveBtnClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeBtn", subject = "clickListener")
    public void onCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

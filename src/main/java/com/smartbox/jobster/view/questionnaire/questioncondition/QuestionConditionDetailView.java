package com.smartbox.jobster.view.questionnaire.questioncondition;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.QuestionCondition;
import com.smartbox.jobster.service.questionnaire.QuestionFormService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetadataObject;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

@Route(value = "questionConditions/:id", layout = MainView.class)
@ViewController("jb_QuestionCondition.detail")
@ViewDescriptor("question-condition-detail-view.xml")
@EditedEntityContainer("questionConditionDc")
public class QuestionConditionDetailView extends AbstractDetailView<QuestionCondition> {
    private CollectionContainer<Question> questionsDc;

    @Autowired
    private Metadata metadata;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private QuestionFormService questionFormService;

    @ViewComponent
    private VerticalLayout selectConditions;
    @ViewComponent
    private CollectionLoader<Question> conditionDl;
    @ViewComponent
    private EntityComboBox<Question> conditionQuestionField;
    @ViewComponent
    private CollectionContainer<Question> conditionDc;
    @ViewComponent
    private JmixSelect<String> propertyField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionQuestionField")
    public void onConditionQuestionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Question>, Question> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("propertyField")
    public void onPropertyFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "skippedField", subject = "clickListener")
    public void onSkippedFieldClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Div getValueComponent(Question question, QuestionCondition condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setContainer(CollectionContainer<Question> container) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.robot.robotcondition;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.QuestionWebType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.questionnaire.QuestionFormService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.MetadataObject;
import io.jmix.core.metamodel.model.Range;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.datetimepicker.TypedDateTimePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Route(value = "robotConditions/:id", layout = MainView.class)
@ViewController("jb_RobotCondition.detail")
@ViewDescriptor("robot-condition-detail-view.xml")
@EditedEntityContainer("robotConditionDc")
@DialogMode(maxWidth = "30%", width = "30%")
public class RobotConditionDetailView extends AbstractDetailView<RobotCondition> {
    private static final Logger log = LoggerFactory.getLogger(RobotConditionDetailView.class);

    @Setter
    private boolean isFieldCondition;
    private Component component;
    private MetaClass metaClass;
    private MetaClass fieldClass;

    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private Metadata metadata;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private EntityService entityService;
    @Autowired
    private QuestionFormService questionFormService;

    @ViewComponent
    private VerticalLayout addConditionCard;
    @ViewComponent
    private Span type;
    @ViewComponent
    private Span header;
    @ViewComponent
    private TypedTextField<String> valueField;
    @ViewComponent
    private TypedDateTimePicker<OffsetDateTime> valueDateTimeField;
    @ViewComponent
    private FileStorageUploadField valueUploadField;
    @ViewComponent
    private JmixCheckbox valueBoolField;
    @ViewComponent
    private JmixSelect<Enum<?>> valueSelectField;
    @ViewComponent
    private JmixComboBox<JbEntity<UUID>> valueComboBoxField;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private JmixComboBox<String> selectFieldField;
    @ViewComponent
    private EntityComboBox<Question> selectQuestionField;
    @ViewComponent
    private JmixSelect<ConditionType> conditionTypeField;
    @ViewComponent
    private JmixIntegerField valueIntegerField;
    @ViewComponent
    private JmixComboBox<String> selectEntityField;
    @ViewComponent
    private CollectionLoader<Question> questionDl;
    @ViewComponent
    private CollectionContainer<Questionnaire> questionnaireDc;
    @ViewComponent
    private EntityComboBox<Questionnaire> questionnaireField;


    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("questionnaireField")
    public void onQuestionnaireFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Questionnaire>, Questionnaire> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionTypeField")
    public void onConditionTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ConditionType>, ConditionType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("selectFieldField")
    public void onSelectFieldFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>,
            String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("selectEntityField")
    public void onSelectEntityFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("selectQuestionField")
    public void onSelectQuestionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Question>,
            Question> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "selectFieldField", subject = "itemLabelGenerator")
    private String selectFieldFieldItemLabelGenerator(final String field) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void getUpValues() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpValues() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    private void selectFieldChange(Range range, boolean fromClient) throws ParseException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void rangeIsClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void visibleEntityFieldComponent(MetaClass metaClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean changeComponent(Class<?> javaClass, Class<?> clazz, Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull List<String> metaPropertyToString(MetaClass metaClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setVisible(Component component) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void checkConditionType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupQuestionnaireField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setStyles() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
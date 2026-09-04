package com.smartbox.jobster.view.robot.robot.condition_details;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.QuestionWebType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.robot.ConditionType;
import com.smartbox.jobster.entity.robot.RobotCondition;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.robot.fragments.FieldValueFragment;
import com.smartbox.jobster.view.robot.fragments.QuestionValueFragment;
import com.smartbox.jobster.view.robot.fragments.RobotConditionValue;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Messages;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Route(value = "robot-conditions-question/:id", layout = MainView.class)
@ViewController(id = "jb_RobotConditionQuestion.detail")
@ViewDescriptor(path = "robot-condition-question-detail-view.xml")
@EditedEntityContainer("robotConditionDc")
@DialogMode(width = "35%", maxWidth = "35%")
public class RobotConditionQuestionDetailView extends AbstractRobotConditionDetailView {
    @Autowired
    private Metadata metadata;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private ViewValidation viewValidation;
    @Autowired
    private Messages messages;

    @ViewComponent
    private CollectionLoader<Question> questionDl;
    @ViewComponent
    private EntityComboBox<Questionnaire> questionnaireField;
    @ViewComponent
    private EntityComboBox<Question> selectQuestionField;
    @ViewComponent
    private JmixComboBox<MetaProperty> entityFieldField;
    @ViewComponent
    private QuestionValueFragment questionValueField;
    @ViewComponent
    private FieldValueFragment fieldValueField;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("questionnaireField")
    public void onQuestionnaireFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Questionnaire>, Questionnaire> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("selectQuestionField")
    public void onSelectQuestionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Question>, Question> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityFieldField")
    public void onEntityFieldFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<MetaProperty>, MetaProperty> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityFieldField", subject = "itemLabelGenerator")
    private String entityFieldFieldItemLabelGenerator(final MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "conditionTypeField", subject = "itemEnabledProvider")
    private boolean conditionTypeFieldItemEnabledProvider(final ConditionType conditionType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpEntityField(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
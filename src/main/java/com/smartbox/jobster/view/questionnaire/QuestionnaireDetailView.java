package com.smartbox.jobster.view.questionnaire;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.questionnaire.QuestionDefault;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireLimitType;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.icon.IconView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.shared.Tooltip;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.core.metamodel.datatype.EnumClass;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.Range;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.ComponentGenerationContext;
import io.jmix.flowui.component.UiComponentsGenerator;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Route(value = "questionnaire/:id", layout = MainView.class)
@ViewController("jb_Questionnaire.detail")
@ViewDescriptor("questionnaire-detail-view.xml")
@EditedEntityContainer("questionnaireDc")
@DialogMode(width = "567px")
public class QuestionnaireDetailView extends AbstractDetailView<Questionnaire> {
    private static final Logger log = LoggerFactory.getLogger(QuestionnaireDetailView.class);
    private List<QuestionDefault> questionDefaults;

    @Autowired
    private EntityService entityService;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private Metadata metadata;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private Notifications notifications;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private QuestionService questionService;

    @ViewComponent
    private Div colorsBox;
    @ViewComponent
    private Div fieldBox;
    @ViewComponent
    private JmixComboBox<String> entityField;
    @ViewComponent
    private JmixComboBox<QuestionnaireLimitType> limitTypeField;
    @ViewComponent
    private JmixIntegerField limitField;
    @Autowired
    private UiComponentsGenerator uiComponentsGenerator;
    @ViewComponent
    private EntityComboBox<DepartmentCategory> departmentCategoryField;

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

    private void initDepartmentCategoryField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupLimitTooltip() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("limitField")
    public void onLimitFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixIntegerField, Integer> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateLimitTypeRequired(Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addField", subject = "clickListener")
    public void onAddFieldClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addFieldBox(QuestionDefault questionDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildValueField(HorizontalLayout fieldContent, QuestionDefault questionDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addValueField(HorizontalLayout fieldContent, Component valueField) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDeleteBtn(HorizontalLayout fieldContent, QuestionDefault questionDefault) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityField", subject = "itemLabelGenerator")
    private Object entityFieldItemLabelGenerator(final String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconMoreBtn", subject = "clickListener")
    public void onIconMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconClearBtn", subject = "clickListener")
    public void onIconClearBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveDepartmentCategoryToJson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveQuestionDefaults() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
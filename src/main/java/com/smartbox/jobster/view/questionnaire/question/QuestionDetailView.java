package com.smartbox.jobster.view.questionnaire.question;

import com.flowingcode.vaadin.addons.twincolgrid.TwinColGrid;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.Branch;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.questionnaire.*;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.SequenceService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.questionnaire.questioncondition.QuestionConditionDetailView;
import com.smartbox.jobster.view.questionnaire.questionname.QuestionNameDetailView;
import com.smartbox.jobster.view.questionnaire.questionoption.QuestionOptionDetailView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.multiselectcomboboxpicker.JmixMultiSelectComboBoxPicker;
import io.jmix.flowui.component.richtexteditor.RichTextEditor;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.upload.event.FileUploadSucceededEvent;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Route(value = "question", layout = MainView.class)
@ViewController("jb_Question.detail")
@ViewDescriptor("question-detail-view.xml")
@EditedEntityContainer("questionDc")
@DialogMode(width = "40em", height = "AUTO")
public class QuestionDetailView extends AbstractDetailView<Question> {

    private CollectionContainer<Question> questionsDc;
    private List<QuestionCondition> removingConditions = new LinkedList<>();
    private List<QuestionOption> removingOptions = new LinkedList<>();
    private List<QuestionName> removingNames = new LinkedList<>();
    @Setter
    private SaveContext saveContext;

    @ViewComponent
    private H4 entityTitle;
    @ViewComponent
    private JmixComboBox<MetaProperty> entityField;
    @ViewComponent
    private JmixComboBox<String> entityNameField;
    @ViewComponent
    private JmixSelect<QuestionBotType> botTypeField;
    @ViewComponent
    private CollectionPropertyContainer<QuestionOption> optionDc;
    @ViewComponent
    private HorizontalLayout optionBox;
    @ViewComponent
    private Div options;
    @ViewComponent
    private VerticalLayout questionOrConditionBox;
    @ViewComponent
    private CollectionPropertyContainer<QuestionCondition> conditionDc;
    @ViewComponent
    private JmixCheckbox autoSelectIfSingleField;
    @ViewComponent
    private JmixCheckbox requestBtnField;
    @ViewComponent
    private JmixSelect<Object> requestBtnTypeField;
    @ViewComponent
    private JmixCheckbox onlyRequestBtnField;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private JmixButton addOptionBtn;
    @ViewComponent
    private HorizontalLayout entityNameBox;
    @ViewComponent
    private Paragraph selectedProperty;
    @ViewComponent
    private JmixCheckbox webAppField;
    @ViewComponent
    private JmixSelect<VisibilityType> visibilityTypeField;
    @ViewComponent
    private JmixButton addSkippedEntityBtn;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private JmixSelect<Object> documentTypeField;
    @ViewComponent
    private CollectionPropertyContainer<QuestionName> nameDc;
    @ViewComponent
    private VerticalLayout nameBox;

    @Autowired
    private SequenceService sequenceService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private Metadata metadata;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Notifications notifications;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @ViewComponent
    private JmixMultiSelectComboBoxPicker<FileType> fileTypesPicker;
    @ViewComponent
    private VerticalLayout questionAndConditionBox;
    @ViewComponent
    private JmixCheckbox faceDetection;
    @ViewComponent
    private JmixCheckbox photoDetectionInWebField;
    @ViewComponent
    private JmixCheckbox cvParserField;
    @ViewComponent
    private JmixImage<Object> photoField;
    @ViewComponent
    private TypedTextField<String> machineNameField;
    @ViewComponent
    private JmixSelect<DepartmentType> departmentTypeField;
    @ViewComponent
    private VerticalLayout departmentBox;
    private TreeComboBox<Department> departmentField;
    @Autowired
    private QuestionService questionService;

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setQuestionsContainer(CollectionContainer<Question> questionsContainer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentTypeFromJson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("uploadPhoto")
    public void onUploadPhotoFileUploadSucceeded(final FileUploadSucceededEvent<FileStorageUploadField> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "deletePhoto", subject = "clickListener")
    public void onDeletePhotoClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "nameBtn", subject = "clickListener")
    public void onNameBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout buildNameBox(QuestionName name, int index) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initBotTypeItems() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityField", subject = "itemLabelGenerator")
    private Object entityFieldItemLabelGenerator(final MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityNameField")
    public void onEntityNameFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addSkippedEntityBtn", subject = "clickListener")
    public void onAddSkippedEntityBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityNameField", subject = "itemLabelGenerator")
    private Object entityNameFieldItemLabelGenerator(final String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("botTypeField")
    public void onBotTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Yagona variant avtomatik tanlanadigan savol turlari: variantlar ro'yxatidan tanlanadiganlari.
     */
    private boolean supportsAutoSelect(QuestionBotType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("requestBtnField")
    public void onRequestBtnFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckbox, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveDepartmentSettingsToJson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addOptionBtn", subject = "clickListener")
    public void onAddOptionBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void makeOptionsComponent(Collection<QuestionOption> items) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildOptionCard(QuestionOption option) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addOrCondition", subject = "clickListener")
    public void onAddConditionClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addAndCondition", subject = "clickListener")
    public void onAddAndConditionClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("fileTypesPicker")
    public void onFileTypesPickerComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBoxPicker<FileType>, Collection<FileType>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fileTypesPicker")
    public void onFileTypesPickerAttach(final AttachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private Div buildConditionBox(QuestionCondition condition, Boolean isOr) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String parseConditionValue(QuestionCondition condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveMultipleCondition(String[] conditionValues, QuestionCondition savedCondition, Boolean isOr) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
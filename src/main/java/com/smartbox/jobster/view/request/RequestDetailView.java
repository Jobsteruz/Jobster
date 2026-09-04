package com.smartbox.jobster.view.request;

import com.google.common.base.Strings;
import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.component.translation.TranslateRichTextEditor;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Currency;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import com.smartbox.jobster.security.specific.UIRequestRecruiterRole;
import com.smartbox.jobster.security.specific.UiSettingFieldEnabled;
import com.smartbox.jobster.security.specific.UiVacancyActionDisabled;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.VacancyService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.questionnaire.QuestionAnswerService;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.smartbox.jobster.view.abstractview.AbstractQuestionnaireEntityDetailView;
import com.smartbox.jobster.view.action.mass.vacancy.RequestRejectActionView;
import com.smartbox.jobster.view.main.MainView;
import io.jmix.multitenancy.core.TenantProvider;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasValue;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;

@Route(value = "requests/:id", layout = MainView.class)
@ViewController("jb_Request.detail")
@ViewDescriptor("request-detail-view.xml")
@EditedEntityContainer("vacancyDc")
public class RequestDetailView extends AbstractQuestionnaireEntityDetailView<Vacancy> implements AbstractCustomDetailView {
    private TreeComboBox<Department> departmentTreeComboBox;
    private List<VacancyLanguage> vacancyLanguages;
    private List<Language> languages;

    /**
     * The whole {@code jb_Language} table, loaded on first use rather than on open.
     * <p>
     * It used to be loaded in {@code onReady} for every request, but only ~1% of vacancies carry a
     * language row, so 99% of opens paid for a full-table load whose result was never shown. Some
     * tenants have five-figure language tables, which made that a five-figure entity
     * materialisation on the UI thread.
     */
    private List<Language> languages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ViewComponent
    private VerticalLayout positionContainer;
    @ViewComponent
    private VerticalLayout otherLanguages;
    @ViewComponent
    private NativeLabel vacancyCode;
    @ViewComponent
    private TranslateRichTextEditor responsibilityField;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionContainer<Position> positionDc;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private JmixButton rejectBtn;
    @ViewComponent
    private JmixButton approveBtn;
    @ViewComponent
    private JmixButton vacancyBtn;
    @ViewComponent
    private JmixButton questionnaireBtn;

    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private EntityService entityService;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private UserService userService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private RequestService requestService;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private QuestionAnswerService questionAnswerService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @ViewComponent
    private EntityComboBox<User> responsibleField;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @ViewComponent
    private DropdownButton menuBar;
    @ViewComponent
    private EntityComboBox<RequestType> requestTypeField;
    @ViewComponent
    private EntityComboBox<PersonGroup> personGroupField;
    @ViewComponent
    private EntityComboBox<WorkSchedule> scheduleField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMinField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMaxField;
    @ViewComponent
    private JmixComboBox<Currency> currencyField;
    @ViewComponent
    private EntityComboBox<User> authorField;
    @ViewComponent
    private EntityComboBox<User> verifierField;
    @ViewComponent
    private EntityComboBox<User> confirmerField;
    @ViewComponent
    private JmixIntegerField workplaceQtyField;
    @ViewComponent
    private TypedDatePicker<OffsetDateTime> requiredDateField;
    @ViewComponent
    private JmixComboBox<RequestStatus> requestStatusField;
    @ViewComponent
    private JmixSelect<Priority> priority;
    @ViewComponent
    private EntityComboBox<Experience> experienceField;
    @ViewComponent
    private EntityComboBox<Education> educationField;
    @ViewComponent
    private JmixSelect<Gender> genderField;
    @ViewComponent
    private JmixTextArea memo;
    @ViewComponent
    private JmixButton addLanguage;

    private Employee employee;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "questionnaireBtn", subject = "clickListener")
    public void onQuestionnaireBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addLanguage", subject = "clickListener")
    public void onAddLanguageClick(final ClickEvent<JmixButton> event) {
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

    private void saveVacancyLanguages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addLanguageBox(VacancyLanguage vacancyLanguage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "approveBtn", subject = "clickListener")
    public void onApproveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "rejectBtn", subject = "clickListener")
    public void onRejectBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "vacancyBtn", subject = "clickListener")
    public void onVacancyBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateStatusActions(RequestStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updatePositionItems(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void roleProcess(RequestStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void lockAllFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void unlockFieldsByStatus(RequestStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getViewId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<Component, String> getCustomComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.vacancy;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.component.translation.TranslateRichTextEditor;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Currency;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.integration.hh.HHExperience;
import com.smartbox.jobster.entity.integration.hh.HHSchedule;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.pojo.VacancyAction;
import com.smartbox.jobster.pojo.VacancyToIshGOPojo;
import com.smartbox.jobster.security.specific.UiSettingFieldEnabled;
import com.smartbox.jobster.security.specific.UiVacancyCloseDisabled;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.service.hh.HHVacancyService;
import com.smartbox.jobster.service.ishgo.IshGOAuthService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import com.smartbox.jobster.service.tg.TgChannelService;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.smartbox.jobster.view.abstractview.AbstractQuestionnaireEntityDetailView;
import com.smartbox.jobster.view.action.mass.vacancy.VacancyRejectActionView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.smartbox.jobster.view.vacancy.ishgo.IshgoSelectCompanyView;
import com.smartbox.jobster.view.vacancy.ishgo.LoginIshGOView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.shared.Tooltip;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.*;

@Route(value = "vacancies/:id", layout = MainView.class)
@ViewController("jb_Vacancy.detail")
@ViewDescriptor("vacancy-detail-view.xml")
@EditedEntityContainer("vacancyDc")
public class VacancyDetailView extends AbstractQuestionnaireEntityDetailView<Vacancy> implements AbstractCustomDetailView {
    private static final Logger log = LoggerFactory.getLogger(VacancyDetailView.class);
    private List<Language> languages;
    private List<VacancyLanguage> vacancyLanguages;
    private Set<Bot> bots;

    /**
     * The whole {@code jb_Language} table, loaded on first use rather than on open.
     * <p>
     * It used to be loaded in {@code onReady} for every vacancy, but only ~1% of vacancies carry a
     * language row, so 99% of opens paid for a full-table load whose result was never shown. Some
     * tenants have five-figure language tables, which made that a five-figure entity
     * materialisation on the UI thread.
     */
    private List<Language> languages() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TreeComboBox<Department> departmentTreeComboBox;
    private boolean pressEducationTooltip;
    private boolean pressExperienceTooltip;

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.vacancy-to-ishgo.routing-key}")
    private String routingKey;

    @Setter
    private Kanban kanban;

    @ViewComponent
    private VerticalLayout positionContainer;
    @ViewComponent
    private VerticalLayout otherLanguages;
    @ViewComponent
    private JmixButton closeBtn;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionContainer<Position> positionDc;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private TranslateRichTextEditor responsibilityField;
    @ViewComponent
    private JmixSelect<HHExperience> hhExperienceField;
    @ViewComponent
    private JmixSelect<HHSchedule> hhScheduleField;
    @ViewComponent
    private JmixIntegerField workplaceQtyField;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private VerticalLayout hiredApplicants;
    @ViewComponent
    private VerticalLayout hiredApplicantsBox;
    @ViewComponent
    private CodeField codeField;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private HHVacancyService hHVacancyService;
    @Autowired
    private Notifications notifications;
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private UserService userService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private RequestService requestService;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private LanguageService languageService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private IntegratedVacancyService integratedVacancyService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private EntityComboBox<Education> educationField;
    @ViewComponent
    private HorizontalLayout layout;
    @ViewComponent
    private EntityComboBox<Experience> experienceField;
    @ViewComponent
    private Paragraph hhNotification;
    @ViewComponent
    private Div hhSocialStatusIcon;
    @ViewComponent
    private JmixButton saveAndCloseBtn;
    @ViewComponent
    private JmixCheckbox ishGO;
    @ViewComponent
    private JmixImage<Object> generate;

    @Autowired
    private QuestionService questionService;
    @Autowired
    private IshGOAuthService ishGOAuthService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @ViewComponent
    private EntityComboBox<User> responsibleField;
    @ViewComponent
    private EntityComboBox<WorkSchedule> scheduleField;
    @ViewComponent
    private EntityComboBox<PersonGroup> personGroupField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMinField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMaxField;
    @ViewComponent
    private JmixComboBox<Currency> currencyField;
    @ViewComponent
    private EntityComboBox<Questionnaire> form;
    @ViewComponent
    private JmixSelect<Gender> genderField;
    @ViewComponent
    private JmixRadioButtonGroup<VacancyStatus> statusField;
    @ViewComponent
    private JmixCheckbox hotField;
    @ViewComponent
    private JmixSelect<VacancyType> typeField;
    @ViewComponent
    private JmixSelect<EmploymentType> employmentTypeField;
    @ViewComponent
    private JmixTextArea memo;
    @ViewComponent
    private DropdownButton menuBar;
    @Autowired
    private DepartmentService departmentService;
    @ViewComponent
    private CollectionContainer<Bot> botDc;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private TgChannelService tgChannelService;
    @ViewComponent
    private JmixCheckbox telegramChannels;


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

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpTooltips() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("typeField")
    public void onTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<VacancyType>, VacancyType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeBtn", subject = "clickListener")
    public void onCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addLanguage", subject = "clickListener")
    public void onAddLanguageClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "generate", subject = "clickListener")
    public void onGenerateClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void appendToOutput(UI ui, String token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void onStreamComplete(UI ui) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("telegramChannels")
    public void onTelegramChannelsComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckbox, Boolean> event) {
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

    /**
     * IshGO ga publish. Kompaniyada bir nechta INN bo'lsa — qaysi kompaniya (INN) ostida
     * chiqarishni tanlash uchun dialog ochiladi; tanlangan INN tokeni bilan publish bo'ladi.
     * Bitta yoki INN bo'lmasa — to'g'ridan-to'g'ri yuboriladi (eski xatti-harakat).
     */
    private void publishToIshGO(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendVacancyToIshGO(Vacancy vacancy, String inn) {
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


    @Subscribe(id = "hhSocial", subject = "clickListener")
    public void onHhSocialClick(final ClickEvent<Div> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("web")
    public void onWebComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixCheckbox, Boolean> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showResponseHH(String text, String code, String notificationClass, String socialClass, String logo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateStatusActions(VacancyStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updatePositionItems(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected JmixButton createHelperButton() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadHiredApplicantsByVacancy(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildHiredApplicantsCard(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String birthDateFormat(OffsetDateTime birthDate) {
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

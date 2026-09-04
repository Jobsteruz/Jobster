package com.smartbox.jobster.view.monitoring.person;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.composite.ChatComponent;
import com.smartbox.jobster.dto.callAgent.AiCallDataDto;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Label;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.cms.Comment;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeeStateHistory;
import com.smartbox.jobster.entity.hrm.Offer;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireEntityLabel;
import com.smartbox.jobster.entity.questionnaire.SecondQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePersonAnswer;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.event.MessageHistoryEvent;
import com.smartbox.jobster.service.CommentService;
import com.smartbox.jobster.service.LabelService;
import com.smartbox.jobster.service.OfferService;
import com.smartbox.jobster.service.ai.AiCallDataService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.view.abstractview.DeferredLoads;
import com.smartbox.jobster.view.action.mass.*;
import com.smartbox.jobster.view.comment.CommentView;
import com.smartbox.jobster.view.cvparser.CvParserV2Dialog;
import com.smartbox.jobster.view.interview.AdditionalQuestionnaireDialogs;
import com.smartbox.jobster.view.label.LabelView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.AbstractKanbanInfoView;
import com.smartbox.jobster.view.monitoring.person.fragment.*;
import com.smartbox.jobster.view.vacancy.VacancyListView;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.core.FileRef;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.upload.event.FileUploadSucceededEvent;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.reports.entity.Report;
import jakarta.persistence.Entity;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Route(value = "person-kanban-info-view", layout = MainView.class)
@ViewController("jb_PersonKanbanInfoView")
@ViewDescriptor("person-kanban-info-view.xml")
public abstract class PersonKanbanInfoView<T extends Passport> extends AbstractKanbanInfoView {
    protected T person;
    protected Collection<PersonEducation> educations;
    protected Collection<PersonExperience> experiences;

    private boolean alreadyShow = false;

    protected List<QuestionnaireEntityLabel> entityLabels;
    protected ChatComponent chat;
    @ViewComponent
    private CollectionLoader<Offer> offerDl;
    @ViewComponent
    private CollectionContainer<Offer> offerDc;
    @ViewComponent
    protected CollectionLoader<TempQuestionnairePerson> tempQuestionnairePersonDl;
    @ViewComponent
    protected CollectionContainer<TempQuestionnairePerson> tempQuestionnairePersonDc;

    @Setter
    public KanbanInfoTab defaultTab = KanbanInfoTab.ANSWERS;

    //tabs
    @ViewComponent("tabs.documents")
    protected Tab tabsDocuments;
    private boolean tabsDocumentsBuilt = false;
    @ViewComponent("tabs.offer")
    protected Tab tabsOffer;
    private boolean tabsOfferBuilt = false;
    @ViewComponent("tabs.chat")
    protected Tab tabsChat;
    private boolean tabsChatBuilt = false;
    @ViewComponent("tabs.events")
    protected Tab tabsEvents;
    private boolean tabsEventsBuilt = false;
    @ViewComponent("tabs.history")
    protected Tab tabsHistory;
    private boolean tabsHistoryBuilt = false;
    @ViewComponent("tabs.duplicate")
    protected Tab tabsDuplicate;
    private boolean tabsDuplicateBuilt = false;
    @ViewComponent("tabs.access")
    protected Tab tabsAccess;
    private boolean tabsAccessBuilt = false;
    @ViewComponent("tabs.resumeIshGo")
    protected Tab tabsResumeIshGo;
    private boolean tabsResumeIshGoBuilt = false;
    @ViewComponent("tabs.calls")
    protected Tab tabsCalls;
    private boolean tabsCallsBuilt = false;

    @Autowired
    protected TimeSource timeSource;
    @Autowired
    protected LabelService labelService;
    @Autowired
    protected EntityStates entityStates;
    @Autowired
    protected DialogWindows dialogWindows;
    @Autowired
    protected TenantProvider tenantProvider;
    @Autowired
    protected KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    protected PersonService personService;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    protected AiCallDataService aiCallDataService;
    @Autowired
    private OfferService offerService;
    @Value("${app.url}")
    private String appUrl;
    @Autowired
    private CommentService commentService;
    @Autowired
    protected AdditionalQuestionnaireDialogs additionalQuestionnaireDialogs;

    @ViewComponent
    protected KeyValueCollectionContainer entityLogItemsDc;
    @ViewComponent
    protected JmixImage<Object> photoField;
    @ViewComponent
    protected VerticalLayout labelBox;
    @ViewComponent
    protected VerticalLayout vacancyBox;
    @ViewComponent
    protected VerticalLayout duplicateCandidateBox;
    @ViewComponent
    protected VerticalLayout middleBox;
    @ViewComponent
    protected HorizontalLayout mainBox;
    @ViewComponent
    protected VerticalLayout documentsBox;
    @ViewComponent
    protected VerticalLayout offerBox;
    @ViewComponent
    protected HorizontalLayout chatBox;
    @ViewComponent
    protected VerticalLayout calendarBox;
    @ViewComponent
    protected JmixSelect<PersonDuplicate> duplicateField;
    @ViewComponent
    protected DataGrid<T> duplicateDataGrid;
    @ViewComponent
    protected VerticalLayout accessBox;
    @ViewComponent
    protected VerticalLayout resumeIshGoBox;
    @ViewComponent
    private IFrame fileRefIframe;
    @ViewComponent
    protected VerticalLayout rightBox;
    @ViewComponent
    protected VerticalLayout stageHistoryBox;
    @ViewComponent
    protected Div bannedDiv;
    @ViewComponent
    protected H4 personName;
    @ViewComponent
    protected CollectionLoader<QuizPerson> quizPersonsDl;
    @ViewComponent
    protected CollectionContainer<QuizPerson> quizPersonsDc;
    @ViewComponent
    protected VerticalLayout quizPersonsBox;
    @ViewComponent
    protected VerticalLayout tempQuestionnairesResultBox;
    @ViewComponent
    protected H5 quizTitle;
    @ViewComponent
    protected H5 additionalQuestionnaireTitle;
    @ViewComponent
    protected H5 secondQuestionnairesTitle;
    @ViewComponent
    protected VerticalLayout secondQuestionnairesResultBox;
    @ViewComponent
    protected CollectionContainer<SecondQuestionnaire> secondQuestionnairesDc;
    @ViewComponent
    protected CollectionLoader<SecondQuestionnaire> secondQuestionnairesDl;
    @ViewComponent
    protected VerticalLayout interviewButtonBox;
    @ViewComponent
    private CollectionContainer<SurveyUser> surveyUserDc;
    @ViewComponent
    private CollectionLoader<SurveyUser> surveyUserDl;
    @ViewComponent
    protected VerticalLayout personSurveyBox;
    @ViewComponent
    protected H5 surveyTitle;

    // Calls tab components
    @ViewComponent
    protected VerticalLayout callsBox;
    @ViewComponent
    protected Button showButton;
    @ViewComponent
    protected Span noDuplicatesLabel;
    @ViewComponent
    protected JmixButton attachVacancyBtn;
    @ViewComponent
    protected CollectionLoader<EmployeeStateHistory> employeeStateHistoryDl;
    @ViewComponent
    protected DataGrid<EmployeeStateHistory> employeeStateHistoriesDataGrid;

    @ViewComponent
    protected HorizontalLayout applicantButtonsBox;
    @ViewComponent
    protected JmixButton restoreBtn;
    @ViewComponent
    protected JmixButton reserveBtn;
    @ViewComponent
    protected JmixButton rejectBtn;
    @ViewComponent
    protected JmixButton hireBtn;
    @ViewComponent
    protected H5 actionsTitle;
    @ViewComponent
    private MessageBundle messageBundle;

    protected MenuBar menuBar = new MenuBar();
    /** Kept so its visibility can follow the current stage after an arrow transfer. */
    private MenuItem admitItem;


    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onDetach(final DetachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clearLoadedState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void removeChildren(Component... components) {
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

    @Override
    public void tabChangedEvent(Tab tab, boolean fromClient) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildDocumentsTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildOfferTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildChatTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildEventsTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildHistoryTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildStateHistoryTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildAccessTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildDuplicateTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildResumeIshGoTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildCallsTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildCommentsBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("duplicateField")
    public void onDuplicateFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void reloadDuplicateDataGrid() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Vacancy/department info for the duplicate rows, one query per reload (columns read this map). */
    private Map<UUID, Applicant> duplicateApplicantsById = Collections.emptyMap();

    private void prefetchDuplicateApplicants() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("duplicateDataGrid.reject")
    public void onDuplicateDataGridReject(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("duplicateDataGrid.reserve")
    public void onDuplicateDataGridReserve(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<JbEntity<UUID>, KanbanStage> selectedDuplicateStageMap() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void refreshDuplicatesAfterAction(boolean saved) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("duplicateDataGrid")
    public void onDuplicateDataGridItemDoubleClick(final ItemDoubleClickEvent<Passport> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addCommentBtn", subject = "singleClickListener")
    public void onAddCommentBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "labelEditBtn", subject = "clickListener")
    public void onLabelEditBtnClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildMenuBar() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addActionsSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Admitting is only offered on the kanban's last stage, so it follows every stage transfer. */
    private void refreshAdmitVisibility() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void afterStageTransfer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** The stage the person is in right now, re-read from the stage history. */
    protected KanbanStage currentStage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Single-entry {entity -> stage} map in the shape the mass action views expect. */
    protected Map<JbEntity<UUID>, KanbanStage> personStageMap(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addReportsSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, Object> reportParams() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void addBotsSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Offered for every person kind — the answers are stored polymorphically, so employees qualify too. */
    private void addAdditionalQuestionsSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Opens the questionnaire dialog — the wizard, or the one-screen Jobster 3 form for a company
     * that asked for it — and reveals the freshly filled result once it is saved.
     */
    protected void openAdditionalQuestions() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Brings the Answers tab back after a questionnaire was filled in.
     * <p>
     * The tab hides itself while the person has nothing to show — the common case for employees —
     * and un-hiding it is not enough on its own: {@link io.jmix.flowui.component.tabsheet.JmixTabSheet}
     * only re-attaches a tab's content when that tab becomes the selected one. So select it, which
     * also puts the user straight on the result they have just produced.
     */
    private void revealAnswersTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addCvImportSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Invoked by {@link CvParserV2Dialog} after it has persisted a new applicant together with
     * all parsed collections. Flips this view from edit to read-only info mode, updates the URL
     * with the saved id, and enables tabs that were disabled during create.
     */
    @SuppressWarnings("unchecked")
    private void onApplicantSavedFromCvParser(Applicant saved) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addShareSubMenu(SubMenu subMenu) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String buildApplicantUrl() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadBannedAndLabelsAsync() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildLabelBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildVacancyBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateAttachVacancyBtnVisibility() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("attachVacancyBtn")
    public void onAttachVacancyBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "showButton", subject = "singleClickListener")
    public void onShowButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDuplicateCandidateCards() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void hideStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public JbEntity<UUID> getEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener
    public void onMessageHistoryEvent(MessageHistoryEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    protected Function<Person, Void> saveHandler = (person) -> {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    protected Function<Person, Void> cancelHandler = (person) -> {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void setupDefaultTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeIcon", subject = "clickListener")
    public void onCloseIconClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void stageTransferClickListener(KanbanStage stage, String stageCaption, KanbanStage currentStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void buildAnswersTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildSurveyComponent(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildQuizComponent(String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("additionalQuestionsButton")
    public void onStartInterviewBtnClick(ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected TempQuestionnairePerson getQuestionnairePerson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void loadAdditionalQuestionnaire() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The questionnaire's answers right on the card, the way Jobster 3 showed them: its name over a
     * question/answer table, plus the way back into the form to correct an answer.
     */
    protected VerticalLayout additionalQuestionnaireAnswersBox(TempQuestionnairePerson questionnairePerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout additionalQuestionnaireAnswersHeader(TempQuestionnairePerson questionnairePerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String additionalQuestionnaireAnswerText(TempQuestionnairePersonAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void loadSecondQuestionnaires() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildSecondQuestionnaireRow(SecondQuestionnaire item) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setIcon2Tab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

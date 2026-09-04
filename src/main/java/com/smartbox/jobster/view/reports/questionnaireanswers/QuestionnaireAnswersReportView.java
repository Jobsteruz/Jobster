package com.smartbox.jobster.view.reports.questionnaireanswers;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.JbUserZonedDateTime;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempAnswer;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestion;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePersonAnswer;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.utils.ZonedDateUtils;
import com.smartbox.jobster.view.chat.bigimage.BigImageView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.ReportPeriod;
import com.smartbox.jobster.view.video.VideoInfoView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataLoadContext;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import io.jmix.core.ValueLoadContext;
import io.jmix.core.entity.EntityValues;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.pagination.SimplePagination;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.model.KeyValueCollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

@Route(value = "questionnaire-answers-report", layout = MainView.class)
@ViewController("jb_QuestionnaireAnswersReport")
@ViewDescriptor("questionnaire-answers-report-view.xml")
public class QuestionnaireAnswersReportView extends AbstractReportView {

    private static final String MSG_GROUP = "com.smartbox.jobster.view.reports.questionnaireanswers";

    private static final String Q_PREFIX = "q_";
    /**
     * Rows are the people who answered the questionnaire, not the people the questionnaire created.
     * A questionnaire sent from a kanban action (or from the web form) attaches its answers to an
     * existing person and never becomes that person's own {@code questionnaire}, so keying the report
     * on {@code a.questionnaire} left every such questionnaire with an empty grid. Deliberately NOT
     * {@code a.questionnaire = :q or exists (...)}: the OR makes Postgres materialise the whole
     * answer set of the questionnaire instead of the semi-join (5s vs 60ms on the biggest tenant),
     * and the OR branch adds nothing — every completed person keyed to a questionnaire has answers.
     */
    private static final String ANSWERED_QUESTIONNAIRE_WHERE =
            "where a.completed = true and a.deletedDate is null " +
                    "and exists (select qa from jb_QuestionAnswer qa " +
                    "where qa.questionnaire = :q and qa.entityId = a.id and qa.deletedDate is null)";

    /**
     * An interview whose candidate was deleted afterwards drops out of the report completely — the
     * row would otherwise carry answers and a score under a blank name, and the bot-questionnaire
     * side already hides deleted people. Shared by the row query and the count query behind the
     * pager, which have to agree or paging breaks. Only {@code jb_Applicant} can be checked from
     * JPQL — the person link is an entity-name + id pair rather than an association — and it is the
     * only person type interviews are ever created for.
     */
    private static final String LIVING_PERSON_WHERE =
            " and (e.personEntity <> 'jb_Applicant' or exists " +
                    "(select a from jb_Applicant a where a.id = e.personId and a.deletedDate is null))";

    /** Prefix of the columns that exist only in the additional-questionnaire mode. */
    private static final String X_PREFIX = "x_";
    private static final String X_INTERVIEWER = X_PREFIX + "interviewer";
    private static final String X_DATE = X_PREFIX + "date";
    private static final String X_SCORE = X_PREFIX + "score";

    @Autowired
    private DataManager dataManager;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private JbUserZonedDateTime userZonedDateTime;
    @Autowired
    private Metadata metadata;
    @Autowired
    private MetadataTools metadataTools;

    @ViewComponent
    private JmixSelect<Questionnaire> questionnaireComboBox;
    @ViewComponent
    private JmixSelect<TempQuestionnaire> additionalQuestionnaireComboBox;
    @ViewComponent
    private JmixButton orderBtn;
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private DataGrid<KeyValueEntity> dataGrid;
    @ViewComponent("dataGrid.printExcel")
    private ExcelExportAction exportAction;
    @ViewComponent
    private SimplePagination pagination;
    @ViewComponent
    private CollectionLoader<Questionnaire> questionnaireDl;
    @ViewComponent
    private CollectionLoader<TempQuestionnaire> additionalQuestionnaireDl;
    @ViewComponent
    private KeyValueCollectionLoader reportDl;
    @ViewComponent
    private TypedDatePicker<LocalDate> fillDateFrom;
    @ViewComponent
    private TypedDatePicker<LocalDate> fillDateTo;
    @ViewComponent
    private JmixSelect<ReportPeriod> reportPeriodSelection;

    /**
     * entityId:questionId → QuestionAnswer — for media rendering (FILE questions only)
     */
    private final Map<String, QuestionAnswer> answerLookup = new HashMap<>();

    private final Set<String> registeredExcelProviderKeys = new HashSet<>();

    private UUID lastRenderedQuestionnaireId;

    /** Guards the mutual clearing of the two questionnaire selects against a feedback loop. */
    private boolean selectionSyncing;

    /** Column questions and their maximum scores, rebuilt when the additional questionnaire changes. */
    private List<TempQuestion> additionalQuestions = Collections.emptyList();
    private Map<UUID, Integer> additionalMaxScores = Collections.emptyMap();

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("reportPeriodSelection")
    public void onReportPeriodSelectionChanged(final AbstractField.ComponentValueChangeEvent<JmixSelect<ReportPeriod>, ReportPeriod> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refreshBtn", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    /**
     * Matches {@code QuestionnaireAnswersReportGenerator.REPORT_CODE} on the worker side.
     */
    @Override
    protected String reportCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Questionnaire name is more meaningful than the empty page header for the orders list.
     */
    @Override
    protected String reportDisplayName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Map<String, Object> collectReportParameters() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "orderBtn", subject = "clickListener")
    public void onOrderClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("questionnaireComboBox")
    public void onQuestionnaireChanged(final AbstractField.ComponentValueChangeEvent<JmixSelect<Questionnaire>, Questionnaire> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("additionalQuestionnaireComboBox")
    public void onAdditionalQuestionnaireChanged(final AbstractField.ComponentValueChangeEvent<JmixSelect<TempQuestionnaire>, TempQuestionnaire> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The two questionnaire kinds have different row sources, so only one of them can drive the grid.
     */
    private void onSelectedQuestionnaireChanged() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clearSilently(JmixSelect<?> select) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isAdditionalMode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fillDateFrom")
    public void onFillDateFromChanged(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>, LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fillDateTo")
    public void onFillDateToChanged(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>, LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Integer getTotalCount(DataLoadContext dataLoadContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KeyValueEntity> loadPage(ValueLoadContext loadContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Paging sets the range on the loader, while the Excel "all rows" export drives this delegate
     * batch by batch through the {@link ValueLoadContext} it builds itself — so the context wins.
     */
    private int firstResult(ValueLoadContext loadContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private int maxResults(ValueLoadContext loadContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KeyValueEntity> buildRows(Questionnaire questionnaire, int firstResult, int maxResults) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void ensureDynamicColumns(Questionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyFillDateFilter(StringBuilder jpql, Map<String, Object> params, String dateProperty) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ── Additional questionnaire (manager interview) ───────────────────────────

    /**
     * Rows come from the finished interviews of the selected additional questionnaire; the person
     * behind {@code personEntity}/{@code personId} supplies the same head columns as the bot report.
     */
    private List<KeyValueEntity> buildAdditionalRows(TempQuestionnaire questionnaire, int firstResult, int maxResults) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void ensureAdditionalDynamicColumns(TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, List<TempQuestionnairePersonAnswer>> loadAdditionalAnswers(List<TempQuestionnairePerson> interviews) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Interviews reference their person by entity name + id, so the persons are loaded per entity type.
     * Only {@link Applicant} carries vacancy and department; other person types fall back to name and phone.
     * <p>
     * Loaded by query rather than by {@code ids(...)} on purpose: the id loader throws
     * {@code EntityAccessException} — killing the whole report — for any id it cannot read, which is
     * every candidate deleted after their interview. {@link #LIVING_PERSON_WHERE} already keeps those
     * rows out for {@code jb_Applicant}, so this only has to stay harmless for the other person types.
     */
    private Map<String, PersonInfo> loadPersons(List<TempQuestionnairePerson> interviews) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, Integer> maxScoreByQuestion(List<TempQuestion> questions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The interview dialog keeps the questionnaire chosen when the row was created, but saves the
     * answers against the questions of the questionnaire selected afterwards. So the answered
     * questions are unioned in — otherwise such answers would have no column to land in.
     */
    private List<TempQuestion> loadAdditionalQuestions(TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String answerText(TempQuestionnairePersonAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Earned score against the maximum reachable by the questions this person actually answered. */
    private String formatScore(List<TempQuestionnairePersonAnswer> answers, Map<UUID, Integer> maxScores) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatUserDate(OffsetDateTime dateTime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String personKey(String entityName, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void removeDynamicColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDynamicTextColumn(String key, String header) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record PersonInfo(String name, String department, String vacancy, String phone) {
    }

    private Component renderMediaCell(KeyValueEntity kv, String propName, Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

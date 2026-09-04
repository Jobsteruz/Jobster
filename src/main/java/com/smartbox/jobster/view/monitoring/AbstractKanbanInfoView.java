package com.smartbox.jobster.view.monitoring;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.Anchor;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.checklist.Checklist;
import com.smartbox.jobster.entity.cms.Comment;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.questionnaire.*;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.entity.quiz.QuizPerson;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.abstractview.DeferredLoads;
import com.vaadin.flow.component.UI;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.service.questionnaire.AdditionalQuestionnaireService;
import com.smartbox.jobster.view.chat.bigimage.BigImageView;
import com.smartbox.jobster.view.checklist.ChecklistFragment;
import com.smartbox.jobster.view.monitoring.person.fragment.PersonCommentFragment;
import com.smartbox.jobster.view.monitoring.person.fragment.PersonStageHistoryFragment;
import com.smartbox.jobster.view.speech_assessment.speech_assessment_info.SpeechAssessmentInfoView;
import com.smartbox.jobster.view.video.VideoInfoView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Svg;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import io.jmix.core.EntityStates;
import io.jmix.core.FileStorage;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Fragments;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.component.virtuallist.JmixVirtualList;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.reports.entity.Report;
import io.jmix.reports.entity.ReportOutputType;
import io.jmix.reports.runner.ReportRunner;
import io.jmix.reports.yarg.reporting.ReportOutputDocument;
import jakarta.persistence.Entity;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Since: 11/1/2024 2:53 PM
 */
public abstract class AbstractKanbanInfoView extends StandardView {
    private static final Logger log = LoggerFactory.getLogger(AbstractKanbanInfoView.class);

    protected Locale locale;
    protected Kanban kanban;
    protected Person person;

    @Setter
    protected boolean editable;

    //tabs
    @ViewComponent("tabs.info")
    protected Tab tabsInfo;
    protected boolean tabsInfoBuilt = false;
    @ViewComponent("tabs.answers")
    protected Tab tabsAnswers;
    protected boolean tabsAnswersBuilt = false;
    @ViewComponent("tabs.checklist")
    protected Tab tabsChecklist;
    protected boolean tabsChecklistBuilt = false;
    @ViewComponent("tabs.comments")
    protected Tab tabsComments;
    private boolean tabsCommentsBuilt = false;

    @ViewComponent
    protected CollectionContainer<QuestionAnswer> questionAnswersDc;
    @ViewComponent
    protected CollectionLoader<QuestionAnswer> questionAnswersDl;
    @ViewComponent
    protected CollectionLoader<Checklist> checklistDl;
    @ViewComponent
    protected CollectionLoader<Comment> commentListDl;
    @ViewComponent
    protected CollectionLoader<KanbanStageHistory> stageHistoryDl;
    @ViewComponent
    protected HorizontalLayout loader;
    @ViewComponent
    protected HorizontalLayout layout;
    @ViewComponent
    protected JmixTabSheet tabs;
    @ViewComponent
    protected VerticalLayout infoBox;
    @ViewComponent
    protected VerticalLayout questionAnswersBox;
    @ViewComponent
    protected JmixVirtualList<Checklist> virtualChecklist;
    @ViewComponent
    protected JmixVirtualList<Comment> virtualCommentList;
    @ViewComponent
    protected HorizontalLayout stageBox;

    @Autowired
    protected Dialogs dialogs;
    @Autowired
    protected Messages messages;
    @Autowired
    protected Fragments fragments;
    @Autowired
    protected UiComponents uiComponents;
    @Autowired
    protected EntityService entityService;
    @Autowired
    protected TranslateService translateService;
    @Autowired
    protected KanbanActionService kanbanActionService;
    @Autowired
    protected EntityStates entityStates;
    @Autowired
    protected CurrentAuthentication currentAuthentication;
    @Autowired
    protected SpeechAssessmentService speechAssessmentService;
    @Autowired
    protected KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    protected KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    protected DialogWindows dialogWindows;
    @Autowired
    protected ReportRunner reportRunner;
    @Autowired
    protected Downloader downloader;
    @Autowired
    protected ReportService reportService;
    @Autowired
    protected SystemAuthenticator systemAuthenticator;
    @Autowired
    protected AdditionalQuestionnaireService additionalQuestionnaireService;
    @Autowired
    protected QuizService quizService;
    @Autowired
    private CommentService commentService;
    @Autowired
    protected EmployeeService employeeService;
    @Autowired
    protected MessageHistoryService messageHistoryService;
    @Autowired
    protected PersonService personService;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setKanban(String kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void setEntity(String entityId);

    public abstract JbEntity<UUID> getEntity();

    @Subscribe("tabs")
    public void onTabsSelectedChange(final JmixTabSheet.SelectedChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void tabChangedEvent(Tab tab, boolean fromClient) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildInfoTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildAnswersTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildChecklistTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildCommentsBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildStageBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void stageTransferClickListener(KanbanStage stage, String stageCaption, KanbanStage currentStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Called right after a stage transfer made from the stage arrows has been committed.
     * Subclasses that captured the current stage at build time — action buttons, cog-menu items —
     * must refresh it here. Without that refresh a later Reject/Reserve/Blacklist is recorded
     * against the stage the view was opened at, which both mislabels the stage-history entry and
     * pushes the entity back to that old stage (the reject writes it into KanbanStageEntity).
     */
    protected void afterStageTransfer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildStageHistoryBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Batch data for the stage-history cards; rebuilt on every {@link #buildStageHistoryBox()}. */
    protected PersonStageHistoryFragment.Preloaded stageHistoryPreload;
    /** Comment-owner employees for the comments tab, keyed by user id; null until that tab loads. */
    protected Map<UUID, Employee> commentOwnersByUserId;

    private PersonStageHistoryFragment.Preloaded buildStageHistoryPreload(List<KanbanStageHistory> histories) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Puts every quiz sent to this candidate on the stage card that was current when it was sent.
     * A quiz carries no link to the stage history, so the send date is matched against the
     * transition dates; anything sent before the first recorded transition belongs to that first
     * card. One query for the whole list — the cards themselves never query.
     */
    private Map<UUID, List<QuizPerson>> quizzesByStageHistory(List<KanbanStageHistory> histories) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void moveCard(KanbanStage from, KanbanStage to, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected VerticalLayout questionAnswersDataGridAnswerRenderer(
            Questionnaire questionnaire, List<QuestionAnswer> answers
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component phoneWithTelegramIcon(QuestionAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component questionAnswerLocationComponent(QuestionAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isBirthDate(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatBirthDateWithAge(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private OffsetDateTime parseBirthDate(String birthDateString, Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component questionAnswerFileComponent(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    protected Anchor downloadComponent(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private SpeechAssessmentInfoView getSpeechAssessmentInfoView(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VideoInfoView getVideoInfoView(QuestionAnswer questionAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "virtualChecklist", subject = "renderer")
    private Renderer<Checklist> virtualChecklistRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "virtualCommentList", subject = "renderer")
    private Renderer<Comment> virtualCommentListRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "stageHistoryList", subject = "renderer")
    private Renderer<KanbanStageHistory> stageHistoryListRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void hideStageHistory();

    public void disableTabsOnCreate(boolean disable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setIcon2Tab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void setIcon2Tab(Tab tab, VaadinIcon vaadinIcon, String msg, Tab selectedTab) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildReportMap(Map<String, Object> param, Report report, Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Returns the current TempQuestionnairePerson if applicable.
     * Default: null (for non-Person views like Vacancy/Request).
     * PersonKanbanInfoView overrides this with the actual loader-backed lookup.
     */
    protected TempQuestionnairePerson getQuestionnairePerson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

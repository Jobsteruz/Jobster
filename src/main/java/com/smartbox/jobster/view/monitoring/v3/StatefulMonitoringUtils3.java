package com.smartbox.jobster.view.monitoring.v3;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bean.query_transformer.OrSupportedQueryTransformer;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.SidebarGroupFilter;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.event.EntityStageChangedEvent;
import com.smartbox.jobster.event.QuestionnaireEntityCompletedEvent;
import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.security.specific.UiFilterByResponsibleEnabled;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanBatchQueryService;
import com.smartbox.jobster.service.kanban.KanbanBatchQueryService.BatchCacheResult;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.PersonCardDataService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.trello.ComponentsInfo;
import com.smartbox.jobster.trello.component.AbstractKanbanColumn;
import com.smartbox.jobster.trello.component.SortableLayout;
import com.smartbox.jobster.trello.component.card.AbstractEntityCard;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.smartbox.jobster.trello.component.card.CardProperties;
import com.smartbox.jobster.trello.component.card.TrelloCardsContainer;
import com.smartbox.jobster.trello.component.column.KanbanColumn;
import com.smartbox.jobster.trello.component.column.KanbanColumnFooter;
import com.smartbox.jobster.trello.component.column.KanbanColumnHeader;
import com.smartbox.jobster.trello.component.events.CardsAddedEvent;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.smartbox.jobster.view.monitoring.AbstractMultiLoaderMonitoring;
import com.smartbox.jobster.view.monitoring.ActionMonitoring;
import com.smartbox.jobster.view.monitoring.MonitoringUtils;
import com.smartbox.jobster.view.monitoring.loader.datasupport.LoadConfiguration;
import com.smartbox.jobster.view.monitoring.v2.vacancykanbanfragment.VacancySelectionEvent;
import com.smartbox.jobster.view.monitoring.v2.vacancykanbanfragment.VacancyUnselectionEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.core.*;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.querycondition.Condition;
import io.jmix.core.querycondition.JpqlCondition;
import io.jmix.core.querycondition.LogicalCondition;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.data.QueryTransformer;
import io.jmix.data.impl.jpql.generator.ConditionGenerationContext;
import io.jmix.data.impl.jpql.generator.ConditionJpqlGenerator;
import io.jmix.data.impl.jpql.generator.ParameterJpqlGenerator;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.filter.FilterComponent;
import io.jmix.flowui.component.genericfilter.Configuration;
import io.jmix.flowui.component.listbox.JmixMultiSelectListBox;
import io.jmix.flowui.component.logicalfilter.LogicalFilterComponent;
import io.jmix.flowui.settings.UserSettingsCache;
import jakarta.persistence.Entity;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Optimized version of StatefulMonitoringUtils2.
 * Key improvements:
 * - Spring @Component with proper @Autowired (no AppBeans.get())
 * - Parallel stage loading via CompletableFuture
 * - Batch count queries (GROUP BY instead of N queries)
 * - Parallel cache loading (4 queries in parallel)
 * - Progressive rendering via UI.access()
 * - Image lazy loading
 * - Persistent count cache
 */
@Component
@Scope("prototype")
public class StatefulMonitoringUtils3 {

    private static final Logger log = LoggerFactory.getLogger(StatefulMonitoringUtils3.class);
    private static final int INITIAL_CARD_COUNT = 10;

    // ===================== THREAD POOL =====================
    // A SINGLE small bounded static pool. fillColumns is fully NON-BLOCKING: it composes
    // CompletableFutures (thenCompose / thenCombine / whenComplete) and NEVER calls .join()/.get()
    // on a pool thread. So a pool thread is never parked waiting for another task in the same pool
    // -> the thread-pool starvation deadlock is structurally impossible, and one small pool is enough.
    //
    // (The original bug: a single pool ran blocking coordinators AND the queries they waited on.
    //  With >= poolSize concurrent boards, every thread parked on join() while the queries it
    //  needed sat in the queue and could never be scheduled. Because the pool is static/JVM-wide,
    //  that froze monitoring for EVERY tenant until the app was restarted.)

    /**
     * Leaf DB queries + lightweight non-blocking continuation glue. Bounded to cap concurrent DB
     * connections; threads are never parked, so they stay productive.
     * <p>
     * Sized against the Hikari pool this app actually runs, not against HikariCP's built-in default.
     * The original 4 was justified by "HikariCP default max = 10", but prod sets
     * {@code maximum-pool-size=50} — so the bound was five times tighter than the resource it exists
     * to protect. And because the pool is static it is the ONE pool serving every board of every user
     * of every tenant on the node: on 2026-08-04, ten minutes after a restart, five different sessions
     * logged 10–19 s "Too long timer processing" inside the same 15 seconds while all their boards
     * reloaded at once.
     * <p>
     * Override per environment with {@code -Djobster.monitoring3.worker-threads=N}. It is a system
     * property rather than a Spring one on purpose: this field is static and initialises before any
     * application context exists, so {@code @Value} could never reach it.
     */
    private static final Executor WORKER_EXECUTOR =
            Executors.newFixedThreadPool(
                    Math.max(4, Integer.getInteger("jobster.monitoring3.worker-threads", 16)),
                    namedDaemonFactory("monitoring3-worker"));

    /**
     * Hard ceiling for the whole data-loading phase, applied NON-blocking via orTimeout(), so a
     * stuck query can't leave a column's 3-dot loader spinning forever.
     */
    private static final long LOAD_TIMEOUT_SECONDS = 30;

    /**
     * Page size of the bulk load offered in the column header's context menu. The footer "more"
     * button pages by {@link Monitoring3#getMaxElements()} (10), which is fine for a glance but not
     * for the stages this board actually carries — 13 902 in "Viewed", 11 103 in "Interview". This
     * second, much larger page exists so a recruiter can open a working slice in one click; the +10
     * button stays for everything else.
     */
    private static final int BULK_LOAD_SIZE = 500;

    /**
     * Same role as {@link #LOAD_TIMEOUT_SECONDS} for the bulk page: it moves 50x the rows, so it gets
     * proportionally more room before the load is abandoned.
     */
    private static final long BULK_LOAD_TIMEOUT_SECONDS = 60;

    /**
     * Reused empty card-data cache for non-Person kanbans / empty stages (no DB hit).
     */
    private static final KanbanBatchQueryService.CardDataCacheResult EMPTY_CARD_DATA =
            new KanbanBatchQueryService.CardDataCacheResult(
                    Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(),
                    Collections.emptyMap());

    /**
     * Result of the (non-blocking) data-loading phase, handed to UI-thread rendering.
     */
    private record LoadResult(Map<KanbanStage, Collection<JbEntity<UUID>>> stageEntities,
                              KanbanBatchQueryService.CardDataCacheResult cardDataCache) {
    }

    private static java.util.concurrent.ThreadFactory namedDaemonFactory(String namePrefix) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Wraps an executor so the current Spring Security context is propagated to its threads.
     * This is critical for Jmix DataManager calls which require authentication.
     */
    private static Executor securityAware(Executor delegate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Worker executor (leaf DB queries) with the caller's security context propagated.
     */
    private static Executor securityAwareExecutor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Monitoring3 monitoring;
    private OffsetDateTime firstLoadTime;
    private final Map<UUID, Long> stageSizeCache = new java.util.concurrent.ConcurrentHashMap<>();
    /**
     * Two-step stage load — Step 1 cache: stageId -> all kse entity_ids of the stage. Populated
     * lazily, cleared each fillColumns (so a refresh re-reads membership), reused within a cycle
     * so "load more" doesn't re-query.
     */
    private final Map<UUID, List<UUID>> stageEntityIdsCache = new java.util.concurrent.ConcurrentHashMap<>();
    /**
     * Step 2 cache: stageId -> member ids that pass the active filters, ordered by fillDate.
     * Pages slice this list, so the heavy fetch-plan query receives ONLY the page's ids. Cleared
     * together with {@link #stageEntityIdsCache} (same lifetime: one fill cycle).
     */
    private final Map<UUID, List<UUID>> stageOrderedIdsCache = new java.util.concurrent.ConcurrentHashMap<>();
    /**
     * Per-cycle snapshot of the sort button's state (true = oldest first), taken on the UI thread in
     * fillColumns next to {@link #activeFilterSnapshot}. Step 2 orders the stage's ids with it so the
     * pages are CUT in the same direction the loader then sorts them in; one snapshot per cycle also
     * keeps every stage (and the "load more" pages that reuse the cached ids) on one direction even
     * if the button is pressed again mid-load.
     */
    private volatile boolean sortAscendingSnapshot;
    /**
     * Per-cycle filter snapshot for the ordered-id query, taken on the UI thread in fillColumns.
     * Worker threads must never build it themselves: the filter binders read UserSettingsCache /
     * view state, which throw IllegalConcurrentAccessException off the UI thread.
     */
    private volatile ActiveFilter activeFilterSnapshot;
    private final java.util.concurrent.atomic.AtomicLong fillGeneration = new java.util.concurrent.atomic.AtomicLong(0);

    /** Stages whose "load more" page is still in flight — see {@link #loadMoreCardsAsync}. */
    private final Set<UUID> moreLoadingStages =
            java.util.concurrent.ConcurrentHashMap.newKeySet();

    /**
     * stageId -> updater for that column's bulk-load menu item (see {@link #updateBulkLoadItem}).
     * The label states how many rows are left, so it has to follow both the card list and the stage
     * counts; the counts land in {@link #finishFill}, which has columns but no menu items, hence this
     * registry. Overwritten per column build, so it stays as small as the board.
     * <p>
     * Deliberately NOT cleared in {@link #restart()}: a refresh reuses the existing columns
     * ({@code Monitoring3.build()} only rebuilds them the first time), so dropping the updaters there
     * would freeze every label at whatever it said before the refresh.
     */
    private final Map<UUID, Runnable> bulkLoadItemRefreshers = new java.util.concurrent.ConcurrentHashMap<>();

    /** Marks a card that is still waiting for its fade-in, so the stagger only touches new cards. */
    private static final String FADE_IN_CLASS = "jb-card-fade-in";

    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityService entityService;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private Messages messages;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private ViewService viewService;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private UserService userService;
    @Autowired
    private Metadata metadata;
    @Autowired
    private ConditionJpqlGenerator conditionJpqlGenerator;
    @Autowired
    private ParameterJpqlGenerator parameterJpqlGenerator;
    @Autowired
    private KanbanBatchQueryService batchQueryService;
    @Autowired
    private io.jmix.data.QueryTransformerFactory queryTransformerFactory;

    /**
     * Cached filtered vacancy IDs — resolved once per filter apply, reused across all stage queries
     */
    private List<UUID> cachedFilteredVacancyIds;
    private boolean vacancyFilterActive = false;

    public void setMonitoring(Monitoring3 monitoring) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void restart() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Clears the 4 per-view entity caches (statuses, labels, languages, viewed).
     * These hold DETACHED entities (PersonStatus / Set&lt;Label&gt; / Set&lt;PersonLanguage&gt;) which each
     * drag their full EclipseLink lazy-loading graph (ValueHolder, Department/Position refs, ...),
     * so letting them accumulate retains huge object trees. Since every load cycle re-fetches this
     * data from the DB, the caches never need to persist — clearing keeps the footprint minimal.
     */
    public void clearEntityCaches() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Called when the monitoring view leaves the UI (navigation away, tab close, session end).
     * Aborts any in-flight async load (bumping the generation so a late task can't repopulate a
     * dead view) and releases every cached entity, so the view and its object graph become
     * garbage-collectable.
     */
    public void onViewDetach() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Drops the cached Step-1 membership ids of a stage so the next column (re)build re-reads them
     * from jb_KanbanStageEntity. Must be called whenever a card's stage membership changes OUTSIDE a
     * full fillColumns cycle — e.g. after reject / reserve / hire / blacklist / convert / delete (each
     * sets KanbanStageEntity.finished=true) or a drag transfer. Without this, {@code rebuildColumn}
     * reloads the stale fill-cycle ids via the two-step loader and the just-actioned card reappears.
     * No-op for the first stage (it loads via the live anti-join query and is never cached here).
     */
    public void invalidateStageMembership(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== OPTIMIZED fillColumns =====================

    /**
     * OPTIMIZATION #1: Parallel stage loading + batch count + progressive rendering.
     * Before: Sequential loop (N*3 queries + 4 cache queries) = ~50 seconds
     * After: Parallel loading + batch count + parallel cache = ~8-12 seconds
     */
    /**
     * Fully async fillColumns — timer handler returns IMMEDIATELY (no UI lock blocking).
     * Data loads in background thread, then renders progressively via UI.access().
     * This eliminates "too long timer processing" completely.
     */
    public void fillColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Phase 2 (non-blocking): collect the already-loaded stage entities, then load the person
     * caches in parallel and merge them into the monitoring caches. Returns a {@link LoadResult}
     * (or null if a newer fillColumns has superseded this one). Runs on the WORKER pool; the
     * join() calls here are on already-completed futures, so they never actually block.
     */
    private CompletableFuture<LoadResult> loadCachesPhase(
            Map<KanbanStage, CompletableFuture<Collection<JbEntity<UUID>>>> stageFutures,
            Executor secExec, long currentGen, long startTime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Merges a batch cache result into the monitoring view's per-entity caches, which the card
     * builders read. Shared by the initial fill and by "load more" so both populate the caches the
     * same way. Called from a worker thread — the monitoring caches are concurrent maps.
     */
    private void mergeIntoMonitoringCaches(BatchCacheResult cacheResult,
                                           Map<KanbanStage, Collection<JbEntity<UUID>>> stageEntities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Phase 3+4: runs when the data pipeline settles. On success renders progressively on the UI
     * thread; on failure/timeout (or supersede) clears the loaders so columns never hang on the
     * 3-dot loader. Runs on a worker thread (success) or the timeout scheduler (timeout); it only
     * dispatches UI.access work and never touches the DB directly.
     */
    private void finishFill(LoadResult result, Throwable error,
                            UI ui, List<AbstractKanbanColumn> columns, long currentGen, long startTime,
                            @Nullable CountPlan countPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Clears the 3-dot loader from every column on the UI thread. Used on the failure/timeout
     * path so a stalled load never leaves columns stuck showing the loader forever.
     */
    private void disableLoadersSafely(UI ui, List<AbstractKanbanColumn> columns, long gen) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void renderColumn(AbstractKanbanColumn column, Map<KanbanStage, Collection<JbEntity<UUID>>> stageEntities,
                              KanbanBatchQueryService.CardDataCacheResult cardDataCache) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Everything the batch stage counts need, snapshotted on the UI thread so the COUNT queries
     * themselves can run on a worker. The first-stage count is pre-built down to the final JPQL +
     * parameter map because its transformer/condition pipeline reads loader-support state.
     */
    private record CountPlan(List<KanbanStage> nonFirstStages,
                             @Nullable KanbanStage firstStage,
                             List<String> extraWhere,
                             Map<String, Object> filterParams,
                             @Nullable Condition condition,
                             @Nullable String firstStageQuery,
                             @Nullable Map<String, Object> firstStageParams) {
    }

    /**
     * UI-thread half of the batch counts (OPTIMIZATION #2: one GROUP BY for non-first stages + one
     * query for the first stage — before that it was N individual COUNTs). Mirrors
     * getStageQueryTransformer so the count (denominator Y) respects the same active filter as the
     * loaded cards (numerator X). bindFilterByDepartment also resolves the vacancy-id filter, so it
     * must run before the paramFilterByDepartment() call below reads the resolved ids.
     */
    private CountPlan snapshotCountPlan(List<AbstractKanbanColumn> columns) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Worker-thread half: pure DB. Every input comes pre-snapshotted in the plan so nothing here
     * touches binders or view state.
     */
    private Map<UUID, Long> computeStageCounts(CountPlan plan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== LOAD CONFIGURATIONS =====================

    public LoadConfiguration typicalStageLoadConfig(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LoadConfiguration firstStageLoadConfig(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== TWO-STEP STAGE LOADING =====================

    /**
     * Step 1 of the two-step stage load: all kse entity_ids for a non-first stage, via the
     * (kanban_stage_id, tenant_id, finished, entity_id) covering index. Bounded by stage size and
     * cheap (ids only). Cached per fill cycle (cleared in fillColumns) so "load more" reuses it.
     */
    private List<UUID> stageEntityIds(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Snapshot of every filter source the stage loader applies — sidebar predicates (department /
     * responsible / query), their params, and the actualized generic-filter condition. The ordered-id
     * query (Step 2) must apply the IDENTICAL set, otherwise its pages drift from what the loader's
     * page query (Step 3) would return and columns show short pages.
     */
    private record ActiveFilter(List<String> extraWhere, Map<String, Object> params, Condition condition) {
        static final ActiveFilter EMPTY = new ActiveFilter(List.of(), Map.of(), null);
    }

    /**
     * Builds the filter snapshot. MUST run on the UI thread: bindFilterByDepartment reads
     * UserSettingsCache (IllegalConcurrentAccessException from a worker thread), and the other
     * binders read view state. fillColumns calls this once per cycle before dispatching async work.
     */
    private ActiveFilter snapshotActiveFilter(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Step 2 of the stage load: member ids that pass the active filters, ordered by fillDate in the
     * board's current sort direction ({@link #sortAscendingSnapshot}).
     * Cached per fill cycle so initial paging and "load more" reuse one id-only query per stage.
     */
    private List<UUID> orderedStageIds(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Loads one page of a stage. Non-first stages page in ID SPACE: membership (Step 1, cached) is
     * filtered and ordered by a light id-only query (Step 2, cached), and the loader's heavy
     * fetch-plan query receives ONLY the page's ids. Passing ALL member ids with
     * `ORDER BY fillDate LIMIT n` instead let the planner walk the fill_date index across the whole
     * table when a stage's members are old (25–56 s single queries on prod). The first stage keeps
     * its anti-join (NOT EXISTS) query unchanged — its members are the most recent applicants, so
     * the ordered-index walk finds a page quickly there.
     */
    private Collection<JbEntity<UUID>> loadStageEntities(KanbanStage stage, int limit, int offset) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Collection<JbEntity<UUID>> loadStageEntities(KanbanStage stage, int limit, Collection<UUID> skip) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== QUERY TRANSFORMERS =====================

    /**
     * kse-join stage query. Used for the SINGLE-entity rebuild check (e.id = :entityId), where the
     * join can't degenerate (no ORDER BY + LIMIT walk). The paginated LIST load uses the two-step
     * variant {@link #getStageQueryTransformerTwoStep} instead.
     */
    protected @NotNull QueryTransformer getStageQueryTransformer(String alias) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * TWO-STEP (perf) variant for the paginated stage LIST load: drives from the stage's pre-resolved
     * member ids (`e.id in :stageIds`, set per load from {@link #stageEntityIds}) instead of joining
     * jb_KanbanStageEntity. This stops ORDER BY fillDate + LIMIT from pushing the planner into a
     * per-applicant kse probe (the prod-hang degeneration). Generic-filter conditions are applied by
     * the loader on top and are unaffected.
     */
    protected @NotNull QueryTransformer getStageQueryTransformerTwoStep(String alias) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected @NotNull OrSupportedQueryTransformer getFirstStageQueryTransformer(String alias) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== COLUMN BUILDING =====================

    public KanbanColumn<? extends AbstractEntityCard<?>> handleGetColumn(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Keeps the header menu's bulk-load item honest: it offers exactly what is left in the stage,
     * capped at {@link #BULK_LOAD_SIZE}, and goes disabled once the column holds everything.
     * <p>
     * A missing count means the batch COUNT for this stage has not landed yet. The item then offers a
     * full page instead of claiming everything is shown — the same "assume there is more" rule
     * {@link #updateMoreBtnState} follows, and for the same reason: a count that is merely late must
     * not look like an empty stage.
     */
    private void updateBulkLoadItem(MenuItem item, KanbanStage stage, TrelloCardsContainer<?> cardsContainer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Re-labels one column's bulk-load menu item; no-op for a stage that has no column right now. */
    private void refreshBulkLoadItem(@Nullable KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sets the "data-has-more" attribute on the "more" button so the client-side scroll loader
     * (sortable-layout-loader.js) only re-shows the button while unloaded cards remain. When all
     * cards for the stage are already loaded the button is hidden and stays hidden.
     */
    private void updateMoreBtnState(KanbanStage stage, TrelloCardsContainer<?> cardsContainer, Div moreBtn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull TrelloCardsContainer<AbstractEntityCard<JbEntity<UUID>>> getCardsContainer(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== CARD CREATION (with lazy image loading) =====================

    @SuppressWarnings("unchecked")
    public AbstractEntityCard<JbEntity<UUID>> makeEntityCard(KanbanStage stage, JbEntity<UUID> entity, CardProperties properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull List<AbstractEntityCard<JbEntity<UUID>>> makeEntityCards(KanbanStage stage, Collection<JbEntity<UUID>> entities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull List<AbstractEntityCard<JbEntity<UUID>>> buildCardsFromCache(KanbanStage stage,
                                                                                  Collection<JbEntity<UUID>> entities,
                                                                                  KanbanBatchQueryService.CardDataCacheResult cardDataCache) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    private AbstractEntityCard<JbEntity<UUID>> makeEntityCardBatch(KanbanStage stage, JbEntity<UUID> entity,
                                                                   CardProperties properties,
                                                                   KanbanBatchQueryService.CardDataCacheResult cardDataCache,
                                                                   PersonCardDataService cardDataService) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== COUNT QUERIES =====================

    /**
     * OPTIMIZATION #7: Persistent count cache — don't clear after fillColumns.
     */
    private @NotNull Supplier<Number> getMaxSizeSupplier(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Shifts one stage's cached (filter-aware) total by {@code delta}, clamped at 0. Use this — never
     * {@code stageSizeCache.remove} — whenever a single card enters or leaves a stage outside a fill
     * cycle: the cache has no lazy recount behind it, so an evicted entry is a total that stays gone
     * until the next refresh, and the column header falls back to a bare card count.
     * <p>
     * A stage that has not been counted yet stays uncounted (computeIfPresent): absent must keep
     * meaning "count still in flight", which is what {@link #updateMoreBtnState} and
     * {@link #updateBulkLoadItem} read as "assume there is more".
     */
    private void adjustStageSize(@Nullable KanbanStage stage, long delta) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * {@link #adjustStageSize} for the mass actions: they move N cards at once, and only the
     * single-card drag-drop path ({@link #refreshStageSizeAndRebuildCard}) was shifting the cache.
     * Without this a mass transfer left every affected header showing its pre-transfer total, since
     * a column rebuild re-renders the cards but reads the total straight out of this cache.
     * <p>
     * Call BEFORE rebuilding the column — the rebuilt header reads the cache as it is built.
     */
    public void shiftStageSize(@Nullable KanbanStage stage, long delta) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // getFirstStageSize() lived here: absorbed into snapshotCountPlan (UI-thread JPQL build) +
    // computeStageCounts (worker-thread execution) so the COUNT no longer runs under the session lock.

    // getStageSize() lived here: a single-stage COUNT reachable only from getMaxSizeSupplier's old
    // fallback. Deleted with that fallback rather than left in place — an on-demand per-stage COUNT is
    // precisely what must not exist on the UI path, and batchCountNonFirstStages already covers the
    // counting. Restore it from git history if a genuinely off-UI-thread caller ever needs one.

    private String processQueryCondition(String entityName, String resultQuery,
                                         Condition condition, Map<String, Object> queryParameters) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    void collectAllConditionParams(Map<String, Object> params, Condition condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== CACHE LOADING =====================

    private void updateOneTimeCache(Collection<JbEntity<UUID>> entities, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void batchUpdateOneTimeCache(Map<KanbanStage, Collection<JbEntity<UUID>>> stageEntities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== EVENT HANDLERS =====================

    private void onItemsAddedListener(CardsAddedEvent<AbstractEntityCard<JbEntity<UUID>>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void refreshStageSizeAndRebuildCard(AbstractEntityCard<?> card, KanbanStage from, KanbanStage to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Runnable getCancelHandler(CardsAddedEvent<AbstractEntityCard<JbEntity<UUID>>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** The next page of a stage: the entities plus the card data needed to render them. */
    private record MoreCards(Collection<JbEntity<UUID>> entities,
                             KanbanBatchQueryService.CardDataCacheResult cardData) {
    }

    /**
     * Loads the next page of a column on the worker pool and appends the cards via {@code ui.access}.
     * <p>
     * This used to be {@code cardsContainer.addCardsAtBack(loadMoreCards(...))} straight inside the
     * click listener, i.e. two rounds of DB work — the stage page query and the five batch card-data
     * queries — on the uidl thread, holding the VaadinSession lock. The client-side scroll loader
     * presses this button, so simply scrolling a column froze the whole session for the duration.
     * Now the board stays responsive and the cards arrive when they arrive.
     * <p>
     * Composed with the {@code ...Async} variants rather than the blocking ones on purpose: this
     * runs ON the worker pool, and the blocking variants park a pool thread while their own subtasks
     * queue behind it on that same pool — the deadlock {@code fillColumns} is careful to avoid.
     *
     * @param limit page size — {@link Monitoring3#getMaxElements()} for the footer button and the
     *              scroll loader, {@link #BULK_LOAD_SIZE} for the header menu's bulk item
     */
    private void loadMoreCardsAsync(KanbanStage stage,
                                    KanbanColumn<AbstractEntityCard<JbEntity<UUID>>> kanbanColumn,
                                    TrelloCardsContainer<AbstractEntityCard<JbEntity<UUID>>> cardsContainer,
                                    Div moreBtn,
                                    int limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Worker-side half of {@link #loadMoreCardsAsync}: person caches + card data for one page. */
    private CompletableFuture<MoreCards> fetchMoreCardData(KanbanStage stage,
                                                           Collection<JbEntity<UUID>> entities,
                                                           Executor secExec) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== SELECTED ITEMS =====================

    public Map<JbEntity<UUID>, KanbanStage> handleSelectedItems() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== REBUILD CARD =====================

    public void rebuildOrRemoveCard(KanbanStage stage, UUID entityCardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== QUESTIONNAIRE & STATE EVENTS =====================

    public void handleQuestionnaireCompletedEvent(QuestionnaireEntityCompletedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addCardsWithNotification(KanbanColumn<?> column, Collection<JbEntity<UUID>> entities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void handleEntityStateChangeEvent(EntityStageChangedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== SETTINGS MENU =====================

    void buildSettingsMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== VACANCY SIDEBAR EVENTS =====================

    public void handleVacancySelectEvent(VacancySelectionEvent selectionEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void handleVacancyUnselectEvent(VacancyUnselectionEvent unselectEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== FILTER HELPERS =====================

    /**
     * Pre-resolve vacancy IDs matching ALL vacancy-related filters (department, category, branchType).
     * Vacancy table is small (~15K rows) — any filter on it is fast.
     * Result is cached for the current filter-apply cycle and reused across all 11 stage queries.
     * This avoids 478K applicant → vacancy → department JOIN in every stage query.
     */
    private void resolveFilteredVacancyIds() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void bindFilterByQuery(BiConsumer<String, String> transformer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void bindFilterByResponsible(Consumer<String> transformer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void bindFilterByDepartment(Consumer<String> transformer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, Object> paramFilterByQuery() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, Object> paramFilterByResponsible() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, Object> paramFilterByDepartment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // ===================== HELPERS =====================

    public Kanban getKanban() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isApplicantEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isVacancyEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

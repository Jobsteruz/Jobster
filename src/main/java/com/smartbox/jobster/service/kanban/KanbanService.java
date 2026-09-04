package com.smartbox.jobster.service.kanban;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.KanbanFetchPlanBuilder;
import com.smartbox.jobster.bean.query_transformer.JbQueryTransformerFactory;
import com.smartbox.jobster.bean.query_transformer.OrSupportedQueryTransformer;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.security.specific.UiFilterByDepartment2Enabled;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.service.restservices.applicant.managerDTOs.ApplicantFilterDTO;
import com.smartbox.jobster.view.monitoring.MonitoringUtils;
import io.jmix.core.*;
import io.jmix.core.entity.EntityValues;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.flowui.settings.UserSettingsCache;
import jakarta.persistence.Entity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class KanbanService {
    public static final String DEFAULT_QUERY = "select {E} from %s e where e.completed=true order by e.fillDate desc";

    @Autowired
    private Metadata metadata;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private QueryTransformerFactory queryTransformerFactory;
    @Autowired
    private KanbanFetchPlanBuilder kanbanFetchPlanBuilder;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @Autowired
    private JbQueryTransformerFactory jbQueryTransformerFactory;

    // Robot-only knob (getFirstStageEntitiesByInterval is called only from the robot pipeline):
    // first-stage robots re-scan every entity that matches the kanban query but never entered the
    // kanban — an unbounded, ever-growing set (tens of thousands of applicants per tenant in prod).
    // Entities created more than this many days ago are skipped; 0 restores the unbounded scan.
    @Value("${robot.scan.first-stage-window-days:30}")
    private int robotFirstStageWindowDays;

    // Per-column OR, not lower(concat(first,last,middle)): each branch must stay a plain lower(column)
    // so PostgreSQL can BitmapOr the pg_trgm GIN indexes (IDX_JB_APPLICANT/EMPLOYEE_*_TRGM); a concat
    // expression matches no index and forces a full scan. fullName is included so multi-word input
    // ("Aliyev Ali") can match the stored display name. Callers bind :search only when non-empty.
    public static final String PERSON_NAME_SEARCH_WHERE =
            "(lower(e.firstName) like concat('%', lower(:search), '%')" +
            " or lower(e.lastName) like concat('%', lower(:search), '%')" +
            " or lower(e.middleName) like concat('%', lower(:search), '%')" +
            " or lower(e.fullName) like concat('%', lower(:search), '%'))";

    public Kanban getKanban(UUID kanbanId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isFirstStage(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isLastStage(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStage getLastStage(Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Kanban getByCode(String tenantId, String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStage getByStageCode(String tenantId, String kanbanCode, String stageCode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // these query arguments must be provided: kanban
    public QueryTransformer getFirstStageEntityQueryTransformer(Kanban kanban, String responseValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public QueryTransformer getStageEntityQueryTransformer(String responseValue, String whereToSubquery) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getFirstStageEntities(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getStageEntities(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KeyValueEntity> getFirstStageEntityValues(KanbanStage stage, List<String> properties, @Nullable Integer offset,
                                                          @Nullable Integer limit, @Nullable String search, ApplicantFilterDTO filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KeyValueEntity> getStageEntityValues(KanbanStage stage, List<String> properties, @Nullable Integer offset,
                                                     @Nullable Integer limit, @Nullable String search, ApplicantFilterDTO filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // 'properties' = the entity attribute names to fetch (template columns plus any the caller always needs, e.g. the
    // mobile kanban DTO's id/photo/platform/name/fillDate). joinProperties() adds the "e." alias for the JPQL select;
    // the stripped names become the KeyValueEntity attribute keys the caller reads back.
    public List<KeyValueEntity> loadStageEntityValues(KanbanStage stage, List<String> properties, List<UUID> entityIds, @Nullable Integer offset,
                                                      @Nullable Integer limit, @Nullable String search, ApplicantFilterDTO filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getTemplateProperties(KanbanTemplate template) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String joinProperties(List<String> properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KanbanStage> getAllKanbanStages(Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<JbEntity<UUID>> getAllStageEntities(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param stages
     * @return all kanban stages entities that are referenced to the incoming stages param
     */
    @Nullable
    @Transactional(readOnly = true)
    public List<JbEntity<UUID>> getAllKanbanEntitiesByInterval(List<KanbanStage> stages, long seconds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "When did this entity become eligible for the kanban's first stage" — the FILL date, not the
     * row's creation date: a candidate row can be created long before the person actually fills the
     * questionnaire (imported lead, earlier application, bot contact), and the kanban itself selects
     * {@code completed=true} ordered by {@code fillDate}. Keying the scan on the creation date
     * silently hid every recently-filled-but-old row from the robots (measured on the prod copy:
     * 730 candidates).
     * <p>
     * No null-fillDate fallback, deliberately. Every {@code setCompleted(true)} site stamps
     * fillDate (PartnerIntegrationService's 1C sync and UserManagementDetailView were the last two gaps) and
     * changelog {@code 29-completed-entity-filldate-backfill} filled the historical rows, so
     * "completed implies fillDate" holds. An {@code or fillDate is null} branch would cost real
     * money: measured on jb_applicant it pushes the upper bound out of
     * {@code IDX_JB_APPLICANT_COMPLETED_FILL_DATE} into a post-scan filter — 4,847 block reads
     * instead of 59.
     * <p>
     * Also: plain comparisons rather than {@code coalesce(...)} because these strings are fed to
     * Jmix's {@code QueryTransformer}, whose parser did not survive a function expression here —
     * the whole robot scan threw and every run silently ended before the entity loop.
     */
    private static final String ELIGIBLE_SINCE_BEFORE = "e.fillDate <= :existingStageDate";
    private static final String ELIGIBLE_SINCE_AFTER = "e.fillDate >= :minEligibleDate";

    // kanbanStage must be the first stage when ordered by 'sort'
    @Transactional(readOnly = true)
    public List<JbEntity<UUID>> getFirstStageEntitiesByInterval(KanbanStage kanbanStage, long seconds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Lightweight scan row for the robot pipeline: entity id + its {@code fillDate} — the date it
     * became eligible for the kanban. That date feeds the adaptive no-match TTL for entities not
     * yet in a stage. No hydration.
     */
    public record KanbanEntityRef(UUID id, OffsetDateTime fillDate) {
    }

    /**
     * Id-only variant of {@link #getAllKanbanEntitiesByInterval}: same joins, same filters, same
     * first-stage window — but selects only {@code (id, fillDate)} scalars instead of hydrating
     * every entity. At prod volume most scanned entities are dropped by the robot caches right
     * after loading, so hydrating all of them per run was the dominant scan cost; the survivors
     * are hydrated afterwards via {@link #loadKanbanEntitiesByIds}.
     * <p>
     * The {@code deletedDate}/{@code tenantId} conditions are EXPLICIT because this is a values
     * query: unlike the entity load in the legacy variant it applies neither soft-delete filtering
     * nor (guaranteed) the tenant row-level policy — parity with the legacy scan is kept by hand.
     */
    @Nullable
    @Transactional(readOnly = true)
    public List<KanbanEntityRef> getAllKanbanEntityRefsByInterval(List<KanbanStage> stages, long seconds, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Java-side counterpart of {@link #ELIGIBLE_SINCE_BEFORE}. Defensive: a kanban over an entity
     * type without {@code fillDate} must degrade to a null date (minimal no-match TTL), never
     * abort the run.
     */
    @Nullable
    public static OffsetDateTime fillDate(Object entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static List<KanbanEntityRef> toEntityRefs(List<KeyValueEntity> rows) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Hydrates the kanban's entities by id (the robot scan's cache survivors). A plain entity
     * load, so tenant row-level security and soft-delete filtering apply exactly as they did when
     * the legacy scan hydrated everything up front.
     */
    @Transactional(readOnly = true)
    public List<JbEntity<UUID>> loadKanbanEntitiesByIds(Kanban kanban, List<UUID> ids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public KanbanStage getFirstStage(Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public KanbanStage getStageByStatus(Kanban kanban, PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KanbanStage> getNotHiddenStages(Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KanbanStage> getStagesWithIntervalActions() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Optional<Long> getFirstStageEntitiesSize(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Optional<Long> getStageEntitiesSize(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public StandardQuestionnaireEntity getFirstStageKanbanEntity(Kanban kanban, String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Kanban> getKanbanByEntityId(UUID entityId, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStage getKanbanStageByHHStage(HHStage stage, String tenantId, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

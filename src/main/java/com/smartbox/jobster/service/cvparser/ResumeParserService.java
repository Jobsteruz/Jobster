package com.smartbox.jobster.service.cvparser;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeeState;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.entity.core.PersonLanguage;
import com.smartbox.jobster.service.cvparser.batch.CvBatchAggregator;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.dto.CvParseAutoApplyMode;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobResponse;
import com.smartbox.jobster.service.cvparser.dto.CvParseJobStatus;
import com.smartbox.jobster.service.cvparser.dto.ParserWebhookPayload;
import com.smartbox.jobster.service.cvparser.dto.ResumeParserResponse;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.survey.sendsurvey.PersonType;
import io.jmix.core.DataManager;
import io.jmix.core.EntityEntry;
import io.jmix.core.EntityStates;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.core.entity.EntitySystemAccess;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
@ConditionalOnBean(CvParserUploader.class)
public class ResumeParserService {

    private static final Logger log = LoggerFactory.getLogger(ResumeParserService.class);

    // Stable error codes thrown from this service and matched by the REST controller
    // to produce the correct HTTP status + i18n message. Keep in sync with the controller.
    public static final String ERR_ALREADY_PARSING = "already_parsing";
    public static final String ERR_JOB_NOT_FOUND = "job_not_found";
    public static final String ERR_JOB_NOT_READY = "job_not_ready";
    public static final String ERR_NO_PARSED_DATA = "no_parsed_data";
    public static final String ERR_APPLICANT_MISMATCH = "applicant_mismatch";
    public static final String ERR_EMPLOYEE_MISMATCH = "employee_mismatch";
    public static final String ERR_APPLICANT_NOT_ACCESSIBLE = "applicant_not_accessible";
    public static final String ERR_EMPLOYEE_NOT_ACCESSIBLE = "employee_not_accessible";
    /** Batch id on the child job does not match the batch handed to auto-apply. */
    public static final String ERR_BATCH_MISMATCH = "batch_mismatch";

    // Fetch plans that reach the person-category two hops away from the batch's target reference.
    // Needed because dataManager.getReference() yields an unfetched instance — touching
    // getDepartment() on it throws "Cannot get unfetched attribute".
    private static final String FP_VACANCY_DEPARTMENT_CATEGORY = "vacancy-department-category";
    private static final String FP_DEPARTMENT_PERSON_CATEGORY = "department-person-category";

    private final CvParseJobStore jobStore;
    private final CvParserUploader uploader;
    private final CvParserPersonMapper mapper;
    private final CvParserRefDataLoader refDataLoader;
    private final DataManager dataManager;
    private final FileStorage fileStorage;
    private final TenantProvider tenantProvider;
    private final EntityStates entityStates;
    private final TimeSource timeSource;
    private final EmployeeService employeeService;
    private final SystemAuthenticator systemAuthenticator;

    /**
     * Lazy provider for {@link CvBatchAggregator} to break the circular dependency: the aggregator
     * depends on this service for {@link #autoApplyBatchFields(String, CvParseBatch)}, but the
     * webhook path here needs the aggregator to notify on child terminal states.
     * {@link ObjectProvider#getIfAvailable()} yields {@code null} when the batch module is absent
     * (e.g. if ever disabled conditionally) — the single-flow is unaffected.
     */
    private final ObjectProvider<CvBatchAggregator> batchAggregatorProvider;

    @Autowired
    public ResumeParserService(CvParseJobStore jobStore,
                               CvParserUploader uploader,
                               CvParserPersonMapper mapper,
                               CvParserRefDataLoader refDataLoader,
                               DataManager dataManager,
                               FileStorage fileStorage,
                               TenantProvider tenantProvider,
                               EntityStates entityStates,
                               TimeSource timeSource,
                               EmployeeService employeeService,
                               SystemAuthenticator systemAuthenticator,
                               @Lazy ObjectProvider<CvBatchAggregator> batchAggregatorProvider) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CvParseJobResponse startJob(UUID applicantId, String filename, byte[] fileContent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Start a V2 parse job for either an {@link Applicant} or {@link Employee}. The {@code
     * personId} is stored on the job and used at apply-time to load / reconcile the target
     * entity. Callers must already own the person (tenant isolation is asserted again at apply).
     */
    public CvParseJobResponse startJob(UUID personId, String filename, byte[] fileContent,
                                       PersonType personType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Optional<String> loadPersonTenant(UUID personId, PersonType personType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Start a V2 parse job in headless bot mode — no UI reviews the result, the webhook handler
     * auto-applies empty Applicant fields once parsing completes. Used by the Telegram
     * questionnaire bot flow where the candidate has uploaded a CV as an answer; the job fills
     * only the fields the candidate left blank.
     * <p>
     * Tenant and principal are passed in explicitly because the caller runs on a RabbitMQ
     * consumer thread without the Vaadin user context — {@link TenantProvider} would return the
     * listener's bean-time tenant, not the applicant's.
     *
     * @param applicantId       target Applicant id (must already be persisted)
     * @param filename          original CV filename for logs + parser metadata
     * @param fileContent       raw bytes read from the file storage
     * @param tenantId          tenant owning the applicant
     * @param principalName     principal used by {@link CvParserUploader} to run the upload under
     *                          {@link SystemAuthenticator#runWithUser(String, Runnable)}; may be
     *                          null in which case the uploader runs without user context
     * @param preExistingCvFile optional reference to a CV file the caller already persisted (e.g.
     *                          the Telegram bot path reads bytes from a {@code QuestionAnswer.file}
     *                          that's already in storage). When non-null the uploader skips
     *                          re-saving and uses this ref directly for the {@code RESUME}
     *                          {@code PersonDocument} attachment, avoiding duplicate copies of
     *                          the same bytes.
     */
    public CvParseJobResponse startJobForBot(UUID applicantId,
                                             String filename,
                                             byte[] fileContent,
                                             String tenantId,
                                             String principalName,
                                             FileRef preExistingCvFile) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Register a batch-owned child job and do <strong>not</strong> trigger the upload here —
     * batch uploads are pushed through {@code CvBatchChildUploader} which uses a separate,
     * 4-thread executor to stay polite toward the parser's internal RabbitMQ workers.
     * <p>
     * The caller (orchestrator) supplies tenant and principal explicitly because it runs under
     * {@code SystemAuthenticator.runWithUser(principal, ...)} and cannot rely on
     * {@link SecurityContextHolder}.
     *
     * @param applicantId   placeholder id (will become the new Applicant's id on apply)
     * @param filename      sanitized entry name for logs + parser metadata
     * @param batchId       owning batch id — must be non-null
     * @param tenantId      batch tenant; pinned so asynchronous paths never look up the current user
     * @param principalName principal that initiated the batch; used by the uploader for
     *                      {@code systemAuthenticator.runWithUser}
     * @return the created job for the orchestrator to hand to the uploader
     */
    public CvParseJob registerBatchChildJob(UUID personId,
                                            String filename,
                                            String batchId,
                                            String tenantId,
                                            String principalName,
                                            PersonType personType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public CvParseJobResponse getStatus(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public CvParseJob getJob(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void handleWebhook(String jobId, ParserWebhookPayload payload) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void doHandleWebhook(String jobId, ParserWebhookPayload payload) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Runs after the webhook stores parsed data successfully. For bot-initiated jobs
     * ({@link CvParseAutoApplyMode#EMPTY_ONLY}), auto-fills empty Applicant fields so the
     * candidate does not need to come back to a UI. Dialog-driven jobs
     * ({@link CvParseAutoApplyMode#NONE}) are unaffected — the user still picks fields.
     * <p>
     * Skipped when the job has no principal name: {@link #applyFieldsToApplicant} requires a
     * tenant-bound principal to pass {@link #assertSameTenant}, and {@code runWithSystem} has
     * no current tenant. The parsed data stays on the job so an admin can still apply it
     * manually from the V2 dialog.
     * <p>
     * Errors are caught and logged: the webhook must always return 2xx so the parser does not
     * re-deliver indefinitely, and a failed auto-apply should not corrupt the COMPLETED state
     * of the job.
     */
    private void autoApplyIfRequested(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyEmptyFieldsToApplicantInternal(CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Adds {@code experiences}/{@code educations}/{@code languages} to {@code fields} when the
     * applicant has no existing rows for that collection AND the parser returned at least one
     * entry. Collections are not direct fields on {@link Applicant} — they live in separate
     * entities keyed by {@code personEntity + personId}, so we query directly.
     */
    private void addEmptyCollectionFields(Applicant applicant, ResumeParserResponse parsed,
                                          Set<String> fields) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T> boolean hasAnyPersonRow(Class<T> rowType, String jpqlName,
                                        String entityName, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * After a job reaches a terminal state, hand control to the batch aggregator if this job
     * belongs to a batch. Uses the {@code job} loaded at the top of the webhook handler to skip
     * a Hazelcast round-trip in the single-flow case (no batch id) — we only reload when the
     * aggregator is about to run so it sees the status just written by {@code setError} /
     * {@code setParsedData}. Any throw from the aggregator is caught here: webhook delivery
     * must remain idempotent regardless of downstream failures.
     */
    private void notifyBatchAggregatorIfNeeded(CvParseJob precheck) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Apply parsed CV fields to an already-persisted applicant and save the changes together
     * with any new collection entries (experiences / educations / languages) atomically.
     */
    @Transactional
    public void applyFieldsToApplicant(String jobId, Set<String> fields) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Apply parsed CV fields to an already-persisted employee. Mirrors
     * {@link #applyFieldsToApplicant} for the Employee V2 pipeline.
     */
    @Transactional
    public void applyFieldsToEmployee(String jobId, Set<String> fields) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Auto-apply every parsed field for a batch child job and persist a brand-new Person
     * ({@link Applicant} or {@link Employee}, per {@code batch.personType}). Called by
     * {@link CvBatchAggregator} after the webhook marks the child job
     * {@link CvParseJobStatus#COMPLETED}.
     * <p>
     * Security: the caller must have already established the batch principal via
     * {@code SystemAuthenticator.runWithUser(...)} — the aggregator is responsible for that. This
     * method still verifies tenant alignment defensively.
     *
     * @param jobId job id of the completed child
     * @param batch the owning batch aggregate (drives personType + target refs)
     * @return the newly saved person
     */
    @Transactional
    public Person autoApplyBatchFields(String jobId, CvParseBatch batch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Applicant autoApplyApplicantBatch(CvParseJob job, CvParseBatch batch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Employee autoApplyEmployeeBatch(CvParseJob job, CvParseBatch batch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Link the new applicant to the batch vacancy and inherit the vacancy department's person
     * category — the rule every other applicant-creation path applies (manual UI, HH, ISHGO,
     * mass division, questionnaire).
     * <p>
     * The vacancy is loaded with {@code vacancy-department-category} instead of
     * {@code getReference} because the category lives two hops away and an unfetched reference
     * throws on {@code getDepartment()}. The load also skips the {@code @PostConstruct} code
     * sequence lookup that {@code getReference} pays on every {@code SmartTenantEntity}.
     */
    private void applyVacancyAndCategory(Applicant applicant, UUID vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Resolve the responsible {@link Employee} for a batch given the user id chosen in the dialog.
     * <p>
     * Only swallows the expected "no visible row" outcome ({@link AccessDeniedException} — the
     * principal may legitimately lack read access to another tenant's user). Infrastructure
     * errors (DB down, Hazelcast down) propagate so the aggregator records {@code applyFailed}
     * instead of quietly creating an applicant without a responsible.
     */
    private Optional<Employee> resolveResponsibleEmployee(UUID responsibleUserId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Apply parsed CV fields for the V2 dialog, creating the applicant when it does not exist yet
     * and updating it when it does. Everything — the applicant, the parsed collections, the
     * resume document and the chosen vacancy — lands in this one transaction.
     * <p>
     * Create-vs-update is decided from the <b>database</b>, deliberately not from
     * {@link EntityStates#isNew(Object)}. A rolled-back save leaves the caller's instance
     * reporting {@code isNew() == false} even though nothing was written: Jmix's
     * {@code EclipselinkPersistenceSupport.afterCompletion} calls {@code makeDetached()} on every
     * registered instance when the transaction fails, and only restores the flag for instances
     * that were explicitly detached during it. Routing on that flag sent every retry after a
     * first failure into a hard {@code IllegalArgumentException}, so the recruiter could never
     * recover without reopening the dialog.
     *
     * @param target    the caller's in-memory applicant, used only when no row exists yet
     * @param vacancyId vacancy picked in the dialog, or {@code null} when the applicant already
     *                  carried one
     * @return the saved applicant when it was created here, {@code null} when an existing row was
     *         updated — the dialog uses this to decide whether the caller view must switch out of
     *         create mode
     */
    @Transactional
    public Applicant applyFieldsOrCreateApplicant(String jobId, Set<String> fields,
                                                  Applicant target, UUID vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Re-mark an entity as unsaved after a rolled-back save attempt left it flagged as persisted
     * (see {@link #applyFieldsOrCreateApplicant} for why that happens). Without this the retry
     * would skip the create-time initializers in {@link #applyAndPersistApplicant} and go down
     * the merge path instead of the insert path. Callers must have established that no row
     * exists; the call is a no-op for an instance that is still correctly marked new.
     */
    private void restoreNewState(Object entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Apply parsed CV fields to an unsaved employee and persist it together with all parsed
     * collections in a single atomic save. Employee sibling of
     * {@link #applyFieldsOrCreateApplicant}.
     *
     * @param departmentId optional — when non-null the saved Employee is linked to the
     *                     department via a new {@code StaffingTable} row within the same
     *                     transaction.
     * @throws IllegalArgumentException if a row already exists for the job's person; use
     *                                  {@link #applyFieldsToEmployee} instead
     */
    @Transactional
    public Employee applyAndSaveEmployeeForCreate(String jobId, Set<String> fields,
                                                  Employee target, UUID departmentId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Applicant applyAndPersistApplicant(Applicant applicant, CvParseJob job, Set<String> fields,
                                               Platform newPlatform, boolean newCompleted) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Employee applyAndPersistEmployee(Employee employee, CvParseJob job, Set<String> fields,
                                             UUID departmentId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Common apply-and-save pipeline for both Applicant and Employee create/edit flows. Mutates
     * the person in place (scalar fields, photo, education/experience refs) and prepares the
     * {@link SaveContext} with the person + any parsed collection entries. The uploaded photo
     * (if any) is deleted from the file storage if the enclosing transaction rolls back.
     */
    private SaveContext buildSaveContext(Person person, CvParseJob job, Set<String> fields) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Attach the original CV as a {@code RESUME} {@link PersonDocument} on the same atomic save.
     * Runs unconditionally — independent of the field-selection set — because recruiters expect
     * to download the source CV regardless of which scalar fields they chose to apply. No-op when
     * the uploader couldn't persist the file (best-effort, see {@link CvFilePersister}).
     */
    private void attachResumeDocument(SaveContext saveContext, Person person, CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CvParseJob requireCompletedJob(String jobId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Deletes the supplied {@link FileRef} from the file storage if the enclosing transaction
     * rolls back, preventing orphaned blobs when the photo upload succeeds but the subsequent
     * DB save fails.
     */
    private void registerPhotoRollback(FileRef fileRef) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void assertSameTenant(CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String currentPrincipal() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

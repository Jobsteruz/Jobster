package com.smartbox.jobster.service.kanban;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.entity.robot.RobotKanbanStageHistory;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.robot.preload.RobotPreloadData;
import com.smartbox.jobster.service.robot.preload.RobotPreloadHolder;
import com.smartbox.jobster.view.reports.branch_processing.BranchProcStageEntitiesDto;
import com.smartbox.jobster.view.reports.branch_processing.BranchProcSummaryDto;
import com.smartbox.jobster.view.reports.candidate_processing.CandidateProcessingFilter;
import com.smartbox.jobster.view.reports.candidate_processing.EmpProcStageEntitiesDto;
import com.smartbox.jobster.view.reports.candidate_processing.UserProcessedEntitiesDto;
import com.smartbox.jobster.view.reports.stage_entity_movement.applicant_movement.ApplicantMovementDto;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.EntityStates;
import io.jmix.core.FluentValueLoader;
import io.jmix.core.FluentValuesLoader;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static com.smartbox.jobster.service.kanban.KanbanService.DEFAULT_QUERY;

/**
 * @author Jobster team
 * date: 02/07/24 18:38
 */
@Service
public class KanbanStageHistoryService {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private QueryTransformerFactory queryTransformerFactory;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private DepartmentService departmentService;


    @Transactional(readOnly = true)
    public KanbanStageHistory getByEvent(Event event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KanbanStageHistory> getKanbanStageHistories(Kanban kanban, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<KanbanStageHistory> getHistoriesByEntityId(UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public KanbanStageHistory getLastHistory(String entityName, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The newest {@link KanbanStageHistory} of each entity — what the "stage / comment" columns of
     * the candidate and employee list grids show, batch-loaded once per grid page.
     * <p>
     * The newest row is read directly instead of through {@code KanbanStageEntity.stageHistory}:
     * that link is only repointed by some of the stage actions, so on the Aug-2026 prod copy it
     * carried a stale date for 2 006 of 2 008 accepted candidates (and a stale comment for 75) —
     * the column would show a transition the recruiter had already superseded. Taking one row per
     * entity also guarantees the stage and the comment come from the SAME transition.
     * <p>
     * {@code kanban} narrows the search when the view knows its board (a person can sit on two
     * boards at once). It has to narrow the correlated subquery as well: otherwise a newer
     * transition on the OTHER board suppresses this board's newest row and the entity drops out of
     * the result entirely.
     *
     * @return entity id -&gt; newest history; entities without any history are absent from the map
     */
    @Transactional(readOnly = true)
    public Map<UUID, KanbanStageHistory> lastHistories(@Nullable Kanban kanban, String entityName, Collection<UUID> entityIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Two transitions can share the same {@code date} (a robot moving a batch stamps them from one
     * clock read), and then {@code not exists(date &gt; ...)} keeps both. Pick the row written last
     * so the column does not flip between reloads.
     */
    private static KanbanStageHistory lastWritten(KanbanStageHistory a, KanbanStageHistory b) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "employee_processed_entities_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictEmpProcessedEntities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Transactional(readOnly = true)
    @Cacheable(value = "employee_processed_entities_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Long countEmpProcessedEntities(EmpProcStageEntitiesDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "branch_processed_entities_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictBranchProcessedEntities() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Filiallar bo'yicha voronka uchun: berilgan branch (Department, type=BRANCH) va etap (KanbanStage)
     * kesimida kandidatlar sonini qaytaradi.
     * <p>
     * MUHIM:
     * <ul>
     *   <li>Filial qatori o'zining <b>butun subtree'sidagi</b> arizalarni sanaydi (roll-up):
     *       filialning o'zi + ostidagi barcha child DEPARTMENT/BRANCH lar. Subtree <b>PARENT
     *       reference orqali</b> quriladi ({@link DepartmentService#getSubtreeDepartmentIds}), so'ng
     *       {@code vacancy.department.id in (...)} bilan sanaladi — hierarchicalKey LIKE EMAS.
     *       Sabab: hierarchicalKey materialized-path buzilishi/eskirishi mumkin va
     *       {@code like 'key%'} subtree'dan kandidatlarni yo'qotardi (undercount).
     *       (type=BRANCH cheklovi faqat <b>qatorlar</b> uchun — XML loaderda; sanashda emas.)</li>
     *   <li>Har bir etap uchun KanbanStageHistory bo'yicha shu etapga ko'chirilgan <b>(entityId, user)
     *       juftliklari</b> sanaladi (distinct entityId emas — bir kartochkani N xodim ko'chirsa N marta,
     *       xuddi "Экран обработки кандидатов" xodimlar bo'yicha yig'indisidek). "Новые" (first stage)
     *       uchun bunga <b>qo'shimcha</b> ravishda {@code completed} + {@code fillDate} yangi arizalar ham
     *       qo'shiladi — ya'ni {@link #countEmpProcessedEntities} bilan AYNAN mos (yangi + ko'chirilgan).</li>
     * </ul>
     */
    @UseReplica
    @Transactional(readOnly = true)
    @Cacheable(value = "branch_processed_entities_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Long countBranchProcessedEntities(BranchProcStageEntitiesDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "branch_processed_by_status", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictBranchProcessedByStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "Отчёт по филиалам" oxirgi ustunlari (Отказ/Резерв) uchun: filial (subtree) + status
     * (REJECTED yoki RESERVED) kesimida kandidatlar soni. Bu {@link #getUserProcessedCandidates}
     * ning filial varianti — u xodim bo'yicha distinct entityId sanaydi va yig'adi, shu sabab
     * "Экран обработки" bilan AYNAN mos bo'lishi uchun distinct (entityId, user) juftliklarini
     * sanaymiz. Subtree PARENT reference orqali quriladi (hierarchicalKey EMAS).
     */
    @UseReplica
    @Transactional(readOnly = true)
    @Cacheable(value = "branch_processed_by_status", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Long countBranchProcessedByStatus(BranchProcSummaryDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "branch_hired_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictBranchHired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "Отчёт по филиалам" oxirgi "Hire" ustuni uchun: filial (subtree) bo'yicha ishga olinganlar
     * (jb_Employee) soni. ReportService.getHiredEmployeesCount ning filial varianti — createdBy
     * (xodim) o'rniga filial subtree bo'yicha. Employee noyob (bitta createdBy), shu sabab oddiy
     * distinct — juftliklar KERAK EMAS.
     */
    @UseReplica
    @Transactional(readOnly = true)
    @Cacheable(value = "branch_hired_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Long countBranchHired(BranchProcSummaryDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "user_processed_entities_by_status", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictUserProcessedCandidates() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "user_processed_entities_by_status", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long getUserProcessedCandidates(UserProcessedEntitiesDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * KanbanStageHistory ustidagi so'rovga kandidat (Applicant) filtrlarini qo'shadi.
     * <p>
     * Join AYNAN BIR MARTA qo'shiladi: {@code addJoinAndWhere} ni har bir shart uchun chaqirish
     * {@code join jb_Applicant a} ni takrorlab, so'rovni buzardi — shu sabab avval bo'sh
     * {@code addJoin}, keyin shartlar alohida {@code addWhere} bilan qo'yiladi.
     */
    private void addApplicantFilters(QueryTransformer transformer, CandidateProcessingFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "stages_entity_count_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void stagesCountCacheEvict(ApplicantMovementDto reportDto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "stages_entity_count_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    @Transactional(readOnly = true)
    public Map<KanbanStage, Long> getStagesCount(ApplicantMovementDto dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public KanbanStage currentStage(Kanban kanban, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public KanbanStage currentStage(Kanban kanban, UUID entityId, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Map<UUID, KanbanStage> currentStages(Kanban kanban, List<UUID> entityIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Map<UUID, PersonStatus> currentStageHistoryStatuses(Kanban kanban, List<UUID> ids) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Transactional(readOnly = true)
    public PersonStatus currentStageHistoryStatus(Kanban kanban, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public boolean isReviewedStageEntity(Kanban kanban, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCountStageHistory(LocalDate fromDate, LocalDate toDate, Kanban kanban, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "countStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long countStageHistory(LocalDate fromDate, LocalDate toDate, Kanban kanban, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<RobotKanbanStageHistory> getByStageHistory(KanbanStageHistory stageHistory) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Batched {@link #getByStageHistory} — one query for a whole stage-history list. */
    public Map<UUID, List<RobotKanbanStageHistory>> getByStageHistories(Collection<KanbanStageHistory> stageHistories) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public LocalDate getTransDateByStageHistory(Applicant applicant, KanbanStage kanbanStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public LocalDate getTransDateByStageHistory(Employee employee, KanbanStage kanbanStage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public Long getApplicantCountByRequest(KanbanStage stage, UUID requestId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public KanbanStageHistory getStageHistoryByStage(KanbanStage stage, UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
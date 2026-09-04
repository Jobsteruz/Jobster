package com.smartbox.jobster.service.person;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.Gender;
import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.view.message.MessageDetailView;
import com.smartbox.jobster.view.message.SendMessageFilter;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.chartsflowui.data.item.MapDataItem;
import io.jmix.chartsflowui.kit.data.chart.ListChartItems;
import io.jmix.core.*;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.flowui.view.ViewRegistry;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.apache.coyote.BadRequestException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Array;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Since: 3/9/2024 6:22 PM
 */
@Service
public class ApplicantService {
    private static final Logger log = LogManager.getLogger(ApplicantService.class);

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private QueryTransformerFactory queryTransformerFactory;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private VacancyService vacancyService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private FileService fileService;
    @Autowired
    private EducationService educationService;
    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private LanguageService languageService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private RefSourceService refSourceService;
    @Autowired
    private ViewRegistry viewRegistry;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;

    @PersistenceContext
    private EntityManager entityManager;

    @Value("${app.url}")
    private String appUrl;


    public Applicant getOrCreateByTgUser(TgUser tgUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Applicant getOrCreateByWhatsappUser(WhatsappUser whatsappUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getApplicantManager(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Creates a new applicant object from the applicant json
     *
     * @param json A applicant json
     * @throws JSONException       If the <code>@RequestBody</code> does not meet the requirement
     * @throws BadRequestException If the <code>@RequestBody</code> does not meet the requirement
     */
    public void saveExtensionApplicant(String json) throws Exception {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Applicant save bo'lganidan keyin <code>Experience</code>, <code>Educations</code> va <code>Languages</code>
     * objectlarini yaratadi
     *
     * @param jsonObject Applicant json
     */
    private SaveContext saveOtherEntities(JSONObject jsonObject, Applicant applicant) throws JSONException {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Agar resume file invalid bo'lmasa <code>PersonDocument</code> entity yaratadi
     *
     * @param resumeBase64 Applicant Resume Base64 in HH
     */
    private PersonDocument savePersonDocument(String resumeBase64, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Experience va Educationlarni bitta method orqali yaratish
     *
     * @param jsonArray experience or education array
     * @param clazz     <code>PersonExperience.class</code> or <code>PersonEducation.class</code>
     */
    private List<PersonHistory> saveApplicantHistory(JSONArray jsonArray, Class<? extends PersonHistory> clazz,
                                                     Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Agar Language bor bo'lsa shuni set qiladi, aks holda yangi yaratadi
     *
     * @param languageArray Applicant languages array json
     */
    private List<PersonLanguage> saveApplicantLanguage(JSONArray languageArray, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Experience yoki Educationni hamma fieldlarini set qilib beradi
     *
     * @param jsonObject    experience or education json
     * @param personHistory Experience or Education entity
     * @param <T>           Experience or Education entity
     * @return An Entity with all fields set
     */
    private <T extends PersonHistory> T makeApplicantHistory(JSONObject jsonObject, T personHistory, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Agar experience bor bo'lsa shuni set qiladi, aks holda yangi yaratadi
     *
     * @param experienceName Applcant experience
     */
    private void setExperience(String experienceName, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Agar education bor bo'lsa shuni set qiladi, aks holda yangi yaratadi
     *
     * @param educationName Applicant education
     */
    private void setEducation(String educationName, Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public long countCompleted(Bot bot, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public long countStarted(Bot bot, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countFirstStageApplicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCountFirstStageApplicantsByResponsible(Employee responsible, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "countFirstStageApplicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long countFirstStageApplicantsByResponsible(Employee responsible, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countStageApplicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCountStageApplicantsByResponsible(Employee responsible, Kanban kanban, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "countStageApplicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long countStageApplicantsByResponsible(Employee responsible, Kanban kanban, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "hiredApplicantByPos", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictHiredApplicantByPos(String tenantId, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "hiredApplicantByPos", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public ListChartItems<MapDataItem> getHiredApplicantByPos(String tenantId, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private record HiredByPosCounts(Map<UUID, Long> all, Map<UUID, Long> hired) {
    }

    private HiredByPosCounts loadHiredByPosCounts(OffsetDateTime fromDate, OffsetDateTime toDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "hiredApplicantByPos", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<Map<String, Object>> getHiredApplicantByPosForApi(String tenantId, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "refusedCandidateStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRefusedCandidateStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "refusedCandidateStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long getRefusedCandidateStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "refusedCompanyStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRefusedCompanyStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "refusedCompanyStageHistory", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long getRefusedCompanyStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getAllTgUserId(Set<Department> branches, Set<Position> positions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings({"unchecked"})
    @Transactional(readOnly = true)
    public Set<MessageDetailView.TgUserDTO> getAllTgUserIdForSendMessage(SendMessageFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setBotsToNativeQr(Set<UUID> bots, Query query) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setArrayToNativeQuery(UUID[] ids, Query query, String param) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<KeyValueEntity> getAllEmailsForSendMessage(SendMessageFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<KeyValueEntity> getAllPhonesForSendMessage(SendMessageFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "getRejectReason", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRejectReason(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "getRejectReason", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public CancelReason getRejectReason(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Batch versiyasi: berilgan applicant id lar uchun reject reason larni jami 2 ta query da qaytaradi
     * (1: applicantId->cancelReasonId juftliklari, 2: CancelReason larni instance-name bilan yuklash).
     * List view grid renderer dagi per-row N+1 ni bartaraf etadi.
     */
    public Map<UUID, CancelReason> getRejectReasonsByApplicantIds(Collection<UUID> applicantIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Long countVacancyApplicants(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Counts each vacancy's applicants that are currently active in the specified applicant kanban.
     */
    public Map<UUID, Long> countVacancyApplicantsInKanbanBatch(List<UUID> vacancyIds, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The active applicant boards, in menu order — the monitoring screens a candidate can sit on.
     */
    public List<Kanban> getActiveApplicantKanbans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Counts each vacancy's applicants that are currently sitting on any active applicant board —
     * the "candidates in monitoring" number of the vacancy list.
     */
    public Map<UUID, Long> countVacancyApplicantsInMonitoringBatch(Collection<UUID> vacancyIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The board to open when jumping from a vacancy to monitoring: the active applicant board that
     * currently holds most of the vacancy's candidates, falling back to the first active applicant
     * board when the vacancy has none anywhere.
     */
    public Kanban resolveMonitoringKanban(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, Long> countVacancyApplicantsByKanbanId(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Returns the active applicant-kanbans with the number of the vacancy's applicants currently in each one.
     */
    public List<KeyValueEntity> countVacancyApplicantsByKanban(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<KeyValueEntity> countApplicantsByStatusAndVacancy(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Batch: count applicants for multiple vacancies in ONE query.
     * Returns vacancyId → count map.
     */
    public Map<UUID, Long> countVacancyApplicantsBatch(List<UUID> vacancyIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Batch: count applicants by status for multiple vacancies in ONE query.
     * Returns vacancyId → {status → count} map.
     */
    public Map<UUID, Map<String, Long>> countApplicantsByStatusAndVacancyBatch(List<UUID> vacancyIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean existById(UUID entityId, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Applicant getApplicantById(UUID entityId, String tenant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String generateApplicantInfoUrl(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

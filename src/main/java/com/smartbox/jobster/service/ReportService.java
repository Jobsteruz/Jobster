package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.JobsterQueryTransformer;
import com.smartbox.jobster.config.replica.UseReplica;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.report.ReportGroup;
import com.smartbox.jobster.entity.report.ReportKanbanStage;
import com.smartbox.jobster.entity.report.ReportRole;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.applicantsbyresponsiblereport.ApplicantsByResponsibleDTO;
import com.smartbox.jobster.view.employeepipelinereport.EmployeePipelineDTO;
import com.smartbox.jobster.view.reports.averageprocessingtimereport.AverageProcessingTimeDTO;
import com.smartbox.jobster.view.reports.candidate_processing.CandidateProcessingFilter;
import com.smartbox.jobster.view.reports.candidateclosureanalyticsreport.CandidateClosureFilter;
import com.smartbox.jobster.view.reports.closerequestbystatusreport.CloseRequestByStatusDTO;
import com.smartbox.jobster.view.reports.closerequestbystatusreportv2.CloseRequestByStatusDTOv2;
import com.smartbox.jobster.view.reports.conversionandvacancyofrecruiterreport.ConversionAndVacancyReportDTO;
import com.smartbox.jobster.view.reports.hiringreport.HiringReportDTO;
import com.smartbox.jobster.view.reports.monitoringbyemployees.EmployeeDTO;
import com.smartbox.jobster.view.reports.monitoringbyemployees.FilterItem;
import com.smartbox.jobster.view.reports.monitoringbyemployees.MonitoringByEmployeesFilter;
import com.smartbox.jobster.view.reports.recruitmentanddismissal.RecruitmentAndDismissalDTO;
import com.smartbox.jobster.view.reports.rejectionbystagesreport.RejectionByStagesDTO;
import com.smartbox.jobster.view.reports.requestauthorstatistics.RequestAuthorDTO;
import com.smartbox.jobster.view.reports.reviewedapplicants.ReviewedApplicantsReportDTO;
import io.jmix.chartsflowui.data.item.MapDataItem;
import io.jmix.chartsflowui.kit.data.chart.ListChartItems;
import io.jmix.core.*;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.flowui.model.KeyValueCollectionLoader;
import io.jmix.reports.entity.Report;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Since: 6/20/2024 5:04 PM
 */
@Service
@RequiredArgsConstructor
@UseReplica
public class ReportService {
    private static final UUID STATIC_UUID = UUID.fromString("af7c1fe6-d669-414e-b066-e9733f0de7a8");
    public static final UUID HIRED_STAGE_ID = UUID.fromString("00000000-0000-0000-0000-000000000001");
    public static final long CACHE_TTL_SECONDS = Duration.ofDays(1).toSeconds();

    private final DataManager dataManager;
    private final Messages messages;
    private final QueryTransformerFactory queryTransformerFactory;
    private final EntityService entityService;
    private final KanbanService kanbanService;
    private final UiFilterSettings uiFilterSettings;
    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Report> secReports(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<Report> secDefaultReports() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Report getReportByCode(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<ReportView> getReports(ReportGroup group) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<ReportView> getDashboardViews(RoleType roleType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<KeyValueEntity> getDashboardReports(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<ReportKanbanStage> getReportStages(ReportView report) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public ReportView getByCRCId(String crcId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<ReportView> getFavorites() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "applicant-stage-date-reports-cache", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void applicantStageDateCacheEvict() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "applicant-stage-date-reports-cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    @Transactional(readOnly = true)
    public Map<String, OffsetDateTime> getApplicantsStageDates(List<UUID> stageIds, List<UUID> applicantIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "positionRecruiterChart", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictPositionRecruiterChart(Employee employee, List<RoleType> roleTypes, Position position, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "positionRecruiterChart", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> positionRecruiterChart(Employee employee, List<RoleType> roleTypes, Position position, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "statisticsOnRecruiters", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictStatisticsOnRecruiters(Employee employee, KeyValueCollectionLoader applicantsCountDl, KeyValueCollectionLoader applicantRecruiterDl, LocalDate from, LocalDate to, List<RoleType> roleTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "statisticsOnRecruiters", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void statisticsOnRecruiters(Employee employee, KeyValueCollectionLoader applicantsCountDl, KeyValueCollectionLoader applicantRecruiterDl, LocalDate from, LocalDate to, List<RoleType> roleTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull String getApplicantsCountDlQuery() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull String getApplicantRecruiterDlQuery() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "percentageApplicantByRecruiter", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictPercentageApplicantByRecruiter(List<KeyValueEntity> kvList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "percentageApplicantByRecruiter", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public ListChartItems<MapDataItem> percentageApplicantByRecruiter(List<KeyValueEntity> kvList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "getCountApplicantByStageHistoryAndStatus", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictGetCountApplicantByStageHistoryAndStatus(MonitoringByEmployeesFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "getCountApplicantByStageHistoryAndStatus", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Map<EmployeeDTO, Long> getCountApplicantByStageHistoryAndStatus(MonitoringByEmployeesFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<EmployeeDTO, Long> countApplicantHelper(MonitoringByEmployeesFilter filter, JobsterQueryTransformer transformer1, JobsterQueryTransformer transformer2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<Employee, Long> firstStageCount(MonitoringByEmployeesFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addFilterToSubquery(JobsterQueryTransformer transformer1, JobsterQueryTransformer transformer2, FilterItem<?> filterItem, String where) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addFilter(QueryTransformer transformer, FilterItem<?> filterItem, String where) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<RoleType> getReportRoles(ReportView reportView) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "getRecruitmentAndDismissals", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictGetRecruitmentAndDismissals(RecruitmentAndDismissalDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "getRecruitmentAndDismissals", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getRecruitmentAndDismissals(RecruitmentAndDismissalDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "processingTimeV6", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAverageProcessingTime(Kanban kanban, List<RoleType> roleTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "processingTimeV6", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    @Transactional(readOnly = true)
    public AverageProcessingTimeDTO getAverageProcessingTime(Kanban kanban, List<RoleType> roleTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * For every applicant ID returned by {@link KanbanService#getFirstStageEntities}, fetch
     * (responsible, fillDate, createdDate) plus the latest active first-stage KSE date.
     * Then group by responsible and compute count + average days entirely in Java.
     */
    private void aggregateFirstStage(
            Map<Employee, Map<UUID, AverageProcessingTimeDTO.StageMetric>> data,
            Kanban kanban, KanbanStage firstStage, UUID firstStageId,
            List<UUID> applicantIds, List<RoleType> roleTypes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "reviewedApplicants", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictReviewedApplicantsByManager(ReviewedApplicantsReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "reviewedApplicants", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getReviewedApplicantsByManager(ReviewedApplicantsReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull List<KeyValueEntity> getReviewedApplicantsByStatus(ReviewedApplicantsReportDTO dto, PersonStatus status, String... properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "reviewedApplicantsCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictReviewedApplicantsByManagerCount(ReviewedApplicantsReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "reviewedApplicantsCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getReviewedApplicantsByManagerCount(ReviewedApplicantsReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private FluentValuesLoader makeReviewedApplicantLoader(ReviewedApplicantsReportDTO dto, QueryTransformer transformer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "openedAndClosedVacancyCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictOpenedAndClosedVacancyCount(ConversionAndVacancyReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "openedAndClosedVacancyCount", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getOpenedAndClosedVacancyCount(ConversionAndVacancyReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countPeopleOnStageGroupByUser", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCountPeopleOnStageGroupByUser(ConversionAndVacancyReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "countPeopleOnStageGroupByUser", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> countPeopleOnStageGroupByUser(ConversionAndVacancyReportDTO dto, Kanban kanban, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countAcceptedPeopleByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAcceptedPeopleByResponsible(ConversionAndVacancyReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "countAcceptedPeopleByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> countAcceptedPeopleByResponsible(ConversionAndVacancyReportDTO dto, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "averageAgeView", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAverageAgeView(LocalDate from, LocalDate to, @Nullable Department branch, @Nullable Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "averageAgeView", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> averageAgeView(LocalDate from, LocalDate to, @Nullable Department department, @Nullable Position position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "averageAgeView", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAverageAgeView(OffsetDateTime from, OffsetDateTime to, @Nullable UUID branch, @Nullable UUID position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "averageAgeView", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> averageAgeView(OffsetDateTime from, OffsetDateTime to, @Nullable UUID branch, @Nullable UUID position) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "finishedAndUnfinished", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictFinishedAndUnfinished(OffsetDateTime from, OffsetDateTime to, Bot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "finishedAndUnfinished", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> finishedAndUnfinished(OffsetDateTime from, OffsetDateTime to, Bot bot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "flowOfApplicants", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictFlowOfApplicants(LocalDate from, LocalDate to, Position position, Department branch, Set<Department> branches, String condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "flowOfApplicants", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> flowOfApplicants(LocalDate from, LocalDate to, Position position, Department branch, Set<Department> branches, String condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "adaptationAttend", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAdaptationAttend(OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "adaptationAttend", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> adaptationAttend(OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void checkNullHelper(Object object, Runnable runnable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<KeyValueEntity> cancelReasonDashboard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @CacheEvict(value = "hired_employees_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictHiredEmployeesCount() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "hired_employees_count", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long getHiredEmployeesCount(User user, Kanban kanban, CandidateProcessingFilter filter, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "closeRequestByStatusReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCloseRequestByStatusReport(CloseRequestByStatusDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "closeRequestByStatusReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getCloseRequestByStatusReport(CloseRequestByStatusDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "closeRequestByStatusReportV2", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCloseRequestByStatusReportV2(CloseRequestByStatusDTOv2 dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "closeRequestByStatusReportV2", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getCloseRequestByStatusReportV2(CloseRequestByStatusDTOv2 dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "requestAuthorStatistics", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRequestAuthorStatistics(RequestAuthorDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "requestAuthorStatistics", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getRequestAuthorStatistics(RequestAuthorDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "departmentReload", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", allEntries = true)
    public void cacheEvictReloadDepartment() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "departmentReload", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result==null")
    public Department reloadDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "vacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictVacancyReport(LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "vacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getVacancyReport(LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "pipelineApplicantsReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictApplicantsCountByStage(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "pipelineApplicantsReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Long getApplicantsCountByStage(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "KPIScoreReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictKPIScoreReport(DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "KPIScoreReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public KeyValueEntity getKPIScoreReport(DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "analyticsReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAnalyticsReport(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "analyticsReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public KeyValueEntity getAnalyticsReport(KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setApplicationHire(KeyValueEntity kv, Kanban kanban, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private KeyValueEntity getFinishedApplicantsCount(Kanban kanban, OffsetDateTime from, OffsetDateTime to, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setAvgTimeFill(KeyValueEntity kv, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private double getAverageFillDays(List<Vacancy> vacancies) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<Vacancy> getVacanciesByPeriod(OffsetDateTime from, OffsetDateTime to, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setAcceptanceRate(KeyValueEntity kv, KanbanStage stage, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setTotalHires(KeyValueEntity kv, Kanban kanban, DepartmentCategory category, BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "candidateReserveByPositionReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCandidateReserveByPositionReport(DepartmentCategory category, BranchType branchType, Kanban kanban, Boolean clickedShowAllBtn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "candidateReserveByPositionReport", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getCandidateReserveByPositionReport(DepartmentCategory category, BranchType branchType, Kanban kanban, Boolean clickedShowAllBtn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "candidateClosureReportFunnel", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCandidateClosureReportFunnel(CandidateClosureFilter filter, List<KanbanStage> stages, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "candidateClosureReportFunnel", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getCandidateClosureReportFunnel(CandidateClosureFilter filter, List<KanbanStage> stages, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private long getFinishedApplicantsCountByStage(CandidateClosureFilter filter, KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "candidateClosureReportDonut", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCandidateClosureReportDonut(CandidateClosureFilter filter, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "candidateClosureReportDonut", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public KeyValueEntity getCandidateClosureReportDonut(CandidateClosureFilter filter, Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public long getFinishedApplicantsCountByStatus(CandidateClosureFilter filter, Kanban kanban, PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "candidateClosureReportNightingale", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCandidateClosureReportNightingale(CandidateClosureFilter filter, Kanban kanban, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "candidateClosureReportNightingale", keyGenerator = "jb_ReportKeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getCandidateClosureReportNightingale(CandidateClosureFilter filter, Kanban kanban, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addFiltersToCandidateClosureReport(CandidateClosureFilter filter, QueryTransformer transformer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addParametersToCandidateClosureReport(CandidateClosureFilter filter, FluentValueLoader<Long> loader) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "pipelineByRecruiters", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictPipelineByRecruiters(List<KanbanStage> stages, List<RoleType> roleTypes, Integer limit, CandidateClosureFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "pipelineByRecruiters", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public EmployeePipelineDTO getPipelineByRecruiters(List<KanbanStage> stages, List<RoleType> roleTypes, Integer limit, CandidateClosureFilter filter) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "applicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictApplicantsByResponsible(Kanban kanban, List<RoleType> roleTypes, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Get applicants count by responsible person and stage
     * Optimized: limits results, single-pass processing, minimal object creation
     */
    @Cacheable(value = "applicantsByResponsible", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    @Transactional(readOnly = true)
    public ApplicantsByResponsibleDTO getApplicantsByResponsible(Kanban kanban, List<RoleType> roleTypes, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "pipelineByManagers", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictPipelineByManagers(Kanban kanban, CandidateClosureFilter filter, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "pipelineByManagers", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getPipelineByManagers(Kanban kanban, CandidateClosureFilter filter, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "hiringReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictHiringReport(HiringReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "hiringReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getHiringReport(HiringReportDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "detailsRecruiterVacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictDetailsRecruiterVacancyReport(OffsetDateTime from, OffsetDateTime to, User recruiter, List<KanbanStage> stages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "detailsRecruiterVacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getDetailsRecruiterVacancyReport(OffsetDateTime from, OffsetDateTime to, User recruiter, List<KanbanStage> stages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void fixFunnel(List<KanbanStage> stages, List<KeyValueEntity> list) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getFunnelQuery(List<KanbanStage> stages, List<String> properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "dashboardByVacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictDashboardByVacancyReport(OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "dashboardByVacancyReport", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<Vacancy> getDashboardByVacancyReport(OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "rejectionByStages", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRejectionByStages(RejectionByStagesDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "rejectionByStages", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getRejectionByStages(RejectionByStagesDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "exitReasonByStage", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictExitReasonByStage(List<KanbanStage> stages, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "exitReasonByStage", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public List<KeyValueEntity> getExitReasonByStage(List<KanbanStage> stages, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Default weight for a priority when the report config does not override it.
     */
    private int priorityWeight(Map<Priority, Integer> scoring, Priority priority) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Tab1 — scoring matrix: weighted request score per responsible employee × position.
     * Rows: employeeId, employeeName, positionId, positionName, sum (BigDecimal).
     */
    @Transactional(readOnly = true)
    public List<KeyValueEntity> getResponsibleRequestScores(String tenantId, Map<Priority, Integer> scoring,
                                                            UUID departmentId, UUID employeeId,
                                                            OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Tab2/3/4 — weighted request count per responsible employee, split by priority.
     * status = null (all), CLOSED (closed), IN_PROGRESS (active). Rows: employeeId, employeeName,
     * priority (LOW/MEDIUM/HIGH string), sum (long-ish BigDecimal). Pivoted into columns in the view.
     */
    @Transactional(readOnly = true)
    public List<KeyValueEntity> getRequestsPriorityCount(Map<Priority, Integer> scoring, String tenantId,
                                                         UUID departmentId, UUID employeeId,
                                                         OffsetDateTime from, OffsetDateTime to,
                                                         RequestStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private long asLong(Object value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
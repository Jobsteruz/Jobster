package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.*;
import com.smartbox.jobster.entity.config.NetworkSettings;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyApproval;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.appsettings.AppSettings;
import io.jmix.core.*;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.security.Authenticated;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Month;
import java.util.*;

/**
 * @author Jobster team
 * Since: 12/27/2023 12:40 PM
 */
@Service
public class CompanyService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private Messages messages;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private AppSettings appSettings;
    @Autowired
    private UnconstrainedDataManager unconstrainedDataManager;
    @Autowired
    private EmployeeService employeeService;

    public Company currentCompany() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Company currentCompany(String fetchPlanName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Company> loadCompanies() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Company currentCompany(String fetchPlanName, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Company companyByTenant(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public CompanyConfig companyConfigByTenant(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CompanyConfig companyConfig(String fetchPlan, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CompanyDetail companyInn(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CompanyDetail getOrCreateCompanyDetail(Company company) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // @Authenticated is REQUIRED: this is invoked from the Spring Security filter thread
    // (patched ConcurrentSessionControlAuthenticationStrategy#getAllSessions, during
    // remember-me/session-strategy auth) BEFORE any Jmix authentication is set. Without it,
    // a @Cacheable MISS runs appSettings.load(...) with no auth -> Jmix entity-load
    // constraint -> IllegalStateException "Authentication is not set" -> HTTP 500.
    // NetworkSettings is a global (non-tenant) AppSettings singleton, so running under the
    // system user returns the same value. Works regardless of @Authenticated/@Cacheable
    // interceptor order: on a cache miss the method body always runs under system auth.
    @Authenticated
    @Cacheable(value = RedisCacheNames.NETWORK_SETTINGS_CACHE, key = "#root.methodName", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public String trustedIp() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // @Authenticated: same reason as trustedIp() — called from AuthenticationEventListener
    // on the security filter thread; a cache miss would otherwise throw "Authentication is not set".
    @Authenticated
    @Cacheable(value = RedisCacheNames.TRUSTED_DEVICE_MAX_AGE, key = "#root.methodName", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Integer trustedDeviceMaxAge() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // MQ producer guard uchun (MQService.sendTgMessage): INACTIVE tenant'ga xabar navbatga
    // qo'yilmasin — consumer faqat ACTIVE tenant'larga ochiladi (StartTgQueueConsumers), aks holda
    // xabar egasiz queue'da abadiy yig'iladi. Yo'q tenant -> true (fail-open, xabar tashlanmaydi).
    // @Authenticated: MQ/bot oqimlaridan ham chaqiriladi — cache miss'da system auth ostida ishlaydi.
    @Authenticated
    @Cacheable(value = RedisCacheNames.TENANT_STATUS, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean isTenantActive(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.TENANT_STATUS, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictTenantStatus(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.FULL_NAME_FORMAT, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public String fullNameFormat(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.FULL_NAME_FORMAT, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictFullNameFormat(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.TEMPLATE_2_STEP, key = "#tenantId+'_'+#locale", cacheManager = "hazelcastCacheManager")
    public String template2Step(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.TEMPLATE_2_STEP, key = "#tenantId+'_'+#locale", cacheManager = "hazelcastCacheManager")
    public void cacheEvictTemplate2Step(String tenantId, String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.OFFER_POSITION_ON_REJECT, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean offerPositionOnReject(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.OFFER_POSITION_ON_REJECT, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictOfferPositionOnReject(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.SELECT_VACANCY_ON_MESSAGE, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean selectVacancyOnMessage(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.SELECT_VACANCY_ON_MESSAGE, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictSelectVacancyOnMessage(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.AUTO_CREATE_VACANCY_ON_APPROVE, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean autoCreateVacancyOnApprove(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.AUTO_CREATE_VACANCY_ON_APPROVE, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAutoCreateVacancyOnApprove(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Jobster 3 style additional questions: one-screen fill in and the answers on the person card. */
    @Cacheable(value = RedisCacheNames.ADDITIONAL_QUESTIONS_J3, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean additionalQuestionsJ3(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.ADDITIONAL_QUESTIONS_J3, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAdditionalQuestionsJ3(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean createBranchOnClone(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isAutoCreateVacancyCategoryMatchesConfig(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.TWO_STEP_REQUEST_APPROVAL, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean twoStepRequestApproval(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.TWO_STEP_REQUEST_APPROVAL, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictTwoStepRequestApproval(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isTwoStepRequestApprovalCategoryMatchesConfig(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Whether {@code employee} may approve or reject {@code request} right now.
     * <p>
     * Without the two-step setup nothing is restricted. With it, the employee holding the configured
     * approver role only acts on the second step - until the first responsible has approved, the
     * request stays view-only for them - and everyone else only acts on the first step.
     */
    public boolean canDecideOnRequest(Employee employee, Vacancy request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private RoleType requestApproverRoleType(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isFirstStepApproved(Vacancy request) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Company getByTenant(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Company> getCompanies() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public void restoreTenantLimit(Integer sms, Integer email, Company company) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public List<String> getTenantsByStatus(CompanyStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public String companyNameByTenant(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public TemporaryCompany getTempCompanyByEmail(String email) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<CompanySms> getCompanySmsSettings(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<CompanyEmail> getCompanyEmailSettings(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CompanyConfig getOrCreateByCompany(Company company) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public TemporaryCompany getTempCompany(String companyName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public List<TenantAdmin> getAllCompanyAdmins() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TenantAdmin getAdmin(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Map<String, String> getCompanyRobotUserNameByTenantIds(Set<String> tenantIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Tenants that can run robots: companies with a dedicated robot user configured. Mirrors the
     * filter of the robot scheduling query (no status filter — the producer and the per-tenant
     * consumers must agree on the same set, or a message could be enqueued into a queue nobody
     * subscribes to).
     */
    public List<String> getRobotTenants() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public LegalCompany getLegalCompanyByPlatformId(String platformId, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public record TenantAdmin(String tenant, String admin) {
    }

    public Set<Month> getUnpaidMonths(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = RedisCacheNames.COMPANY_UNPAID_MONTHS, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public boolean isRestricted(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.COMPANY_UNPAID_MONTHS, key = "#tenantId", cacheManager = "hazelcastCacheManager")
    public void cacheEvictRestriction(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.service.person;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.integration.hh.HHStage;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanStageEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.smartbox.jobster.pojo.ApplicantIshGOPojo;
import com.smartbox.jobster.security.specific.UiSetPNFLDialogEnabled;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.hh.HHApplicantService;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanStageEntityService;
import com.smartbox.jobster.service.tg.TgUserService;
import com.smartbox.jobster.service.zpcast.SalaryService;
import com.smartbox.jobster.view.applicant.ApplicantSetPNFLView;
import com.smartbox.jobster.view.orgchart.StaffQuantityDTO;
import com.smartbox.jobster.view.vacancy.lookup.VacancyLookupView;
import io.jmix.core.*;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.security.Authenticated;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Jobster team
 * Since: 1/19/2024 5:23 PM
 */
@Service
public class EmployeeService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.applicant-ishgo.routing-key}")
    private String routingKey;

    @Autowired
    private QueryTransformerFactory queryTransformerFactory;
    @Autowired
    private EntityService entityService;
    @Autowired
    private Metadata metadata;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private PositionService positionService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private UserService userService;
    @Autowired
    private SalaryService salaryService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private KanbanStageEntityService kanbanStageEntityService;
    @Autowired
    private RequestService requestService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private HHApplicantService hhApplicantService;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private KanbanActionService kanbanActionService;
    @Autowired
    private UserSettingsCache userSettingsCache;
    @Autowired
    private TgUserService tgUserService;
    @Autowired
    private VacancyService vacancyService;

    public Employee currentEmployee() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee currentEmployee(String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByUser(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> loadAllByIds(List<UUID> ids, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByUser(User user, @Nullable String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Batched {@link #getByUser(User)} for per-item render loops (stage-history cards, comment
     * lists). The map holds an entry for EVERY requested user id, with a null value when the user
     * has no employee — callers must not fall back to a per-user query on a null value.
     */
    public Map<UUID, Employee> getByUserIds(Collection<UUID> userIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * {@link #getByUserIds(Collection)} restricted to active employees and loaded with a named
     * fetch plan — for grids of {@code jb_User} whose columns render employee data (see
     * {@code employee-user-management}). Same null-value contract as the base method.
     */
    public Map<UUID, Employee> getActiveByUserIds(Collection<UUID> userIds, @Nullable String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, Employee> loadByUserIds(Collection<UUID> userIds, @Nullable String fetchPlan, boolean activeOnly) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Employee getByUsername(String username, @Nullable String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Authenticated
    public Employee getByUsername(String username) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByPinfl(String pinfl) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean existsByPinfl(String pinfl, UUID employeeId, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee createEmployee(Map<String, String> map) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getByDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getByDepartment(Department department, int max) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "getStfTablesByDepartment", key = "#department.id + '_' + #max", cacheManager = "hazelcastCacheManager")
    public void cacheEvictStfTablesByDepartment(Department department, Integer max) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "getStfTablesByDepartment", key = "#department.id + '_' + #max", cacheManager = "hazelcastCacheManager")
    public List<StaffingTable> getStfTablesByDepartment(Department department, Integer max) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "staffQtyByDepartment", key = "#department.id", cacheManager = "hazelcastCacheManager")
    public void cacheEvictStaffQtyByDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "staffQtyByDepartment", key = "#department.id", cacheManager = "hazelcastCacheManager")
    public StaffQuantityDTO staffQtyByDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "countStaffByDepartment", key = "#department.id", cacheManager = "hazelcastCacheManager")
    public void cacheEvictCountStaffByDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Cacheable(value = "countStaffByDepartment", key = "#department.id", cacheManager = "hazelcastCacheManager")
    public Long countStaffByDepartment(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getByRoleType(RoleType roleType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getEmployeeManagers(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Department> getEmployeeDepartments(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean hasEmployeeDepartments(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getEmployeeDepartmentIds(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Department getEmployeeDepartment(Employee employee, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<StaffingTable> getStaffByEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByPhone(String phone, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByEmail(String email, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getByStaffNumber(String staffNumber, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void createEmployeeForExcel(Map<String, String> map) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private StaffingTable getStaffingTableByTabNum(String tabNum) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<StaffingTable> loadAllDepartmentEmployees(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void convertEmployee(Employee employee, KanbanStage stage, Optional<Runnable> convertedListener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void hireApplicant(Applicant applicant, KanbanStage stage, View<?> origin, Optional<Runnable> hiredListener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * @param dateStartWork the day the hire is expected at work, as typed into the hire dialog when
     *                      the stage has {@code enableStartWorkDate} on. Null on every headless
     *                      path (mass hire, REST) and whenever the stage does not ask for it.
     */
    public void hireApplicant(Applicant applicant, KanbanStage stage, View<?> origin, Optional<Runnable> hiredListener,
                              @Nullable LocalDate dateStartWork) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void continueHiring(Applicant reloaded, KanbanStage stage, View<?> origin, Optional<Runnable> hiredListener,
                                @Nullable LocalDate dateStartWork) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void hire(Applicant applicant, KanbanStage stage, Vacancy vacancy, @Nullable LocalDate dateStartWork) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<UUID> getAllTgUserId(Set<RoleType> roleType, Set<Department> branches, Set<Position> positions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getExitEmployeesByEmployees(Set<Employee> employees) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Exit date per employee for one grid page - a single query instead of one per row, the same
     * shape as the staffing and bot-login columns of the employee list. An employee can carry more
     * than one exit record (hired back, then let go again); the ascending order means the last
     * write wins, so the map holds the most recent exit.
     */
    public Map<UUID, LocalDate> getExitDatesByEmployeeIds(Collection<UUID> employeeIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ExitEmployee getExitEmployeeByEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getAll(Integer offset, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getUserNonNull(RoleType roleType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private StaffingTable getOrCreateStaffingTable(Position position, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getEmployeeForState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getHasUserEmployees(RoleType roleType, Integer offset, Integer limit) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Employee getEmployeeByPNFL(String pnfl, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmployeePinfl getEmployeePinflByPNFL(String pinfl, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

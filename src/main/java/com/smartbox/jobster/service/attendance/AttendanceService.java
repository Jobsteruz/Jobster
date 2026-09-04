package com.smartbox.jobster.service.attendance;

import com.google.common.collect.Lists;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.vision.Attendance;
import com.smartbox.jobster.entity.vision.TgAttendConfig;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.reports.attendancegridreport.AttendanceGridRowDto;
import com.smartbox.jobster.view.reports.attendancereportview.AggregatedAttendanceReportDto;
import com.smartbox.jobster.view.reports.dailyattendancereport.DailyAttendanceDto;
import com.smartbox.jobster.view.reports.monthlyreport.MonthlyReportDto;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.HasValue;
import io.jmix.core.*;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.smartbox.jobster.config.replica.UseReplica;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AttendanceService {
    private static final Logger log = LoggerFactory.getLogger(AttendanceService.class);
    private final DataManager dataManager;
    private final EntityService entityService;
    private final QueryTransformerFactory queryTransformerFactory;
    private final Messages messages;

    public Map<String, List<AttendanceOneDayDTO>> getEmployeeAttendance(Employee employee, String tenantId,
                                                                        String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull List<Attendance> getAttendanceList(Employee employee, String tenantId, OffsetDateTime from,
                                                        OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MonthlyAttendanceDTO getMonthlyAttendance(Employee employee, String tenantId, String lang) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<AttendanceDTO> getAttendanceDtos(List<Attendance> attendanceList) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private OffsetDateTime[] getDateRange() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Attendance createAttendance(Employee employee, int type, String tenantId, boolean overtime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Attendance createAttendance(Employee employee, int type, String tenantId, boolean overtime, boolean auto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Attendance getLastAttendance(Employee employee, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Attendance getLastAttendance(Employee employee, String tenantId, int offset) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int getLasAttendanceType(Employee employee, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getNotCheckInEmployees() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getEmployeesWithUpcomingCheckIn(int withinMinutes) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<Employee> getNotCheckOutEmployees() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void processAutoCheckOutEmployees() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Batch-saves the generated check-out rows, falling back to per-row saves when the batch is
     * rejected. The batch is a single transaction, so without the fallback one bad row would deny
     * auto check-out to every employee in the run.
     */
    private void saveAutoCheckOuts(List<Attendance> checkOuts, String kind) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static final long[] NO_ATTENDANCE_TODAY = new long[2];
    private static final int ATTENDANCE_IN_CHUNK = 1000;

    /**
     * Runs a batched probe, returning {@code null} instead of propagating when it fails so the
     * caller can fall back to the per-employee query the batch replaced. A broken batch query is
     * otherwise a platform-wide outage: it aborts before a single row is built, which is exactly
     * how a reserved-word alias in the counts query killed auto check-out for two days in Aug 2026.
     * <p>
     * Failure must be {@code null}, not an empty map: absence from the map is itself an answer
     * ("no attendance"), so an empty map would silently skip every employee instead of degrading.
     */
    private <T> T batchProbe(String probe, Supplier<T> call) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Per-employee fallback for {@link #todayAttendanceCountsByType}, indexed the same way. The
     * type is inlined rather than bound as {@code :type} — these are the two queries the batch
     * replaced, kept in their proven shape.
     */
    private long[] todayAttendanceCounts(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private long todayAttendanceCount(Employee employee, String query) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Today's attendance row counts per employee, indexed by type (0 = check-in, 1 = check-out). */
    private Map<UUID, long[]> todayAttendanceCountsByType(Collection<UUID> employeeIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Latest attendance row (any day) per employee — batched replacement for calling
     * {@link #getLastAttendance} in a loop. One entity query per chunk, with "latest" resolved by
     * a correlated subquery inside the database.
     * <p>
     * Deliberately NOT a MAX(time) values query matched back to rows by timestamp: that shape
     * over-fetched (every employee's max time was offered to every other employee's rows), broke
     * on ties, and made a missed match indistinguishable from "employee has no attendance" —
     * which silently skips auto check-out.
     */
    public Map<UUID, Attendance> lastAttendanceByEmployeeIds(Collection<UUID> employeeIds) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void processAutoCheckOutOvertimeEmployees() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<TgAttendConfig> getAutoOvertimeTimes() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isAutoCheckOutEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static double calcHours(OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "daily_attendances_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictDailyAttendance(Employee employee, Department department, OffsetDateTime from,
                                          OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "daily_attendances_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Collection<DailyAttendanceDto> getDailyAttendances(Employee employee, Department department,
                                                              OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Collection<DailyAttendanceDto> makeEmployeeDailyAttendances(Employee employee,
                                                                        List<Attendance> attendances) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = "aggregated_attendances_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvictAggregatedAttendance(Employee employee, Department department, OffsetDateTime from,
                                               OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    @Cacheable(value = "aggregated_attendances_cache", keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public Collection<AggregatedAttendanceReportDto> getAggregatedAttendances(Employee employee, Department department,
                                                                              OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public Collection<AttendanceGridRowDto> getAttendanceGridData(Employee employee, Department department,
                                                                  OffsetDateTime from, OffsetDateTime to, boolean includeNormal, boolean includeOvertime) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }



    @UseReplica
    public Collection<MonthlyReportDto> getMonthlyReport(Department department, OffsetDateTime from, OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @UseReplica
    public TreeComboBox<Department> attendanceDepartmentTreeComboBox(
            HasValue.ValueChangeListener<? super AbstractField.ComponentValueChangeEvent<TreeComboBox<Department>, Department>> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<Attendance> getAttendances(Employee employee, Department department, OffsetDateTime from,
                                                 OffsetDateTime to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

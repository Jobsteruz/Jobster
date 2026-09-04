package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.ref.Region;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@JmixEntity
@Table(name = "JB_REQUEST_STATUS_NOTIFY", indexes = {
        @Index(name = "IDX_JB_REQUEST_STATUS_NOTIFY_TEMPLATE", columnList = "TEMPLATE_ID")
})
@Entity(name = "jb_RequestStatusNotify")
@Getter
@Setter
public class RequestStatusNotify extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8964553472193566279L;

    @InstanceName
    @Column(name = "STATUS")
    private String status;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate template;

    @Column(name = "USER_")
    private String user;

    @JoinTable(name = "JB_REQUEST_STATUS_NOTIFY_EMPLOYEE_LINK",
            joinColumns = @JoinColumn(name = "REQUEST_STATUS_NOTIFY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Employee> employees;

    @Column(name = "PLATFORMS")
    private String platforms;

    @JoinTable(name = "JB_REQUEST_STATUS_NOTIFY_REGION_LINK",
            joinColumns = @JoinColumn(name = "REQUEST_STATUS_NOTIFY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "REGION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Region> filterRegions;

    @JoinTable(name = "JB_REQUEST_STATUS_NOTIFY_DEPARTMENT_LINK",
            joinColumns = @JoinColumn(name = "REQUEST_STATUS_NOTIFY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Department> filterDepartments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FILTER_DEPARTMENT_CATEGORY_ID")
    private DepartmentCategory filterDepartmentCategory;

    @JoinTable(name = "JB_REQUEST_STATUS_NOTIFY_POSITION_LINK",
            joinColumns = @JoinColumn(name = "REQUEST_STATUS_NOTIFY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "POSITION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Position> filterPositions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FILTER_POSITION_TYPE_ID")
    private PositionType filterPositionType;

    public VacancyUser getUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setUser(VacancyUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RequestStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(RequestStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Set<Platform> getPlatforms() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatforms(Set<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
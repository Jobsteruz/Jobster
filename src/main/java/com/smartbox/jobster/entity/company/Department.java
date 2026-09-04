package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.HierarchicalEntity;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.ref.ParentTinyRef;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.entity.tg.FileType;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_DEPARTMENT", indexes = {
        @Index(name = "IDX_JB_DEPARTMENT_PARENT", columnList = "PARENT_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_HEAD", columnList = "HEAD_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_COMPANY", columnList = "COMPANY_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_REGION", columnList = "REGION_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_TENANT", columnList = "TENANT_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_DEPUTY_HEAD", columnList = "DEPUTY_HEAD_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_BRANCH_TYPE", columnList = "BRANCH_TYPE_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_CATEGORY", columnList = "CATEGORY_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_STAFFING_HEAD", columnList = "STAFFING_HEAD_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_STAFFING_DEPUTY_HEAD", columnList = "STAFFING_DEPUTY_HEAD_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_PERSON_CATEGORY", columnList = "PERSON_CATEGORY_ID"),
        @Index(name = "IDX_JB_DEPARTMENT_HIERARCHICAL_KEY", columnList = "HIERARCHICAL_KEY")
})
@Entity(name = "jb_Department")
@Getter
@Setter
public class Department extends ParentTinyRef implements HierarchicalEntity, Serializable {
    private static final long serialVersionUID = 8207220710625698446L;

    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Company company;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Department parent;

    @OneToMany(mappedBy = "parent")
    @Composition
    @OrderBy("sort, createdDate")
    @OnDelete(DeletePolicy.CASCADE)
    protected List<Department> children;

    @JoinColumn(name = "HEAD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Employee head;

    @JoinColumn(name = "STAFFING_HEAD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private StaffingTable staffingHead;

    @JoinColumn(name = "DEPUTY_HEAD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Employee deputyHead;

    @JoinColumn(name = "STAFFING_DEPUTY_HEAD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private StaffingTable staffingDeputyHead;

    @Column(name = "TYPE_")
    protected String type;

    @JoinColumn(name = "BRANCH_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BranchType branchType;

    @JoinColumn(name = "CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DepartmentCategory category;

    @JoinColumn(name = "PERSON_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonCategory personCategory;

    @Column(name = "ADDRESS", length = 512)
    protected String address;

    @Column(name = "PHONE")
    protected String phone;

    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "PHOTO", length = 1024)
    protected FileRef photo;

    @Column(name = "PHOTO_ID", length = 512)
    private String photoId;

    @Column(name = "PHOTO_TYPE")
    private String photoType;

    @Column(name = "LOCATION")
    protected String location;

    @JoinColumn(name = "REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Region region;

    @Column(name = "NEAREST_RADIUS")
    private Double nearestRadius;

    @JmixGeneratedValue
    @Column(name = "HIERARCHICAL_ID")
    private Long hierarchicalId;

    @Column(name = "HIERARCHICAL_KEY", length = 1024)
    private String hierarchicalKey;

    @OrderBy("employee")
    @Composition
    @OneToMany(mappedBy = "department")
    @OnDelete(DeletePolicy.CASCADE)
    protected List<StaffingTable> staffingTables;

    @JoinColumn(name = "LEGAL_COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected LegalCompany legalCompany;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID")
    private String platformId;

    public FileType getPhotoType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPhotoType(FileType photoType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getTinyName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public DepartmentType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(DepartmentType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name", "shortName", "hierarchicalKey"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

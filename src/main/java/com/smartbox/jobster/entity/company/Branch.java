package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.ref.Region;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_BRANCH", indexes = {
        @Index(name = "IDX_JB_BRANCH_REGION", columnList = "REGION_ID"),
        @Index(name = "IDX_JB_BRANCH_CATEGORY", columnList = "CATEGORY_ID"),
        @Index(name = "IDX_JB_BRANCH_DEPARTMENT", columnList = "DEPARTMENT_ID")
})
@Entity(name = "jb_Branch")
@Getter
@Setter
public class Branch extends ParentRef implements Serializable {
    private static final long serialVersionUID = 4910786644893322684L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;

    @JoinColumn(name = "CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DepartmentCategory category;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;
}
package com.smartbox.jobster.entity.trainee;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_TRAINEE_GROUP_INTERN", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_INTERN_GROUP", columnList = "GROUP_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_INTERN_INTERN", columnList = "INTERN_ID")
})
@Entity(name = "jb_TraineeGroupIntern")
@Getter
@Setter
public class TraineeGroupIntern extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -1545350046736693479L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroup group;

    @InstanceName
    @JoinColumn(name = "INTERN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee intern;

    @Column(name = "TRAINER_COMMENT")
    @Lob
    private String trainerComment;

    @Column(name = "GRADE")
    private Integer grade;

    @Column(name = "MANAGER_COMMENT")
    @Lob
    private String managerComment;

    @Column(name = "MANAGER_GRADE")
    private Integer managerGrade;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "groupIntern")
    private List<TraineeInternMentor> mentors;
}
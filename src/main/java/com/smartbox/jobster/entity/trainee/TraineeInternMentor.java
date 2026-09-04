package com.smartbox.jobster.entity.trainee;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TRAINEE_INTERN_MENTOR", indexes = {
        @Index(name = "IDX_JB_TRAINEE_INTERN_MENTOR_GROUP_INTERN", columnList = "GROUP_INTERN_ID"),
        @Index(name = "IDX_JB_TRAINEE_INTERN_MENTOR_MENTOR", columnList = "MENTOR_ID")
})
@Entity(name = "jb_TraineeInternMentor")
@Getter
@Setter
public class TraineeInternMentor extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -3126044800700799954L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_INTERN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroupIntern groupIntern;

    @JoinColumn(name = "MENTOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee mentor;
}
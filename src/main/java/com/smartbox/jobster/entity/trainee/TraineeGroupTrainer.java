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
@Table(name = "JB_TRAINEE_GROUP_TRAINER", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_TRAINER_GROUP", columnList = "GROUP_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_TRAINER_TRAINER", columnList = "TRAINER_ID")
})
@Entity(name = "jb_TraineeGroupTrainer")
@Getter
@Setter
public class TraineeGroupTrainer extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8178773757574418935L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroup group;

    @JoinColumn(name = "TRAINER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee trainer;
}
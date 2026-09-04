package com.smartbox.jobster.entity.trainee.config;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Position;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TRAINEE_GROUP_POSITION", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_POSITION_GROUP_CONFIG", columnList = "GROUP_CONFIG_ID"),
        @Index(name = "IDX_JB_TRAINEE_GROUP_POSITION_POSITION", columnList = "POSITION_ID")
})
@Entity(name = "jb_TraineeGroupPosition")
@Getter
@Setter
public class TraineeGroupPosition extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -2768741892969491404L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_CONFIG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroupConfig groupConfig;

    @InstanceName
    @JoinColumn(name = "POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;
}
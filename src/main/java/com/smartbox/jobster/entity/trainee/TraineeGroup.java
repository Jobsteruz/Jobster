package com.smartbox.jobster.entity.trainee;

import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.trainee.config.TraineeGroupConfig;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@JmixEntity
@Table(name = "JB_TRAINEE_GROUP", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_GROUP_CONFIG", columnList = "GROUP_CONFIG_ID")
})
@Entity(name = "jb_TraineeGroup")
@Getter
@Setter
public class TraineeGroup extends ParentRef implements Serializable {

    private static final long serialVersionUID = 7265442867113690606L;

    //in days
    @Column(name = "DURATION")
    private Integer duration;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @JoinColumn(name = "GROUP_CONFIG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroupConfig groupConfig;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "group")
    private List<TraineeGroupTrainer> trainers;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "group")
    private List<TraineeGroupIntern> interns;
}
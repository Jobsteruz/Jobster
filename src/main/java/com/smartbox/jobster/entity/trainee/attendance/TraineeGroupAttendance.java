package com.smartbox.jobster.entity.trainee.attendance;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.trainee.TraineeGroup;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_TRAINEE_GROUP_ATTENDANCE", indexes = {
        @Index(name = "IDX_JB_TRAINEE_GROUP_ATTENDANCE_GROUP", columnList = "GROUP_ID")
})
@Entity(name = "jb_TraineeGroupAttendance")
@Getter
@Setter
public class TraineeGroupAttendance extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 5790764075358766519L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroup group;

    @Column(name = "DATE_")
    private OffsetDateTime date;
}
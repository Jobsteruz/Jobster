package com.smartbox.jobster.entity.trainee.attendance;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.AbsentReason;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TRAINEE_INTERN_ATTENDANCE", indexes = {
        @Index(name = "IDX_JB_TRAINEE_INTERN_ATTENDANCE_GROUP_ATTENDANCE", columnList = "GROUP_ATTENDANCE_ID"),
        @Index(name = "IDX_JB_TRAINEE_INTERN_ATTENDANCE_GROUP_INTERN", columnList = "GROUP_INTERN_ID"),
        @Index(name = "IDX_JB_TRAINEE_INTERN_ATTENDANCE_ABSENT_REASON", columnList = "ABSENT_REASON_ID")
})
@Entity(name = "jb_TraineeInternAttendance")
@Getter
@Setter
public class TraineeInternAttendance extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 2977713776499860813L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "GROUP_ATTENDANCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroupAttendance groupAttendance;

    @JoinColumn(name = "GROUP_INTERN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TraineeGroupIntern groupIntern;

    @Column(name = "ATTEND")
    private Boolean attend;

    @JoinColumn(name = "ABSENT_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AbsentReason absentReason;
}
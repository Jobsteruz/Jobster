package com.smartbox.jobster.entity.schedule;

import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SCHEDULE", indexes = {
        @Index(name = "IDX_JB_SCHEDULE_OFFER", columnList = "OFFER_ID"),
        @Index(name = "IDX_JB_SCHEDULE_REMINDER", columnList = "REMINDER_ID"),
        @Index(name = "IDX_JB_SCHEDULE_REMINDER_DAYS_BEFORE", columnList = "REMINDER_DAYS_BEFORE_ID"),
        @Index(name = "IDX_JB_SCHEDULE_CASE_REFUSAL", columnList = "CASE_REFUSAL_ID")
})
@Entity(name = "jb_Schedule")
@Getter
@Setter
public class Schedule extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 4873909644919204874L;

    @JoinColumn(name = "OFFER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate offer;

    @JoinColumn(name = "REMINDER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate reminder;

    @JoinColumn(name = "REMINDER_DAYS_BEFORE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate reminderDaysBefore;

    @JoinColumn(name = "CASE_REFUSAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate caseRefusal;

    @Column(name = "CAPACITY")
    private Integer capacity;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("day DESC")
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OffDay> off;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("time DESC")
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimeSlot> timeSlots;
}
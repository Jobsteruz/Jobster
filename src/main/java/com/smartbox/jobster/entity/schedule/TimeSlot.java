package com.smartbox.jobster.entity.schedule;

import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.ats.Event;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@JmixEntity
@Table(name = "JB_TIME_SLOT", indexes = {
        @Index(name = "IDX_JB_TIME_SLOT_SCHEDULE", columnList = "SCHEDULE_ID")
})
@Entity(name = "jb_TimeSlot")
@Getter
@Setter
public class TimeSlot extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 5285192547990100913L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SCHEDULE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Schedule schedule;

    @Column(name = "DAY_OF_WEEK")
    private String dayOfWeek;

    @InstanceName
    @Column(name = "TIME_")
    private LocalTime time;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("startTime DESC")
    @OneToMany(mappedBy = "slot", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Event> events;

    public WeekDay getDayOfWeek() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDayOfWeek(WeekDay dayOfWeek) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
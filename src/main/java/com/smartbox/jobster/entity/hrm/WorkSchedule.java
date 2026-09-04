package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_WORK_SCHEDULE")
@Entity(name = "jb_WorkSchedule")
@Getter
@Setter
public class WorkSchedule extends ParentRef implements Serializable {
    private static final long serialVersionUID = -1641674512017492605L;
}
package com.smartbox.jobster.entity.checklist;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TASK_CANCEL_REASON")
@Entity(name = "jb_TaskCancelReason")
@Getter
@Setter
public class TaskCancelReason extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 1291077797275769429L;
}
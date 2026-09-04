package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_EXIT_REASON")
@Entity(name = "jb_ExitReason")
@Getter
@Setter
public class ExitReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = 225799955634234013L;
}
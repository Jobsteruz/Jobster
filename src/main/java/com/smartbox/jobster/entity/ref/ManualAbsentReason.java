package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_MANUAL_ABSENT_REASON")
@Entity(name = "jb_ManualAbsentReason")
@Getter
@Setter
public class ManualAbsentReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = 7973949235484998564L;
}
package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_ABSENT_REASON")
@Entity(name = "jb_AbsentReason")
@Getter
@Setter
public class AbsentReason extends ParentRef implements Serializable {
    private static final long serialVersionUID = -6783262901111977651L;
}
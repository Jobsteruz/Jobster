package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_PERSON_GROUP")
@Entity(name = "jb_PersonGroup")
@Getter
@Setter
public class PersonGroup extends ParentRef implements Serializable {
    private static final long serialVersionUID = -377360527003867527L;
}
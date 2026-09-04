package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_MARITAL_STATUS")
@Entity(name = "jb_MaritalStatus")
@Getter
@Setter
public class MaritalStatus extends ParentRef implements Serializable {
    private static final long serialVersionUID = -2951644789258581074L;
}
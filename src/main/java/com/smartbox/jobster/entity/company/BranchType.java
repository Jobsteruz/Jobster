package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_BRANCH_TYPE")
@Entity(name = "jb_BranchType")
@Getter
@Setter
public class BranchType extends ParentRef implements Serializable {
    private static final long serialVersionUID = 1097666711281441726L;
}
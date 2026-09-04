package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_DEPARTMENT_CATEGORY")
@Entity(name = "jb_DepartmentCategory")
@Getter
@Setter
public class DepartmentCategory extends ParentRef implements Serializable {
    private static final long serialVersionUID = 1176171267108020280L;
}
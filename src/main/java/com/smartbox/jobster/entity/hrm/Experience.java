package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_EXPERIENCE")
@Entity(name = "jb_Experience")
@Getter
@Setter
public class Experience extends ParentRef implements Serializable {
    private static final long serialVersionUID = 4093448778472319552L;

    @Column(name = "ISHGO_ID")
    private Integer ishgoId;
}
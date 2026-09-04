package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.entity.hrm.Education;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_PERSON_EDUCATION", indexes = {
        @Index(name = "IDX_JB_PERSON_EDUCATION_LEVEL", columnList = "LEVEL_ID")
})
@Entity(name = "jb_PersonEducation")
@Getter
@Setter
public class PersonEducation extends PersonHistory implements Serializable {
    private static final long serialVersionUID = 3536008303936649691L;

    @JoinColumn(name = "LEVEL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Education level;

    @Column(name = "SPECIALIST")
    private String specialist;
}
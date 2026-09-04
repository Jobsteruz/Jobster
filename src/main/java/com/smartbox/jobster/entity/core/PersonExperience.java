package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_PERSON_EXPERIENCE")
@Entity(name = "jb_PersonExperience")
@Getter
@Setter
public class PersonExperience extends PersonHistory implements Serializable {
    private static final long serialVersionUID = 6890059057159705359L;

    @Column(name = "ORGANIZATION")
    private String organization;

    @Column(name = "POSITION_")
    private String position;

}
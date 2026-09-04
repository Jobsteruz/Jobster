package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_ANSWER_FORMAT")
@Entity(name = "jb_AnswerFormat")
@Getter
@Setter
public class AnswerFormat extends StandardTenantEntity implements HasName, Serializable {
    private static final long serialVersionUID = -4765552793773936643L;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "FORMAT")
    @Lob
    private String format;

    @Column(name = "DIGESTER")
    @Lob
    private String digester;
}
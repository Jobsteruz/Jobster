package com.smartbox.jobster.entity.integration.hh;

import com.smartbox.jobster.entity.core.StandardEntity;
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
@Table(name = "JB_HH_PROFESSION")
@Entity(name = "jb_HHProfession")
@Getter
@Setter
public class HHProfession extends StandardEntity implements Serializable {
    private static final long serialVersionUID = -4875243257919958016L;

    @Column(name = "HH_ID")
    private Integer hhId;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;
}
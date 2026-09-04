package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_REF_SOURCE")
@Entity(name = "jb_RefSource")
@Getter
@Setter
public class RefSource extends ParentRef implements Serializable {
    private static final long serialVersionUID = 9174200415719207893L;

    @Column(name = "MACHINE_NAME")
    private String machineName;
}
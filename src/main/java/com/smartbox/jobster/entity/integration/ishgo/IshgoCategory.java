package com.smartbox.jobster.entity.integration.ishgo;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_ISHGO_CATEGORY")
@Entity(name = "jb_IshgoCategory")
@Getter
@Setter
public class IshgoCategory extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1921402278392570043L;

    @Column(name = "ISHGO_ID")
    private UUID ishgoId;

    @InstanceName
    @Column(name = "NAME")
    private String name;
}
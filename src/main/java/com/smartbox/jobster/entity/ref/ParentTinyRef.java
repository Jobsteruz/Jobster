package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.core.HasName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity(name = "jb_ParentTinyRef")
@MappedSuperclass
@Getter
@Setter
public abstract class ParentTinyRef extends ParentRef implements HasName.HasTinyName, Serializable {
    @Serial
    private static final long serialVersionUID = -7218331395439860466L;

    @Column(name = "TINY_NAME")
    protected String tinyName;
}

package com.smartbox.jobster.entity.integration.hh;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_HH_AREA", indexes = {
        @Index(name = "IDX_JB_HH_AREA_PARENT", columnList = "PARENT_ID")
})
@Entity(name = "jb_HHArea")
@Getter
@Setter
public class HHArea extends StandardEntity implements Serializable {
    private static final long serialVersionUID = 6667124850962225419L;

    @Column(name = "HH_ID")
    private Integer hhId;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private HHArea parent;
}
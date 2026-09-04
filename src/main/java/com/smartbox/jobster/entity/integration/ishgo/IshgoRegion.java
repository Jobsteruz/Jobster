package com.smartbox.jobster.entity.integration.ishgo;

import com.smartbox.jobster.entity.core.StandardEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_ISHGO_REGION", indexes = {
        @Index(name = "IDX_JB_ISHGO_REGION_PARENT", columnList = "PARENT_ID")
})
@Entity(name = "jb_IshgoRegion")
@Getter
@Setter
public class IshgoRegion extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2591504069365979525L;

    @Column(name = "ISHGO_ID")
    private UUID ishgoId;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IshgoRegion parent;
}
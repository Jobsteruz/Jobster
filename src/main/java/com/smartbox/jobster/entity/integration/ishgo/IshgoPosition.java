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
@Table(name = "JB_ISHGO_POSITION", indexes = {
        @Index(name = "IDX_JB_ISHGO_POSITION_CATEGORY", columnList = "CATEGORY_ID")
})
@Entity(name = "jb_IshgoPosition")
@Getter
@Setter
public class IshgoPosition extends StandardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4876102421049009285L;

    @Column(name = "ISHGO_ID")
    private UUID ishgoId;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IshgoCategory category;
}
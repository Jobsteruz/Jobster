package com.smartbox.jobster.entity.ref;

import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_REFERENCE", indexes = {
        @Index(name = "IDX_JB_REFERENCE_REF_GROUP", columnList = "REF_GROUP_ID"),
        @Index(name = "IDX_JB_REFERENCE_PARENT", columnList = "PARENT_ID")
})
@Entity(name = "jb_Reference")
@Getter
@Setter
public class Reference extends ParentRef implements Serializable {
    private static final long serialVersionUID = 8379011430911809840L;

    @JoinColumn(name = "REF_GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RefGroup refGroup;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reference parent;

    @Column(name = "VALUE_")
    @Lob
    private String value;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "parent")
    @OrderBy("sort, createdDate")
    private List<Reference> children;

    @InstanceName
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

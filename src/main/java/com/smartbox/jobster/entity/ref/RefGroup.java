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
@Table(name = "JB_REF_GROUP")
@Entity(name = "jb_RefGroup")
@Getter
@Setter
public class RefGroup extends ParentRef implements Serializable {
    private static final long serialVersionUID = -5921272509276501065L;

    @Column(name = "TYPE_")
    private String type;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("sort, createdDate")
    @OneToMany(mappedBy = "refGroup")
    private List<Reference> references;

    public RefType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(RefType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

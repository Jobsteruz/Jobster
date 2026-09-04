package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.HierarchicalEntity;
import com.smartbox.jobster.entity.integration.hh.HHArea;
import com.smartbox.jobster.entity.integration.ishgo.IshgoRegion;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_REGION", indexes = {
        @Index(name = "IDX_JB_REGION_PARENT", columnList = "PARENT_ID"),
        @Index(name = "IDX_JB_REGION_HH_AREA", columnList = "HH_AREA_ID"),
        @Index(name = "IDX_JB_REGION_ISHGO_REGION", columnList = "ISHGO_REGION_ID")
})
@Entity(name = "jb_Region")
@Getter
@Setter
public class Region extends ParentRef implements HierarchicalEntity, Serializable {
    @Serial
    private static final long serialVersionUID = -4743308618232243849L;

    @JoinColumn(name = "HH_AREA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private HHArea hhArea;

    @JoinColumn(name = "ISHGO_REGION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IshgoRegion ishgoRegion;

    @OnDelete(DeletePolicy.UNLINK)
    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Region parent;

    @JmixGeneratedValue
    @Column(name = "HIERARCHICAL_ID")
    private Long hierarchicalId;

    @Column(name = "HIERARCHICAL_KEY", length = 1024)
    private String hierarchicalKey;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID")
    private String platformId;

    @OrderBy("sort, name")
    @Composition
    @OneToMany(mappedBy = "parent")
    @OnDelete(DeletePolicy.CASCADE)
    private List<Region> children;

    @InstanceName
    @DependsOnProperties({"name", "hierarchicalKey"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

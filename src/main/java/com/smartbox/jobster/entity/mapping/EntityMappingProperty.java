package com.smartbox.jobster.entity.mapping;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_ENTITY_MAPPING_PROPERTY", indexes = {
        @Index(name = "IDX_JB_ENTITY_MAPPING_PROPERTY_MAPPING", columnList = "MAPPING_ID")
})
@Entity(name = "jb_EntityMappingProperty")
@Getter
@Setter
public class EntityMappingProperty extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 67961630544444436L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "MAPPING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntityMapping mapping;

    @InstanceName
    @Column(name = "KEY_", length = 512)
    private String key;

    @Column(name = "PROPERTY")
    private String property;

    @Column(name = "UNIQUE_")
    private Boolean unique;

    @Column(name = "DIGESTER")
    private String digester;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "mappingProperty")
    private List<MappingPropertyCondition> propertyConditions;
}
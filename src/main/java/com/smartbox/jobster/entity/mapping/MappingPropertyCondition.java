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
import java.util.UUID;

@JmixEntity
@Table(name = "JB_MAPPING_PROPERTY_CONDITION", indexes = {
        @Index(name = "IDX_JB_MAPPING_PROPERTY_CONDITION_MAPPING_PROPERTY", columnList = "MAPPING_PROPERTY_ID")
})
@Entity(name = "jb_MappingPropertyCondition")
@Getter
@Setter
public class MappingPropertyCondition extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -54064730593775102L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "MAPPING_PROPERTY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntityMappingProperty mappingProperty;

    @InstanceName
    @Column(name = "VALUE_", length = 1024)
    private String value;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "propertyCondition")
    private List<PropertyConditionDefault> conditionDefaults;
}
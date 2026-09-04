package com.smartbox.jobster.entity.mapping;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_PROPERTY_CONDITION_DEFAULT", indexes = {
        @Index(name = "IDX_JB_PROPERTY_CONDITION_DEFAULT_PROPERTY_CONDITION", columnList = "PROPERTY_CONDITION_ID")
})
@Entity(name = "jb_PropertyConditionDefault")
@Getter
@Setter
public class PropertyConditionDefault extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 7692126227311299733L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PROPERTY_CONDITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MappingPropertyCondition propertyCondition;

    @Column(name = "PROPERTY")
    private String property;

    @Column(name = "VALUE_", length = 1024)
    private String value;

    @InstanceName
    @DependsOnProperties({"property", "value"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.entity.mapping;

import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_ENTITY_MAPPING")
@Entity(name = "jb_EntityMapping")
@Getter
@Setter
public class EntityMapping extends ParentRef implements Serializable {
    private static final long serialVersionUID = 6496333977968954057L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "mapping")
    private List<EntityMappingProperty> mappingProperties;
}
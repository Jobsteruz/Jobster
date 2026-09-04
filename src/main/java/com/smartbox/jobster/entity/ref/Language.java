package com.smartbox.jobster.entity.ref;

import io.jmix.core.MetadataTools;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_LANGUAGE")
@Entity(name = "jb_Language")
@Getter
@Setter
public class Language extends ParentRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -7403161610527417937L;
    public static final String DEFAULT_LOCALE = "ru";

    @Column(name = "LOCALE")
    private String locale;

    @Column(name = "IS_DEFAULT")
    private Boolean isDefault;

    @Column(name = "TRANSLATABLE")
    private Boolean translatable;

    @Column(name = "NOT_VISIBLE")
    private Boolean notVisible;

    public Boolean getIsDefault() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getTranslatable() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getVisible() {
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

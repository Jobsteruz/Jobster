package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.service.GenCodeService;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;
import org.springframework.lang.NonNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity(name = "jb_SmartTenantEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class SmartTenantEntity extends StandardTenantEntity implements JbTenantEntity<UUID>, HasCode, Serializable {
    @Serial
    private static final long serialVersionUID = -380476079963798806L;

    @Column(name = "CODE")
    protected String code;

    @Convert(converter = SmartJsonConverter.class)
    @Column(name = "JSON_FIELD_VALUE", columnDefinition = "jsonb")
    @Lob
    protected String jsonFieldValue;

    @NonNull
    public JSONObject getJsonValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PostConstruct
    public void postConstruct() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PrePersist
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PreUpdate
    public void preUpdate() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

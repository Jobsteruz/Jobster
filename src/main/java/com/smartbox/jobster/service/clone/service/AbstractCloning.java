package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.ref.ParentRef;
import com.smartbox.jobster.entity.ref.Translate;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.clone.CloneContext;
import com.smartbox.jobster.service.clone.CloneService;
import io.jmix.core.Metadata;
import io.jmix.core.MetadataTools;
import io.jmix.core.SaveContext;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 7/7/2024 12:32 PM
 */
public abstract class AbstractCloning {
    protected CloneContext cloneContext;

    public AbstractCloning(@NotNull CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void copyParentRef(ParentRef source, ParentRef dest) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void copySmartTenant(SmartTenantEntity source, SmartTenantEntity dest) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends JbTenantEntity<?>> T createDestination(Class<T> entityClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Metadata metadata() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public MetadataTools metadataTools() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EntityService entityService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CloneService cloneService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TranslateService translateService() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void cloneTranslate(UUID entityId, String field, UUID destId, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

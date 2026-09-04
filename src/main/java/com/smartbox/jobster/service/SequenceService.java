package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.questionnaire.Question;
import io.jmix.core.DataManager;
import io.jmix.core.FluentValueLoader;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.multitenancy.core.TenantProvider;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.zip.CRC32;

/**
 * @author Jobster team
 * Since: 2/21/2024 2:29 PM
 */
@Service
public class SequenceService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private QueryTransformerFactory queryTransformerFactory;

    /**
     * Generate next sort value for not hierarchically entities
     */
    public <T extends JbEntity<UUID>> Integer getNextSort(Class<T> entityClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends JbEntity<UUID>> Integer getNextSort(Class<T> entityClass, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    /**
     * Generate next sort value for hierarchically entities, e.g: entity must have a 'parent' attribute
     */
    public <T extends JbEntity<UUID>> Integer getNextSort(Class<T> entityClass, T parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public <T extends JbEntity<UUID>> Integer getNextSort(Class<T> entityClass, T parent, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <T extends JbEntity<UUID>> QueryTransformer transformQuery(Class<T> entityClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getNextSortForQuestionOption(Question question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getNextSortForQuestionOption(Question question, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String crc32(UUID entityId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

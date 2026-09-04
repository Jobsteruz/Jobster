package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.$;

/**
 * @author Jobster team
 * Since: 6/21/2024 4:07 PM
 */
public interface HierarchicalEntity {
    Long getHierarchicalId();

    void setHierarchicalId(Long hierarchicalId);

    String getHierarchicalKey();

    void setHierarchicalKey(String hierarchicalKey);

    default <T extends HierarchicalEntity> void generateHierarchicalKey(T parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


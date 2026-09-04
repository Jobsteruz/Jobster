package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.entity.mapping.EntityMappingProperty;
import com.smartbox.jobster.entity.mapping.MappingPropertyCondition;
import com.smartbox.jobster.entity.mapping.PropertyConditionDefault;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.querycondition.PropertyCondition;

import java.util.List;

/**
 * @author Jobster team
 * Since: 1/29/2025 5:35 PM
 */
public class CloneMapping extends AbstractCloning implements CloneBuilder {

    private final DataManager dataManager;

    public CloneMapping(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneEntityMapping(SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneMappingProperties(EntityMapping source, EntityMapping entityMapping, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneMappingPropertyCondition(EntityMappingProperty source,
                                               EntityMappingProperty entityMappingProperty,
                                               SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clonePropertyConditionDefault(MappingPropertyCondition source,
                                               MappingPropertyCondition propertyCondition,
                                               SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.component;

import io.jmix.flowui.component.propertyfilter.PropertyFilter;
import lombok.Setter;

@Setter
public class SidebarPropertyFilter<V> extends PropertyFilter<V>  implements InMemoryFilterComponent{

    protected V defaultValue;

    @Override
    public boolean isConditionModificationDelegated() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public V getEmptyValue() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void clear() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

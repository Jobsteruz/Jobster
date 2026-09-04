package com.smartbox.jobster.component;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.vaadin.flow.component.textfield.TextField;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.filter.FilterComponent;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.logicalfilter.GroupFilter;
import io.jmix.flowui.component.logicalfilter.LogicalFilterComponent;
import io.jmix.flowui.component.propertyfilter.PropertyFilter;
import io.jmix.flowui.model.DataLoader;

import java.util.Collection;

public interface FilterEnterPressHandler {


    DataLoader getFilterDataLoader();

    GenericFilter getGenericFilter();

    void handleFilterEnterPress(String text);

    default void helpToHandleFilterEnterPress(String typedText) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static GroupFilter getInstanceNameGroupFilter(DataLoader dataLoader, String typedText) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

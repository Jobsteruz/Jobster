package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ui.Navigation;
import io.jmix.flowui.model.CollectionLoader;

/**
 * @author Jobster team
 * Since: 6/4/2024 12:22 PM
 */
public interface NavigationListView<E> extends NavigationSupport {

    CollectionLoader<E> dataLoader();

    String query();

    default void navigate(Navigation navigation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.FilterEnterPressHandler;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.FilterService;
import com.smartbox.jobster.service.NavigationService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.Subscribe;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author Jobster team
 * Since: 6/4/2024 11:39 AM
 */
@Getter
@Setter
public abstract class AbstractNavigationListView<E> extends StandardListView<E> implements NavigationListView<E>, FilterEnterPressHandler {
    private Navigation navigation;

    @Autowired
    public NavigationService navigationService;
    @Autowired
    public RoleService roleService;
    @Autowired
    public FilterService filterService;
    @Autowired
    public TranslateService translateService;

    @Override
    public @NonNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Navigation resolveNavigationFromUrl() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<E> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    @ClientCallable
    public void handleFilterEnterPress(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<E> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Kanban getKanban() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<RoleType> getRoleTypes() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<PersonStatus> getPersonStatuses() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

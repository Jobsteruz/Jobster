package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.EntityStates;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.view.MessageBundle;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * @author Jobster team
 * Since: 21/08/2024 04:35 PM
 */
public abstract class AbstractDetailView<T> extends StandardDetailView<T> {
    @Setter
    protected Kanban kanban;

    @Autowired
    protected EntityStates entityStates;
    @Autowired
    protected EntityService entityService;
    @Autowired
    protected MessageBundle messageBundle;

    public abstract String pageTitle();

    @Override
    public @NotNull String getPageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final View.QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

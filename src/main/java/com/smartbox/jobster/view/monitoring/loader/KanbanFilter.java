package com.smartbox.jobster.view.monitoring.loader;

import com.smartbox.jobster.component.SidebarPropertyFilter;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.contextmenu.MenuItem;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.filter.FilterComponent;
import io.jmix.flowui.component.filter.SingleFilterComponentBase;
import com.smartbox.jobster.view.abstractview.CustomGenericFilter;
import io.jmix.flowui.component.genericfilter.Configuration;
import io.jmix.flowui.component.genericfilter.model.FilterConfigurationModel;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.settings.ViewSettings;
import io.jmix.flowui.facet.settings.component.GenericFilterSettings;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewControllerUtils;
import lombok.Setter;

/**
 * @author Jobster team
 * date: 20/08/24 12:57
 */
@Setter
public class KanbanFilter extends CustomGenericFilter {
    private Runnable refreshRunnable;
    private Runnable applyRunnable;

    @Override
    public void apply() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void onApplyButtonClick(ClickEvent<MenuItem> clickEvent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void clearValues() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isDefaultForMeField(Configuration currentConfiguration, FilterConfigurationModel configurationModel) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

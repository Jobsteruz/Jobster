package com.smartbox.jobster.view.abstractview;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.DocumentationUrlEnum;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.security.specific.UiEditGenericFilterEnabled;
import com.smartbox.jobster.service.ViewService;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.core.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.list.CreateAction;
import io.jmix.flowui.action.list.EditAction;
import io.jmix.flowui.action.list.RemoveAction;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.gridcolumnvisibility.JmixGridColumnVisibility;
import io.jmix.flowui.component.listbox.JmixMultiSelectListBox;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author Jobster team
 * Since: 1/30/2025 8:07 PM
 */
@LookupComponent("entityDataGrid")
@DialogMode(width = "64em")
public abstract class AbstractView<E> extends AbstractNavigationListView<E> {
    private static final Logger log = LoggerFactory.getLogger(AbstractView.class);
    private String query;
    protected SubMenu subMenu;

    @Getter
    private MenuItem menuItem;

    // data grid actions
    @ViewComponent("entityDataGrid.create")
    protected CreateAction<Object> entityDataGridCreate;
    @ViewComponent("entityDataGrid.edit")
    protected EditAction<Object> entityDataGridEdit;
    @ViewComponent("entityDataGrid.remove")
    protected RemoveAction<Object> entityDataGridRemove;

    @ViewComponent
    protected CollectionLoader<E> entityDl;
    @ViewComponent
    protected SettingsFacet settings;
    @ViewComponent
    protected CustomGenericFilter genericFilter;
//    @ViewComponent
//    protected JmixMultiSelectComboBox<Object> filter;
//    @ViewComponent
//    protected Icon filterBtn;
    @ViewComponent
    protected JmixButton guideBtn;
    @ViewComponent
    protected JmixButton switchBtn;
    @ViewComponent
    protected HorizontalLayout mainBtn;
    @ViewComponent
    protected JmixGridColumnVisibility columnVisibility;

    @Autowired
    protected UserSettingsCache userSettingsCache;
    @Autowired
    protected ViewNavigators viewNavigators;
    @Autowired
    protected ViewService viewService;
    @Autowired
    protected Messages messages;

    @Override
    public CollectionLoader<E> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<E> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public abstract void startTimer();

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "guideBtn", subject = "clickListener")
    public void onGuideBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "switchBtn", subject = "clickListener")
    public void onSwitchBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isSwitchable() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildSettingsMenu() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void columnVisibilityOverlay() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    public void savePaginationPosition(String right, String bottom) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

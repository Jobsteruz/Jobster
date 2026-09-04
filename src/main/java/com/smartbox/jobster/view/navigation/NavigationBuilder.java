package com.smartbox.jobster.view.navigation;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.component.AppListMenu;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.NavigationService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.view.monitoring.AbstractMonitoring;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.flowui.kit.component.main.ListMenu;
import io.jmix.flowui.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class NavigationBuilder {
    private final RoleType role;
    private final String appUrl;
    private final String tgUrl;
    private final Boolean tgWebApp;
    private final Locale locale;

    /**
     * All child navigations of the tenant, keyed by parent id — fetched once for the whole menu
     * instead of one query per top-level item (see
     * {@link NavigationService#getChildNavigationsByParent()}).
     */
    private final Map<UUID, List<Navigation>> childrenByParent;

    private ViewService viewService;
    private TranslateService translateService;
    private NavigationService navigationService;

    private void initBean() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public NavigationBuilder(RoleType role, String appUrl, String tgUrl, String tgWebApp, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ListMenu.MenuBarItem menu(Navigation navigation, boolean refresh) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void childMenu(Navigation parent, ListMenu.MenuBarItem menuBarItem, boolean refresh) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ListMenu.MenuItem badgeMenu(Navigation navigation, Class<? extends View<?>> view, RouteParameters route, boolean refresh) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Icon icon(String name) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

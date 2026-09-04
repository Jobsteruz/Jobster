package com.smartbox.jobster.view.navigation;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.component.AppListMenu;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.superset.SupersetReportGroup;
import com.smartbox.jobster.entity.superset.SupersetReportView;
import com.smartbox.jobster.service.SupersetReportService;
import com.smartbox.jobster.service.TranslateService;
import com.vaadin.flow.component.icon.VaadinIcon;
import io.jmix.core.Messages;
import io.jmix.flowui.kit.component.main.ListMenu;

import java.util.List;
import java.util.Locale;

/**
 * Builds a single side-menu tree for Superset reports — top-level "Otcheti BI" parent with one
 * sub-item per {@link SupersetReportGroup}, each containing the group's {@link SupersetReportView}s.
 * Clicking a leaf navigates to {@code /superset-view?sid=<crcId>} so {@code SupersetView} can resolve
 * the right dashboard. {@code null} when there are no Superset groups configured for the tenant.
 */
public class SupersetMenuBuilder {

    private static final String SUPERSET_PARENT_ID = "supersetReports";

    private final RoleType role;
    private final Locale locale;

    private SupersetReportService supersetReportService;
    private TranslateService translateService;
    private Messages messages;

    public SupersetMenuBuilder(RoleType role, Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initBeans() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Build the "Otcheti BI" tree or return {@code null} when there is nothing to show
     * (no groups, or every group's reports are filtered out by role).
     */
    public ListMenu.MenuBarItem build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Empty role list ⇒ visible to all; otherwise must contain the user's role. */
    private boolean isPermitted(SupersetReportView report) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

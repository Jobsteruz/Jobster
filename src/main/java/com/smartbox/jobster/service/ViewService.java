package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.view.abstractview.NavigationSupport;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.smartbox.jobster.view.reports.AbstractReportView;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.exception.NoSuchViewException;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.settings.ViewSettings;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.LookupView;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewInfo;
import io.jmix.flowui.view.ViewRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * Since: 2/13/2024 3:38 PM
 */
@Service
public class ViewService {
    private static final Logger log = LoggerFactory.getLogger(ViewService.class);

    @Autowired
    private ViewRegistry viewRegistry;
    @Autowired
    private UserSettingsCache userSettingsCache;

    public Class<? extends View<?>> view(String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getAllViews() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getNavigationViews() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getDetailViews() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<String> getReportViews() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The chosen open mode is kept under its own user settings key instead of inside the view
     * settings JSON. That JSON is written only when the view is detached, and
     * {@code UserSettingsServiceImpl} silently skips the write once the Vaadin session is no longer
     * OPEN - so a mode picked in the gear menu was lost whenever the server was redeployed, the
     * session expired or the user simply logged out, and the view came back with the action default.
     * A dedicated key is written through to FLOWUI_USER_SETTINGS the moment the user picks a mode.
     */
    private static final String OPEN_MODE_SETTINGS_PREFIX = "openMode.";

    public OpenMode getOpenMode(View<?> origin, SettingsFacet settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setOpenMode(View<?> origin, OpenMode openMode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

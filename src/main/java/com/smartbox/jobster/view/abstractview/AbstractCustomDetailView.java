package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.security.specific.UiCustomDetailSettingEnabled;
import com.smartbox.jobster.service.ViewSettingService;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.data.renderer.TextRenderer;
import io.jmix.flowui.component.HasRequired;
import io.jmix.flowui.component.listbox.JmixMultiSelectListBox;
import io.jmix.flowui.kit.component.dropdownbutton.ComponentItem;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.cache.CacheManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.smartbox.jobster.config.caching.RedisCacheNames.VIEW_SETTINGS_CACHE;

public interface AbstractCustomDetailView {

    default void beforeShow(DropdownButton menuBar) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, ViewSettingValueDTO> loadViewSettings(ViewSettingService settingService,
                                                              CacheManager cacheManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void configureFieldsBox(JmixMultiSelectListBox<Component> fieldsBox,
                                    Map<Component, String> componentsMap,
                                    Set<Component> selectedComponents) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Set<Component> applyViewSettings(Set<Component> components,
                                             Map<String, ViewSettingValueDTO> settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void onFieldsSelectionChange(AbstractField.ComponentValueChangeEvent<?, Set<Component>> event,
                                         ViewSettingService settingService,
                                         CacheManager cacheManager) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<String, ViewSettingValueDTO> buildSettings(Set<Component> selectedComponents) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateCache(CacheManager cacheManager, Map<String, ViewSettingValueDTO> settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("ConstantConditions unchecked")
    private JmixMultiSelectListBox<Component> getFieldsBox(DropdownButton fieldsBox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    String getViewId();

    Map<Component, String> getCustomComponents();
}
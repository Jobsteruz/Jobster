package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.ui.ViewSetting;
import com.smartbox.jobster.view.abstractview.ViewSettingValueDTO;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySerialization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ViewSettingService {
    private final DataManager dataManager;
    private final EntitySerialization entitySerialization;

    public Map<String, ViewSettingValueDTO> getViewSettings(String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void saveViewSettings(String viewId, Map<String, ViewSettingValueDTO> settings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewSetting createViewSetting(String viewId, String componentId, String jsonValue) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewSettingValueDTO deserializeValue(String json) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.component.translation;


import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.component.translation.view.TranslationView;
import com.smartbox.jobster.entity.core.JbEntity;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.data.ValueSource;
import io.jmix.flowui.data.value.ContainerValueSource;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/7/2024 12:25 PM
 */
public class TranslateAreaField extends JmixTextArea {

    private boolean addedListener = false;

    @Setter
    private JbEntity<UUID> entity;
    @Setter
    private String fieldName;
    @Setter
    private String source;

    public TranslateAreaField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void onBtnClickListener(ClickEvent<?> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setValueSource(ValueSource<String> valueSource) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

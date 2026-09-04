package com.smartbox.jobster.trello.component.column;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.security.specific.UiFilterByDepartmentEnabled;
import com.smartbox.jobster.security.specific.UiSettingKanbanStageEnabled;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.trello.component.AbstractStageComponent;
import com.smartbox.jobster.trello.component.events.RebuildStageComponentEvent;
import com.smartbox.jobster.view.kanban.stage.KanbanStageDetailView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;

/**
 * @author Jobster team
 * date: 20/08/24 18:19
 */

public class KanbanColumnHeader extends AbstractStageComponent {

    private final String itemsCountId;
    private final TranslateService translateService;
    private final CurrentAuthentication currentAuthentication;
    private final UserSettingsCache userSettingsCache;

    private final Supplier<Number> currentSizeSupplier;
    private final Supplier<Number> maxStageSizeSupplier;


    public KanbanColumnHeader(KanbanStage stage,
                              Supplier<Number> maxStageSizeSupplier,
                              Supplier<Number> currentSizeSupplier) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private static @NotNull String getDefaultSizeString() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void refreshSize() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String sizeText() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

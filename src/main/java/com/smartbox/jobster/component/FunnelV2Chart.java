package com.smartbox.jobster.component;

import com.google.gson.Gson;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.DomListenerRegistration;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.shared.ui.LoadMode;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

@JavaScript(value = "./themes/jobster/js/funnel-v2-chart.js", loadMode = LoadMode.LAZY)
public class FunnelV2Chart extends VerticalLayout {
    private final List<FunnelV2ChartDTO> data;

    private final String containerId;

    public FunnelV2Chart(List<FunnelV2ChartDTO> data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void executeJs() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Registration addStageClickListener(Consumer<UUID> listener) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

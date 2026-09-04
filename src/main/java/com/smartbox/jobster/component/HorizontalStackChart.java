package com.smartbox.jobster.component;

import com.google.gson.Gson;
import com.smartbox.jobster.view.employeepipelinereport.EmployeePipelineDTO;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.function.SerializableConsumer;
import com.vaadin.flow.shared.ui.LoadMode;

@JavaScript(value = "./themes/jobster/js/horizontal-stack-chart.js", loadMode = LoadMode.LAZY)
public class HorizontalStackChart extends VerticalLayout {
    private final String name;
    private final String stageName;
    private final EmployeePipelineDTO dto;

    public HorizontalStackChart(String name, String stageName, EmployeePipelineDTO dto) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void executeJs() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

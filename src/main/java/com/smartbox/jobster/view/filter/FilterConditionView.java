package com.smartbox.jobster.view.filter;


import com.smartbox.jobster.$;
import com.smartbox.jobster.service.FilterService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.router.Route;
import io.jmix.core.Metadata;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.app.filter.condition.JpqlFilterConditionDetailView;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.entity.filter.FilterCondition;
import io.jmix.flowui.entity.filter.FilterValueComponent;
import io.jmix.flowui.entity.filter.JpqlFilterCondition;
import io.jmix.flowui.entity.filter.PropertyFilterCondition;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Route(value = "FilterConditionView", layout = MainView.class)
@ViewController("jb_FilterConditionView")
@ViewDescriptor("filter-condition-view.xml")
@DialogMode(width = "48em", height = "48em", closeOnEsc = true)
public class FilterConditionView extends StandardView {

    @Setter
    public GenericFilter genericFilter;
    @Getter
    public List<FilterCondition> selectedConditions;

    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private VerticalLayout layout;
    @ViewComponent
    private TypedTextField<String> searchField;

    @Autowired
    private FilterService filterService;
    @Autowired
    private UiComponents uiComponents;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Metadata metadata;

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initConditions(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "createCondition", subject = "clickListener")
    public void onCreateConditionClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "selectBtn", subject = "clickListener")
    public void onSelectBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Tab createTab(FilterCondition filterCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private NativeLabel tabLabel(FilterCondition filterCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private CheckboxGroup<FilterCondition> createConditionsField(List<FilterCondition> conditions) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private JpqlFilterCondition createLabelFilterCondition() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
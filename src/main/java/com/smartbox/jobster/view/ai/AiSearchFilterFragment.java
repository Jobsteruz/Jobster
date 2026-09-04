package com.smartbox.jobster.view.ai;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("ai-search-filter-fragment.xml")
public class AiSearchFilterFragment extends Fragment<HorizontalLayout> {
    @Getter
    private AiSearchField fieldValue;
    private AISearchOperator operator;

    @Autowired
    private Messages messages;

    @ViewComponent
    private JmixSelect<AiSearchField> field;
    @ViewComponent
    private JmixSelect<AISearchOperator> operatorField;
    @ViewComponent
    private Icon add;
    @ViewComponent
    private Icon clear;
    @ViewComponent
    private TypedTextField<String> aiQuery;


    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "add", subject = "clickListener")
    public void onAddClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void create(AiSearchField fieldValue, AISearchOperator operator, String aiQuery) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "clear", subject = "clickListener")
    public void onClearClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean isBuilt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getAiQuery() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public AISearchOperator getOperator() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
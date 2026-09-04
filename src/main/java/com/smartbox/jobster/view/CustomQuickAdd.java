package com.smartbox.jobster.view;

import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.view.abstractview.AbstractQuestionnaireEntityDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.MetadataObject;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.view.DetailCloseAction;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.listbox.JmixMultiSelectListBox;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.settings.ViewSettings;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class CustomQuickAdd<T extends Person> extends AbstractQuestionnaireEntityDetailView<T> {
    protected final List<String> HIDE_META_PROPERTIES = new ArrayList<>(List.of("firstName", "lastName", "phone", "region", "status", "code"));
    @Setter
    protected List<Grid.Column<T>> columns;

    @Autowired
    private Metadata metadata;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private MessageTools messageTools;

    @ViewComponent
    private DetailCloseAction<Object> closeAction;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private HorizontalLayout headerActions;
    @ViewComponent
    private JmixFormLayout form;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "close", subject = "clickListener")
    public void onCloseClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpVisibilityOfFields(ViewSettings viewSettings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull Set<MetaProperty> getMetaProperties() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    private @NotNull JmixMultiSelectListBox<MetaProperty> getListBox(Set<MetaProperty> metaProperties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addSelectedItems(Set<MetaProperty> metaProperties, ViewSettings viewSettings, JmixMultiSelectListBox<MetaProperty> listBox) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addValueChangeListener(JmixMultiSelectListBox<MetaProperty> listBox, ViewSettings viewSettings) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

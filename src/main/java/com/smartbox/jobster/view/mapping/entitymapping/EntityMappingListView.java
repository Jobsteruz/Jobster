package com.smartbox.jobster.view.mapping.entitymapping;

import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.mapping.entitymappingproperty.EntityMappingPropertyListView;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "entityMappings", layout = MainView.class)
@ViewController("jb_EntityMapping.list")
@ViewDescriptor("entity-mapping-list-view.xml")
public class EntityMappingListView extends AbstractListView<EntityMapping> {


    @Autowired
    private DialogWindows dialogWindows;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridItemDoubleClick(final ItemDoubleClickEvent<EntityMapping> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.openView")
    public void onEntityDataGridOpenView(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void viewProperty() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
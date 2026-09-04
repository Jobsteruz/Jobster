package com.smartbox.jobster.view.mapping.entitymappingproperty;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.entity.mapping.EntityMappingProperty;
import com.smartbox.jobster.entity.mapping.MappingPropertyCondition;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.MetadataObject;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@Route(value = "entity-mapping-properties", layout = MainView.class)
@ViewController("jb_EntityMappingProperty.list")
@ViewDescriptor("entity-mapping-property-list-view.xml")
@LookupComponent("mappingPropertyDataGrid")
@DialogMode(width = "64em")
public class EntityMappingPropertyListView extends StandardListView<EntityMappingProperty> {

    EntityMapping mapping = null;
    MetaClass entityClass = null;
    @Autowired
    private EntityService entityService;
    @Autowired
    private Metadata metadata;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<EntityMappingProperty> entityMappingPropertiesDc;
    @ViewComponent
    private InstanceContainer<EntityMappingProperty> entityMappingPropertyDc;
    @ViewComponent
    private InstanceLoader<EntityMappingProperty> entityMappingPropertyDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private JmixComboBox<String> propertyField;
    @ViewComponent
    private VerticalLayout conditionLayout;
    @ViewComponent
    private CollectionLoader<EntityMappingProperty> entityMappingPropertiesDl;
    @ViewComponent
    private JmixComboBox<String> childPropertyField;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("mappingPropertyDataGrid.create")
    public void onEntityMappingPropertiesDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("mappingPropertyDataGrid.edit")
    public void onEntityMappingPropertiesDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "mappingPropertyDataGrid.property", subject = "renderer")
    private Renderer<EntityMappingProperty> entityDataGridPropertyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("mappingPropertyDataGrid")
    public void onEntityDataGridItemClick(final ItemClickEvent<EntityMappingProperty> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void setPropertyField(String property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getPropertyFromField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelBtn")
    public void onCancelButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityMappingPropertiesDc", target = Target.DATA_CONTAINER)
    public void onEntityMappingPropertiesDcItemChange(final InstanceContainer.ItemChangeEvent<EntityMappingProperty> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "propertyField", subject = "itemLabelGenerator")
    private Object propertyFieldItemLabelGenerator(final String label) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "conditionsDataGrid.entityId", subject = "renderer")
    private Renderer<MappingPropertyCondition> conditionsDataGridEntityIdRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("propertyField")
    public void onPropertyFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("childPropertyField")
    public void onChildPropertyFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public String propertyItemLabel(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(EntityMappingProperty entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewValidation getViewValidation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
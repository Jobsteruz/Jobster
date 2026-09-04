package com.smartbox.jobster.view.mapping.mappingpropertycondition;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.entity.mapping.EntityMappingProperty;
import com.smartbox.jobster.entity.mapping.MappingPropertyCondition;
import com.smartbox.jobster.entity.mapping.PropertyConditionDefault;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.mapping.propertyconditiondefault.PropertyConditionDefaultDetailView;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionPropertyContainer;
import io.jmix.flowui.model.DataContext;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.UUID;

@Route(value = "mappingPropertyConditions/:id", layout = MainView.class)
@ViewController("jb_MappingPropertyCondition.detail")
@ViewDescriptor("mapping-property-condition-detail-view.xml")
@EditedEntityContainer("mappingPropertyConditionDc")
@DialogMode(width = "40em")
public class MappingPropertyConditionDetailView extends AbstractDetailView<MappingPropertyCondition> {

    private EntityMapping mapping;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private Metadata metadata;
    @Autowired
    private EntityService entityService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private DialogWindows dialogWindows;

    @ViewComponent
    private JmixComboBox<JbEntity<UUID>> entityField;
    @ViewComponent
    private DataGrid<PropertyConditionDefault> conditionDefaultsDataGrid;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionPropertyContainer<PropertyConditionDefault> conditionDefaultsDc;


    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setEntityFieldItems(String entityName, String propertyName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setFieldItems(MetaProperty property) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionDefaultsDataGrid.create")
    public void onConditionDefaultsDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("conditionDefaultsDataGrid.edit")
    public void onConditionDefaultsDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "conditionDefaultsDataGrid.property", subject = "renderer")
    private Renderer<PropertyConditionDefault> conditionDefaultsDataGridPropertyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "conditionDefaultsDataGrid.value", subject = "renderer")
    private Renderer<PropertyConditionDefault> conditionDefaultsDataGridValueRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
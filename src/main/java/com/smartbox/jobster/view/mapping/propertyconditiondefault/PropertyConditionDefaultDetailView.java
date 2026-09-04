package com.smartbox.jobster.view.mapping.propertyconditiondefault;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.entity.mapping.EntityMappingProperty;
import com.smartbox.jobster.entity.mapping.PropertyConditionDefault;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.MappingService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.annotation.Secret;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@Route(value = "propertyConditionDefault/:id", layout = MainView.class)
@ViewController("jb_PropertyConditionDefault.detail")
@ViewDescriptor("property-condition-default-detail-view.xml")
@EditedEntityContainer("propertyConditionDefaultDc")
public class PropertyConditionDefaultDetailView extends AbstractDetailView<PropertyConditionDefault> {
    private EntityMapping mappingEntity = null;
    private MetaClass mappingMetaClass = null;

    @Autowired
    private Metadata metadata;
    @Autowired
    private MappingService mappingService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private EntityService entityService;
    @Autowired
    private MessageTools messageTools;

    @ViewComponent
    private JmixComboBox<String> propertyField;
    @ViewComponent
    private TypedTextField<Object> textField;
    @ViewComponent
    private JmixComboBox<JbEntity<UUID>> comboField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build(EntityMappingProperty mappingProperty) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void initializeFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setValueField(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("propertyField")
    public void onPropertyFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "propertyField", subject = "itemLabelGenerator")
    private Object propertyFieldItemLabelGenerator(final String t) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
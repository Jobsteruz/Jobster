package com.smartbox.jobster.view.mapping.entitymapping;

import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "entityMapping/:id", layout = MainView.class)
@ViewController("jb_EntityMapping.detail")
@ViewDescriptor("entity-mapping-detail-view.xml")
@EditedEntityContainer("entityMappingDc")
@DialogMode(width = "40em", height="AUTO")
public class EntityMappingDetailView extends AbstractDetailView<EntityMapping> {

    @Autowired
    private Metadata metadata;
    @ViewComponent
    private JmixComboBox<String> entityNameField;
    @Autowired
    private EntityService entityService;
    @Autowired
    private MessageTools messageTools;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityNameField", subject = "itemLabelGenerator")
    private Object entityNameFieldItemLabelGenerator(final String t) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}

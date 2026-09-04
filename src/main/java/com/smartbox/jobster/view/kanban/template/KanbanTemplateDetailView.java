package com.smartbox.jobster.view.kanban.template;

import com.flowingcode.vaadin.addons.twincolgrid.TwinColGrid;
import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.MessageTools;
import io.jmix.core.Metadata;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.MetadataObject;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

@Route(value = "kanbanTemplates/:id", layout = MainView.class)
@ViewController("jb_KanbanTemplate.detail")
@ViewDescriptor("kanban-template-detail-view.xml")
@EditedEntityContainer("kanbanTemplateDc")
@DialogMode(width = "48em", height = "52em")
public class KanbanTemplateDetailView extends AbstractDetailView<KanbanTemplate> {
    private TwinColGrid<MetaProperty> twinColGrid;

    @ViewComponent
    private JmixComboBox<String> entityField;
    @ViewComponent
    private HorizontalLayout properties;

    @Autowired
    private Metadata metadata;
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

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityField", subject = "itemLabelGenerator")
    private String entityFieldItemLabelGenerator(final String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityField")
    public void onEntityFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
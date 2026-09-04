package com.smartbox.jobster.view.mapping.entitymapping;


import com.smartbox.jobster.$;
import com.smartbox.jobster.controller.google.GoogleSheetsController;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import com.smartbox.jobster.service.FileService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.mapping.EntityMappingTask;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.upload.SucceededEvent;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.backgroundtask.BackgroundTask;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static com.smartbox.jobster.component.ComponentUtils.notifyError;

@Route(value = "entity-mapping-view", layout = MainView.class)
@ViewController("jb_EntityMappingView")
@ViewDescriptor("entity-mapping-view.xml")
@DialogMode(width = "40em", height = "AUTO")
public class EntityMappingView extends AbstractNavigationView {

    private static final Logger log = LoggerFactory.getLogger(GoogleSheetsController.class);
    private FileRef file = null;

    @ViewComponent
    private JmixButton importBtn;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private EntityComboBox<EntityMapping> mappingField;

    @Autowired
    private Dialogs dialogs;
    @Autowired
    private FileService fileService;
    @ViewComponent
    private CollectionContainer<EntityMapping> entityDc;

    @Subscribe("upload")
    public void onUploadSucceeded(final SucceededEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "importBtn", subject = "clickListener")
    public void onImportBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setEntityMapping(EntityMapping mapping) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void createBackgroundTask(List<Map<String, String>> data) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
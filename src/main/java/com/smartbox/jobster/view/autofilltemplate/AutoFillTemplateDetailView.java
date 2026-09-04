package com.smartbox.jobster.view.autofilltemplate;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "autoFillTemplates/:id", layout = MainView.class)
@ViewController("jb_AutoFillTemplate.detail")
@ViewDescriptor("auto-fill-template-detail-view.xml")
@EditedEntityContainer("autoFillTemplateDc")
@DialogMode(width = "40em", height = "52em")
public class AutoFillTemplateDetailView extends AbstractDetailView<AutoFillTemplate> {

    @ViewComponent
    private FileStorageUploadField fileField;
    @ViewComponent
    private JmixSelect<FileType> fileTypeField;
    @ViewComponent
    private TypedTextField<String> fileIdField;
    @ViewComponent
    private JmixButton bodyInfoBtn;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onAutoFillTemplateInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fileField")
    public void onFileFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<FileStorageUploadField, FileRef> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("fileIdField")
    public void onFileIdFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean fileTypeFieldRequired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onAfterSave(final AfterSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
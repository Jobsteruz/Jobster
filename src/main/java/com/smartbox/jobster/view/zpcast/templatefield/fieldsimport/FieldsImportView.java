package com.smartbox.jobster.view.zpcast.templatefield.fieldsimport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.upload.JmixUpload;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;

import java.io.InputStream;
import java.util.List;

@Route(value = "fields-import-view", layout = MainView.class)
@ViewController("jb_FieldsImportView")
@ViewDescriptor("fields-import-view.xml")
@DialogMode(modal = true, width = "AUTO", height = "AUTO")
public class FieldsImportView extends StandardView {
    @Getter
    private List<String> list;

    @ViewComponent
    private JmixUpload upload;

    String fileName = null;
    InputStream inputStream = null;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "close", subject = "clickListener")
    public void onCloseClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "uploadButton", subject = "clickListener")
    public void onUploadButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
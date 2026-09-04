package com.smartbox.jobster.view.menu.post;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.translation.TranslateRichTextEditor;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.entity.tg.Post;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.view.*;
import org.springframework.util.unit.DataSize;


@Route(value = "posts/:id", layout = MainView.class)
@ViewController("jb_Post.detail")
@ViewDescriptor("post-detail-view.xml")
@EditedEntityContainer("postDc")
@DialogMode(width = "48em", height = "AUTO")
public class PostDetailView extends AbstractDetailView<Post> {
    @ViewComponent
    private JmixSelect<FileType> fileTypeField;
    @ViewComponent
    private FileStorageUploadField fileField;
    @ViewComponent
    private TypedTextField<String> fileIdField;
    @ViewComponent
    private Span characterCountLabel;
    @ViewComponent
    private TranslateRichTextEditor bodyField;

    private static final int MAX_LENGTH = 1024;


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

    @Subscribe("fileTypeField")
    public void onFileTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<FileType>, FileType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showNotification(String message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean fileTypeFieldRequired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateCharacterCount(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
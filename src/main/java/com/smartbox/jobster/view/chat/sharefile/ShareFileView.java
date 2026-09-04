package com.smartbox.jobster.view.chat.sharefile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.AudioPlayer;
import com.smartbox.jobster.component.VideoPlayer;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.Messages;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "share-file-view", layout = MainView.class)
@ViewController("jb_ShareFileView")
@ViewDescriptor("share-file-view.xml")
@DialogMode(width = "25em")
@Getter
@Setter
public class ShareFileView extends StandardView {
    private FileRef file;
    private FileType fileType;
    private String body;

    @Autowired
    private Messages messages;

    @ViewComponent
    private JmixTextArea caption;
    @ViewComponent
    private VerticalLayout sendFile;
    @Autowired
    private FileStorage fileStorage;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setFileLayout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "send", subject = "clickListener")
    public void onSendClick(final ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
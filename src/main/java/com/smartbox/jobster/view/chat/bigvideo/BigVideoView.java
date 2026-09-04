package com.smartbox.jobster.view.chat.bigvideo;

import com.smartbox.jobster.component.VideoPlayer;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.view.*;
import lombok.Setter;

@Route(value = "big-video-view", layout = MainView.class)
@ViewController("jb_BigVideoView")
@ViewDescriptor("big-video-view.xml")
@DialogMode(closeOnEsc = true, closeOnOutsideClick = true)
public class BigVideoView extends StandardView {
    @Setter
    private FileRef file;

    @ViewComponent
    private VerticalLayout videoContainer;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
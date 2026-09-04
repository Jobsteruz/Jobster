package com.smartbox.jobster.view.chat.bigimage;


import com.smartbox.jobster.$;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.FileRef;
import io.jmix.flowui.view.*;
import lombok.Setter;

@Route(value = "big-image-view", layout = MainView.class)
@ViewController("jb_BigImageView")
@ViewDescriptor("big-image-view.xml")
@DialogMode(closeOnEsc = true, closeOnOutsideClick = true)
public class BigImageView extends StandardView {
    @Setter
    private FileRef file;

    @ViewComponent
    private VerticalLayout img;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
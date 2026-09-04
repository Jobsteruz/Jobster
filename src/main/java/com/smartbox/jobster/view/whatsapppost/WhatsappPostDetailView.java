package com.smartbox.jobster.view.whatsapppost;

import com.smartbox.jobster.entity.whatsapp.WhatsappPost;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "whatsappPosts/:id", layout = MainView.class)
@ViewController("jb_WhatsappPost.detail")
@ViewDescriptor("whatsapp-post-detail-view.xml")
@EditedEntityContainer("whatsappPostDc")
@DialogMode(width = "40rem", height = "AUTO")
public class WhatsappPostDetailView extends AbstractDetailView<WhatsappPost> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
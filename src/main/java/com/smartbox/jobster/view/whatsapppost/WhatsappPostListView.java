package com.smartbox.jobster.view.whatsapppost;

import com.smartbox.jobster.entity.whatsapp.WhatsappPost;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "whatsappPosts", layout = MainView.class)
@ViewController("jb_WhatsappPost.list")
@ViewDescriptor("whatsapp-post-list-view.xml")
@DialogMode(width = "64em")
public class WhatsappPostListView extends AbstractListView<WhatsappPost> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
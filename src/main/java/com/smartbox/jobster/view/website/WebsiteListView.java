package com.smartbox.jobster.view.website;

import com.smartbox.jobster.entity.web.Website;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "websites", layout = MainView.class)
@ViewController("jb_Website.list")
@ViewDescriptor("website-list-view.xml")
public class WebsiteListView extends AbstractListView<Website> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
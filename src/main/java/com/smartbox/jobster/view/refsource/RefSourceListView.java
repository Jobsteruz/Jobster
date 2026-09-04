package com.smartbox.jobster.view.refsource;

import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "refSources", layout = MainView.class)
@ViewController("jb_RefSource.list")
@ViewDescriptor("ref-source-list-view.xml")
public class RefSourceListView extends AbstractListView<RefSource> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
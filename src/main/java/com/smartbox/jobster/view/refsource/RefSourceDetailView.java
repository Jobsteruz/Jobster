package com.smartbox.jobster.view.refsource;

import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "refSources/:id", layout = MainView.class)
@ViewController("jb_RefSource.detail")
@ViewDescriptor("ref-source-detail-view.xml")
@EditedEntityContainer("refSourceDc")
@DialogMode(width = "40em", height = "AUTO")
public class RefSourceDetailView extends AbstractDetailView<RefSource> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
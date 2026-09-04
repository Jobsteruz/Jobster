package com.smartbox.jobster.view.ref.reference;

import com.smartbox.jobster.entity.ref.Reference;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;

@Route(value = "references/:id", layout = MainView.class)
@ViewController("jb_Reference.detail")
@ViewDescriptor("reference-detail-view.xml")
@EditedEntityContainer("referenceDc")
@DialogMode(width = "40em", height = "AUTO")
public class ReferenceDetailView extends AbstractDetailView<Reference> {
    @ViewComponent
    private CollectionLoader<Reference> parentReferenceDl;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
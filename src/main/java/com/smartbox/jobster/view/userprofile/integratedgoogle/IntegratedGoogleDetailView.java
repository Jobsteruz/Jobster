package com.smartbox.jobster.view.userprofile.integratedgoogle;

import com.smartbox.jobster.entity.integration.IntegratedGoogle;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "integratedGoogle/:id", layout = MainView.class)
@ViewController("jb_IntegratedGoogle.detail")
@ViewDescriptor("integrated-google-detail-view.xml")
@EditedEntityContainer("integratedGoogleDc")
@DialogMode(width = "40em", height = "AUTO")
public class IntegratedGoogleDetailView extends AbstractDetailView<IntegratedGoogle> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
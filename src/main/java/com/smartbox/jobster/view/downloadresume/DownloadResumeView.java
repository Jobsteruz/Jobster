package com.smartbox.jobster.view.downloadresume;


import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "download-resume-view", layout = MainView.class)
@ViewController("jb_DownloadResumeView")
@ViewDescriptor("download-resume-view.xml")
@DialogMode(width = "30%")
public class DownloadResumeView extends StandardView {
    @Setter
    private UUID entityId;

    @Autowired
    private Downloader downloader;

    @ViewComponent
    private CollectionLoader<PersonDocument> personDocumentsDl;
    @ViewComponent
    private CollectionContainer<PersonDocument> personDocumentsDc;
    @ViewComponent
    private VerticalLayout resumes;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
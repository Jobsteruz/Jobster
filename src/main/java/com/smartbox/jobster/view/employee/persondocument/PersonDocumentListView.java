package com.smartbox.jobster.view.employee.persondocument;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.employee.AbstractPersonComponentListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Anchor;
import io.jmix.flowui.UiComponents;
import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;
import com.vaadin.flow.component.html.AnchorTarget;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Consumer;

@Route(value = "personDocuments", layout = MainView.class)
@ViewController("jb_PersonDocument.list")
@ViewDescriptor("person-document-list-view.xml")
@DialogMode(width = "64em")
public class PersonDocumentListView extends AbstractPersonComponentListView<PersonDocument> {
    @Autowired
    protected UiComponents uiComponents;
    @ViewComponent
    private CollectionLoader<PersonDocument> personDocumentsDl;
    @ViewComponent
    private CollectionContainer<PersonDocument> personDocumentsDc;
    @ViewComponent
    private VerticalLayout documents;
    @ViewComponent
    private JmixButton addDocument;
    @ViewComponent
    private H6 documentTitle;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addDocument", subject = "clickListener")
    public void onAddDocumentClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openDetail(PersonDocument personEducation, Consumer<DialogWindow.AfterCloseEvent<? extends DetailView<PersonDocument>>> consumer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildDocuments() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout buildDocumentLayout(PersonDocument personDocument) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.service.DocumentService;
import com.smartbox.jobster.view.applicant.persondocument.PersonDocumentView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@FragmentDescriptor("person-document-fragment.xml")
public class PersonDocumentFragment extends Fragment<VerticalLayout> {
    private Person person;

    @ViewComponent
    private VerticalLayout root;

    @Autowired
    private Messages messages;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Downloader downloader;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private DialogWindows dialogWindows;
    @ViewComponent
    private MessageBundle messageBundle;

    public void setPerson(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "uploadBtn", subject = "clickListener")
    public void onUploadBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout makeDocumentBox(PersonDocument document) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void deleteDocument(PersonDocument document, VerticalLayout layout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
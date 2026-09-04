package com.smartbox.jobster.view.applicant.persondocument;


import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.upload.SucceededEvent;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.core.Messages;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.upload.JmixUpload;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

@Route(value = "person-document-view", layout = MainView.class)
@ViewController("jb_PersonDocumentView")
@ViewDescriptor("person-document-view.xml")
@DialogMode(width = "32em", height = "AUTO")
public class PersonDocumentView extends StandardView {
    private static final Logger log = LoggerFactory.getLogger(PersonDocumentView.class);

    @Setter
    public Person person;
    @Getter
    public List<PersonDocument> documents;

    @ViewComponent
    private JmixComboBox<DocumentType> typeField;
    @ViewComponent
    private JmixUpload uploadField;
    @ViewComponent
    private JmixTextArea memoField;
    @ViewComponent
    private JmixButton uploadBtn;

    @Autowired
    private Messages messages;
    @Autowired
    private FileStorage fileStorage;
    @Autowired
    private DataManager dataManager;

    @Subscribe("uploadField")
    public void onUploadFieldSucceeded(final SucceededEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "uploadBtn", subject = "clickListener")
    public void onUploadBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
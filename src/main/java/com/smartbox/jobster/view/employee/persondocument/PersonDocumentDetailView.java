package com.smartbox.jobster.view.employee.persondocument;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;

@Getter
@Route(value = "personDocuments/:id", layout = MainView.class)
@ViewController("jb_PersonDocument.detail")
@ViewDescriptor("person-document-detail-view.xml")
@EditedEntityContainer("personDocumentDc")
@DialogMode(width = "40%")
public class PersonDocumentDetailView extends StandardDetailView<PersonDocument> {
    private boolean save;

    @ViewComponent
    private TextArea aiMemoField;

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
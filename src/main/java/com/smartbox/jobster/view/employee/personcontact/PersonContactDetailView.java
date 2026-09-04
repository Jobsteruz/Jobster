package com.smartbox.jobster.view.employee.personcontact;

import com.smartbox.jobster.entity.core.ContactType;
import com.smartbox.jobster.entity.core.PersonContact;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "personContacts/:id", layout = MainView.class)
@ViewController("jb_PersonContact.detail")
@ViewDescriptor("person-contact-detail-view.xml")
@EditedEntityContainer("personContactDc")
public class PersonContactDetailView extends StandardDetailView<PersonContact> {
    @Setter
    private UUID entityId;
    @Setter
    private SaveContext saveContext;

    @Autowired
    private Messages messages;
    @Autowired
    private EntityStates entityStates;

    @ViewComponent
    private JmixSelect<ContactType> typeField;
    @ViewComponent
    private InstanceContainer<PersonContact> personContactDc;


    public void beforeShow() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "delete", subject = "clickListener")
    public void onDeleteClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("typeField")
    public void onTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<ContactType>, ContactType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "typeField", subject = "renderer")
    private ComponentRenderer<Component, ContactType> typeFieldRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
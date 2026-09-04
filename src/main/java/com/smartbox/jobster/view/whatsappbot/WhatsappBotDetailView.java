package com.smartbox.jobster.view.whatsappbot;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "whatsappBots/:id", layout = MainView.class)
@ViewController("jb_WhatsappBot.detail")
@ViewDescriptor("whatsapp-bot-detail-view.xml")
@EditedEntityContainer("whatsappBotDc")
@DialogMode(width = "40em", height = "AUTO")
public class WhatsappBotDetailView extends AbstractDetailView<WhatsappBot> {


    @Autowired
    private Messages messages;
    @ViewComponent
    private JmixButton copyLink;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "copyLink", subject = "clickListener")
    public void onCopyLinkClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("phoneNumberField")
    public void onPhoneNumberFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getPhoneNumber() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setCopyLink(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    private void setCopyLink(String phoneNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
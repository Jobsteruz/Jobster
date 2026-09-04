package com.smartbox.jobster.component.composite.chat;


import com.smartbox.jobster.component.composite.ChatComponent;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.event.MessageHistoryEvent;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

@Route(value = "chat-view", layout = MainView.class)
@ViewController("jb_ChatView")
@ViewDescriptor("chat-view.xml")
@DialogMode(width = "600px", height = "auto")
public class ChatView extends StandardView {
    private ChatComponent chat;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private TenantProvider tenantProvider;

    @Setter
    private Applicant applicant;
    @ViewComponent
    private Div container;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener
    public void onMessageHistoryEvent(MessageHistoryEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
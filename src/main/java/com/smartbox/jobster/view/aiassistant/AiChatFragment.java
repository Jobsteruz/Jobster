package com.smartbox.jobster.view.aiassistant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ai.AIChat;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.ai.AiSummarizer;
import com.vaadin.flow.component.BlurNotifier;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyPressEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButtonItem;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("ai-chat-fragment.xml")
public class AiChatFragment extends Fragment<HorizontalLayout> {
    private AIChat chat;

    @Autowired
    private EntityService entityService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;
    @Autowired
    private AiSummarizer aiSummarizer;

    @ViewComponent
    private Span name;
    @ViewComponent
    private TypedTextField<String> input;


    public void beforeShow(AIChat chat) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("menuBar.edit")
    public void onMenuBarEditClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("menuBar.delete")
    public void onMenuBarDeleteClick(final DropdownButtonItem.ClickEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("input")
    public void onInputBlur(final BlurNotifier.BlurEvent<TypedTextField<String>> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("input")
    public void onInputKeyPress(final KeyPressEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveName(String newName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
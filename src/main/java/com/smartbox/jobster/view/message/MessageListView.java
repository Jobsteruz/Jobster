package com.smartbox.jobster.view.message;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Message;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.tg.TgMessageType;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.pojo.TgMessagePojo;
import com.smartbox.jobster.security.specific.UiSettingButtonEnabled;
import com.smartbox.jobster.service.MQService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.ItemClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;


@Route(value = "messages", layout = MainView.class)
@ViewController("jb_Message.list")
@ViewDescriptor("message-list-view.xml")
public class MessageListView extends AbstractListView<Message> {


    private static final Logger log = LoggerFactory.getLogger(MessageListView.class);

    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private MQService mqService;
    @Autowired
    private Dialogs dialogs;

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.message", subject = "renderer")
    private Renderer<Message> entityDataGridMessageRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridItemClick(final ItemClickEvent<Message> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "deleteMessagesBtn", subject = "clickListener")
    public void onDeleteMessagesBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("entityDataGrid.remove")
    public void onEntityDataGridRemove(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.date", subject = "renderer")
    private Renderer<Message> entityDataGridDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.sentCompletedDate", subject = "renderer")
    private Renderer<Message> entityDataGridSentCompletedDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void deleteTelegramMessages(Message message) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.create", subject = "enabledRule")
    private boolean entityDataGridCreateEnabledRule() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
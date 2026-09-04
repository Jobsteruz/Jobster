package com.smartbox.jobster.view.messagehistory;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "message-histories", layout = MainView.class)
@ViewController(id = "jb_MessageHistory.list")
@ViewDescriptor(path = "message-history-list-view.xml")
@DialogMode(width = "64em")
public class MessageHistoryListView extends AbstractListView<MessageHistory> {


    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.body", subject = "renderer")
    private Renderer<MessageHistory> entityDataGridBodyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openFullTextDialog(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridItemDoubleClick(final ItemDoubleClickEvent<MessageHistory> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
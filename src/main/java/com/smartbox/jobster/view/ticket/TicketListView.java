package com.smartbox.jobster.view.ticket;

import com.smartbox.jobster.entity.ats.Ticket;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "tickets", layout = MainView.class)
@ViewController(id = "jb_Ticket.list")
@ViewDescriptor(path = "ticket-list-view.xml")
public class TicketListView extends AbstractListView<Ticket> {

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}

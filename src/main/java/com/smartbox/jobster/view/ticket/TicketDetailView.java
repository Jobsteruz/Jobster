package com.smartbox.jobster.view.ticket;

import com.smartbox.jobster.entity.ats.Ticket;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "tickets/:id", layout = MainView.class)
@ViewController(id = "jb_Ticket.detail")
@ViewDescriptor(path = "ticket-detail-view.xml")
@EditedEntityContainer("ticketDc")
public class TicketDetailView extends StandardDetailView<Ticket> {
}
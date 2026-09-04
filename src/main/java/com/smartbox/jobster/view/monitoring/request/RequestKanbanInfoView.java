package com.smartbox.jobster.view.monitoring.request;


import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.request.fragment.VacancyInfoFragment;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "request-kanban-info-view", layout = MainView.class)
@ViewController("jb_RequestKanbanInfoView")
@ViewDescriptor("request-kanban-info-view.xml")
@DialogMode(width = "80em", height = "100%")
public class RequestKanbanInfoView extends AbstractVacancyKanbanInfoView {

    @Override
    protected void buildInfoTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
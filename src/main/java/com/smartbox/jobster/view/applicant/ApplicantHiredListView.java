package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.view.action.mass.HireActionView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Route(value = "applicantsHired", layout = MainView.class)
@ViewController(id = "jb_ApplicantHired.list")
@ViewDescriptor(path = "applicant-hired-list-view.xml")
public class ApplicantHiredListView extends AbstractApplicantListView {


    @Autowired
    protected Dialogs dialogs;
    @Autowired
    private Notifications notifications;

    @ViewComponent
    private JmixButton hireBtn;


    @Override
    public void onReady(ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onTimerTimerAction(Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.read")
    public void onEntityDataGridRead(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "hireBtn", subject = "clickListener")
    public void onHireBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
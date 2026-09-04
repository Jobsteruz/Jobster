package com.smartbox.jobster.view.bannedperson;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.BannedPerson;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.service.tg.TgUserService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.action.mass.RestoreActionView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.smartbox.jobster.view.monitoring.person.EmployeeKanbanInfoView;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


@Route(value = "banned-persons", layout = MainView.class)
@ViewController(id = "jb_BannedPerson.list")
@ViewDescriptor(path = "banned-person-list-view.xml")
public class BannedPersonListView extends AbstractListView<BannedPerson> {


    @Autowired
    private PersonService personService;
    @Autowired
    private TgUserService tgUserService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private EntityService entityService;
    @Autowired
    private DataManager dataManager;
    @ViewComponent
    private MessageBundle messageBundle;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.personId", subject = "renderer")
    private Renderer<BannedPerson> entityDataGridPersonIdRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.chatId", subject = "renderer")
    private Renderer<BannedPerson> entityDataGridChatIdRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Supply(to = "entityDataGrid.createdDate", subject = "renderer")
    private Renderer<BannedPerson> entityDataGridCreatedDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridItemDoubleClick(final ItemDoubleClickEvent<BannedPerson> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.restoreBanned")
    public void onEntityDataGridRestoreBanned(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void restore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
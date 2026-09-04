package com.smartbox.jobster.view.position;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.security.specific.UiPartnerIntegrationMatchBtnEnabled;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "positions", layout = MainView.class)
@ViewController("jb_Position.list")
@ViewDescriptor("position-list-view.xml")
public class PositionListView extends AbstractListView<Position> {


    @Autowired
    private UserService userService;
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private DialogWindows dialogWindows;
    @ViewComponent
    private Button partnerintegrationMatchBtn;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("partnerintegrationMatch")
    public void onPartnerIntegrationMatch(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("sync")
    public void onSync(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
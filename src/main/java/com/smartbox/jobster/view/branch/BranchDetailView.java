package com.smartbox.jobster.view.branch;

import com.smartbox.jobster.entity.company.Branch;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.service.BotLinkService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "branches/:id", layout = MainView.class)
@ViewController("jb_Branch.detail")
@ViewDescriptor("branch-detail-view.xml")
@EditedEntityContainer("branchDc")
@DialogMode(width = "40em", height = "AUTO")
public class BranchDetailView extends AbstractDetailView<Branch> {

    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Notifications notifications;
    @Autowired
    private BotLinkService botLinkService;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("openMapBtn")
    public void onOpenMapBtnClick(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("generateBotLinkBtn")
    public void onGenerateBotLinkBtnClick(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

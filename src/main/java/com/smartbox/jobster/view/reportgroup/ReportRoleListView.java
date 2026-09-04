package com.smartbox.jobster.view.reportgroup;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.ReportRoleCheckbox;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.report.ReportRole;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Route(value = "reportRoles", layout = MainView.class)
@ViewController("jb_ReportRole.list")
@ViewDescriptor("report-role-list-view.xml")
@DialogMode(width = "40%")
public class ReportRoleListView extends StandardListView<ReportRole> {
    @Setter
    private ReportView reportView;

    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private CollectionLoader<ReportRole> reportRolesDl;
    @ViewComponent
    private CollectionContainer<ReportRole> reportRolesDc;
    @ViewComponent
    private CollectionContainer<RoleType> roleTypesDc;
    @ViewComponent
    private HorizontalLayout reportRoleView;
    @ViewComponent
    private MessageBundle messageBundle;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "save", subject = "clickListener")
    public void onSaveClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ReportRole getReportRole(RoleType roleType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
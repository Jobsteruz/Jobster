package com.smartbox.jobster.view.reports.lookup.applicant;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;


@Route(value = "report-lookup-applicants", layout = MainView.class)
@ViewController(id = "jb_ReportLookupApplicant.list")
@ViewDescriptor(path = "report-lookup-applicant-list-view.xml")
@LookupComponent("entityDataGrid")
@DialogMode(width = "64em", closeOnOutsideClick = true, resizable = true)
@Getter
@Setter
public class ReportLookupApplicantListView extends StandardListView<Applicant> {
    String query;
    OffsetDateTime from;
    OffsetDateTime to;
    Employee manager;

    @ViewComponent
    private CollectionLoader<Applicant> entityDl;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.status", subject = "renderer")
    private Renderer<Applicant> entityDataGridStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
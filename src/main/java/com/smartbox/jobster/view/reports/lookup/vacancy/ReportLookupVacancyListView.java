package com.smartbox.jobster.view.reports.lookup.vacancy;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;


@Route(value = "report-lookup-vacancies", layout = MainView.class)
@ViewController(id = "jb_ReportLookupVacancy.list")
@ViewDescriptor(path = "report-lookup-vacancy-list-view.xml")
@LookupComponent("entityDataGrid")
@DialogMode(width = "64em", closeOnOutsideClick = true, resizable = true)
@Getter
@Setter
public class ReportLookupVacancyListView extends StandardListView<Vacancy> {
    String query;
    OffsetDateTime from;
    OffsetDateTime to;
    User author;

    @ViewComponent
    private CollectionLoader<Vacancy> entityDl;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EntityService entityService;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.priority", subject = "renderer")
    private Renderer<Vacancy> entityDataGridPriorityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requestStatus", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequestStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.condition", subject = "renderer")
    private Renderer<Vacancy> entityDataGridConditionRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requirement", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequirementRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.responsibility", subject = "renderer")
    private Renderer<Vacancy> entityDataGridResponsibilityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requiredDate", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequiredDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setAuthor(Employee author) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.component.mobile;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.RequestType;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.view.request.mobile.RequestMobileDetailView;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.view.View;
import lombok.Setter;

import java.util.Arrays;

@Setter
public class RequestCard extends VerticalLayout {
    private View<?> origin;
    private Vacancy request;
    private Kanban kanban;
    private Navigation navigation;

    public RequestCard() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RequestCard(View<?> origin, Vacancy request, Kanban kanban, Navigation navigation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

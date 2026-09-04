package com.smartbox.jobster.view.employee.personhistory;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.entity.core.PersonHistory;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.employee.AbstractPersonComponentListView;
import com.smartbox.jobster.view.employee.personeducation.PersonEducationDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.employee.personexperience.PersonExperienceDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;

import java.util.function.Consumer;


@Route(value = "personHistories", layout = MainView.class)
@ViewController("jb_PersonHistory.list")
@ViewDescriptor("person-history-list-view.xml")
@DialogMode(width = "64em")
public abstract class PersonHistoryListView<T extends PersonHistory> extends AbstractPersonComponentListView<T> {
    @ViewComponent
    private CollectionLoader<T> personHistoryDl;
    @ViewComponent
    private JmixButton addHistory;
    @ViewComponent
    private CollectionContainer<T> personHistoryDc;
    @ViewComponent
    private VerticalLayout histories;


    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addHistory", subject = "clickListener")
    public void onAddHistoryClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildHistories() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildHistoriesLayout(T history, final HorizontalLayout horizontalLayout) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openDetail(T personHistory, Consumer<DialogWindow.AfterCloseEvent<? extends AbstractDetailView<?>>> consumer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected abstract Class<T> getPersonHistoryClass();
}
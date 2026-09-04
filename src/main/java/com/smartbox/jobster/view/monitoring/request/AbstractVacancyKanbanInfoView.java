package com.smartbox.jobster.view.monitoring.request;


import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.view.comment.CommentView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.AbstractKanbanInfoView;
import com.smartbox.jobster.view.monitoring.person.KanbanInfoTab;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import lombok.Setter;

import java.util.UUID;
import java.util.function.Function;

@Route(value = "abstract-vacancy-kanban-info-view", layout = MainView.class)
@ViewController("jb_AbstractVacancyKanbanInfoView")
@ViewDescriptor("abstract-vacancy-kanban-info-view.xml")
public abstract class AbstractVacancyKanbanInfoView extends AbstractKanbanInfoView {

    @Setter
    protected KanbanInfoTab defaultTab = KanbanInfoTab.ANSWERS;

    protected Vacancy vacancy;

    @ViewComponent
    protected VerticalLayout leftBox;
    @ViewComponent
    protected VerticalLayout rightBox;

    @Override
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void buildCommentsBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addCommentBtn", subject = "singleClickListener")
    public void onAddCommentBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void hideStageHistory() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setEntity(String vacancyId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public JbEntity<UUID> getEntity() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Function<Vacancy, Void> saveHandler = (vacancy) -> {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void setupDefaultTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
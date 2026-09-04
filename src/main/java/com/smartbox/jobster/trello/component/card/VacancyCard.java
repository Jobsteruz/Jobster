package com.smartbox.jobster.trello.component.card;


import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.trello.component.events.RebuildStageComponentEvent;
import com.smartbox.jobster.view.action.mass.vacancy.RequestRejectActionView;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.html.Div;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 12/12/2024 10:48 PM
 */
public class VacancyCard extends AbstractEntityCard<Vacancy> {
    private static final Logger log = LoggerFactory.getLogger(VacancyCard.class);

    public VacancyCard(View<?> origin, Vacancy entity, KanbanStage stage, CardProperties properties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildAction(Div baseContainer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
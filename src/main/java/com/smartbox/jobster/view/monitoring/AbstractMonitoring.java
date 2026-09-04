package com.smartbox.jobster.view.monitoring;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.query_transformer.JbQueryTransformerFactory;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.FilterService;
import com.smartbox.jobster.service.LabelService;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.service.kanban.KanbanActionService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.person.PersonService;
import com.smartbox.jobster.trello.KanbanColumnInfo;
import com.smartbox.jobster.trello.TrelloLayout;
import com.smartbox.jobster.trello.component.AbstractKanbanColumn;
import com.smartbox.jobster.trello.component.card.AbstractEntityCard;
import com.smartbox.jobster.trello.component.card.AbstractKanbanCard;
import com.smartbox.jobster.trello.component.column.KanbanColumn;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import io.jmix.core.Messages;
import io.jmix.core.Metadata;
import io.jmix.data.QueryTransformerFactory;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewRegistry;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

import java.util.*;

public abstract class AbstractMonitoring<KC extends AbstractKanbanCard> extends AbstractNavigationView {
    protected static final OpenMode defaultOpenMode = OpenMode.TAB;

    @Value("${app.url}")
    protected String appUrl;

    @Getter
    protected Kanban kanban;

    @ViewComponent
    protected HorizontalLayout layout;

    @Getter
    protected TrelloLayout<KC> trelloLayout;

    @Getter
    @ViewComponent
    protected SettingsFacet settings;

    @Getter
    @ViewComponent
    protected HorizontalLayout buttonsPanel;

    @Autowired
    protected KanbanActionService kanbanActionService;
    @Autowired
    protected ViewNavigators viewNavigators;
    @Autowired
    protected KanbanService kanbanService;
    @Autowired
    protected EntityService entityService;
    @Autowired
    protected UiComponents uiComponents;
    @Autowired
    protected JbQueryTransformerFactory jbQueryTransformerFactory;
    @Autowired
    protected QueryTransformerFactory queryTransformerFactory;
    @Autowired
    protected DialogWindows dialogWindows;
    @Autowired
    protected ViewService viewService;
    @Autowired
    protected Metadata metadata;
    @Autowired
    protected FilterService filterService;
    @Autowired
    protected ViewRegistry viewRegistry;
    @Autowired
    protected Messages messages;
    @Autowired
    protected KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    protected LabelService labelService;
    @Autowired
    protected PersonService personService;

    @Getter
    protected List<KanbanStage> stages;


    protected abstract AbstractKanbanColumn getKanbanColumn(KanbanStage stage);

    // if all elements not null, the function moves cards from stage1 to stage2 and vice verse.
    // if one of cards is null, the function moves card from one stage to another
    public void swapCards(@NonNull KanbanStage stage1, Object entity1Id,
                          @NonNull KanbanStage stage2, Object entity2Id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public void rebuildColumn(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Optional<KanbanColumnInfo> getColumnInfo(KanbanStage stage) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
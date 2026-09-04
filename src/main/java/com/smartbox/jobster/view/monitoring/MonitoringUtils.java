package com.smartbox.jobster.view.monitoring;

import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.bean.query_transformer.JbQueryTransformerFactory;
import com.smartbox.jobster.bean.query_transformer.OrSupportedQueryTransformer;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.trello.component.card.AbstractEntityCard;
import com.smartbox.jobster.trello.component.column.KanbanColumn;
import io.jmix.data.QueryTransformer;
import io.jmix.data.QueryTransformerFactory;

import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;

public class MonitoringUtils {

    public static Integer getEntityIndex(KanbanColumn<AbstractEntityCard<JbEntity<UUID>>> clm, Object cardId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static QueryTransformer getStageQueryTransformer(Kanban kanban, String alias) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OrSupportedQueryTransformer getFirstStageQueryTransformer(Kanban kanban, String alias) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

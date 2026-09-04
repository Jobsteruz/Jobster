package com.smartbox.jobster.service.restservices.action;

import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.JbKanbanAction;
import com.smartbox.jobster.action.schema.ActionCatalogDto;
import com.smartbox.jobster.action.schema.StageActionConfigDto;
import com.smartbox.jobster.entity.kanban.KanbanStageAction;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.rest.annotation.RestMethod;
import io.jmix.rest.annotation.RestService;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import static org.reflections.scanners.Scanners.SubTypes;

/**
 * REST API that lets the mobile app build the stage-action dialog dynamically.
 *
 * <ul>
 *   <li>{@link #getActionCatalog()} — all action types + their input schema. Effectively static
 *       (changes only on deploy), so the client can cache it.</li>
 *   <li>{@link #getStageActions(UUID)} — the CURRENT actions configured on a given stage. Called at
 *       move time so it never goes stale; the client joins it with the cached catalog by className.</li>
 * </ul>
 *
 * Flow: card moved to stage → {@code changeStage} returns ok(null) when the stage has actions →
 * client calls {@link #getStageActions(UUID)} → renders the dialog from catalog × config → submits
 * the filled params to the (extended) {@code changeStageWithActions}.
 */
@RestService("api_ActionCatalogService")
public class RestActionCatalogService {

    @Autowired
    private Messages messages;
    @Autowired
    private DataManager dataManager;

    /** All action types with their declarative input schema (cache on the client). */
    @RestMethod
    public List<ActionCatalogDto> getActionCatalog() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** The current, configured (interactive) actions of a stage — fetched fresh at move time. */
    @RestMethod
    public List<StageActionConfigDto> getStageActions(UUID stageId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

package com.smartbox.jobster.action;

import com.smartbox.jobster.action.schema.ActionFieldDto;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.kanban.KanbanStageHistory;
import com.vaadin.flow.component.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 2/16/2024 9:46 AM
 */
public interface JbKanbanAction {
    Logger log = LoggerFactory.getLogger(JbKanbanAction.class);

    void target(JbEntity<UUID> target);

    void setParams(Map<String, String> params);

    /**
     * dialog fields' params at value change event
     */
    Map<String, String> getParams();

    void setOptParams(Map<String, String> optParams);

    /**
     * dialog fields' optional params to display before execution
     */
    Map<String, String> getOptParams();

    /**
     * displays fields to ask all necessary params
     */
    Component paramDialog(boolean execution);

    /**
     * Declarative version of the fields {@link #paramDialog(boolean)} draws, for non-Vaadin clients
     * (mobile) to render the dialog dynamically. Interactive actions override this; non-interactive
     * "Send X" actions keep the empty default. The catalog endpoint exposes it; the per-stage
     * optParams decide which of these fields are actually shown at execution.
     */
    default List<ActionFieldDto> getInputSchema() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    void execute(JbEntity<UUID> targetEntity, KanbanStageHistory stageHistory);


    static JbKanbanAction getInstance(Class<?> aClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    static JbKanbanAction getInstance(String classPath) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

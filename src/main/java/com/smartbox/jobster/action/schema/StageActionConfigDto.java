package com.smartbox.jobster.action.schema;

import java.util.Map;

/**
 * The CURRENT configuration of one action on a stage, fetched at move time (so it never goes stale).
 * The client joins it with the cached {@link ActionCatalogDto} (by {@link #className}) to know which
 * fields to render: {@link #optParams} decides which schema fields are shown, {@link #methodParams}
 * provides their pre-configured default values.
 */
public record StageActionConfigDto(
        String stageActionId,            // KanbanStageAction id — echoed back on submit
        String className,                // matches an ActionCatalogDto.className
        Integer sort,
        Map<String, String> optParams,   // enabled fields (e.g. {"vacancyLayout":"true"})
        Map<String, String> methodParams // default values (e.g. {"vacancyId":"..."})
) {
}

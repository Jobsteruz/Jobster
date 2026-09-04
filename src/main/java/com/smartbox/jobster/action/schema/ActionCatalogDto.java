package com.smartbox.jobster.action.schema;

import java.util.List;

/**
 * One entry of the action catalog returned to the mobile app: a kanban action type and its input
 * schema. The catalog is effectively static (it only changes when action classes change on deploy),
 * so the client can cache it. WHICH actions a given stage has, and which of their fields are enabled
 * (optParams), is fetched separately at move time so it never goes stale.
 */
public record ActionCatalogDto(
        String className,            // fully-qualified action class — matches KanbanStageAction.className
        String title,                // already-localized action name
        List<ActionFieldDto> fields  // empty for non-interactive "Send X" actions
) {
}

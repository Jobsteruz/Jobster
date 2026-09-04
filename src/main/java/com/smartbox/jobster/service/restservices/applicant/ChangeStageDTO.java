package com.smartbox.jobster.service.restservices.applicant;

import java.util.Map;
import java.util.UUID;

/**
 * Move a candidate/employee to another stage.
 *
 * <p>{@link #actionParams} carries the values the mobile user filled in the dynamic stage-action
 * dialog (built from {@code api_ActionCatalogService} + {@code api_ActionLookupService}). It is keyed
 * by {@code KanbanStageAction} id (the {@code stageActionId} returned by
 * {@code api_ActionCatalogService.getStageActions}) → (field key → value). These override the
 * pre-configured {@code methodParams} when the action executes. Null/absent for plain moves.
 */
public record ChangeStageDTO(String entityName, UUID entityId, UUID fromStage, UUID toStage,
                             Map<String, Map<String, String>> actionParams) {
}
